
package Parcial;

public class Alumnos {
    private String nombreAlumno;
    
    //mi variable tipo de la clase notas solamente puede recibir objetos para funcionar 
    Notas notas;
    
    
    //MÉTODO 1. CONSTRUCTOR
    public Alumnos (String nombreAlumno, Notas notas){
        this.nombreAlumno = nombreAlumno;
        this.notas = notas;
        
    }
    
    //MÉTODO 2
    public void Mostrar(){
        System.out.printf("%-20s", nombreAlumno);
        System.out.printf("%-12.2f", notas.notaFinalPromedio);
        
        if (notas.notaFinalPromedio >= 10) {
            System.out.printf("%7s %n", "Aprobado");
        } else{
            System.out.printf("%7s %n", "Reprobado");
        }
    }
}
