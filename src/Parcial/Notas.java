package Parcial;

public class Notas {
    double[] notasAlumno;
    double notaFinalPromedio;
    
    //un constructor debe tener el mismo nombre de la clase a la que pertenece
    //MÉTODO 1
    public Notas (double[] notas){
        notasAlumno= notas;
        notaFinalPromedio = NotaPromedio();
    }
    
    //MÉTODO 2
    private double NotaMenor(){
        
        /*
        le doy a la variable notaMenor el valor inicial del primer valor del arreglo de todas
        las notas de ese alumno para luego irlo comparando con un for y actualizar su valor con la menor nota
        */
        double notaMenor = notasAlumno[0];
        
        for (int i = 0; i < notasAlumno.length; i++) {
            if (notasAlumno[i] < notaMenor ) {
                notaMenor= notasAlumno[i];
            }
        }
        return notaMenor;
    }
    
    //MÉTODO 3
    private double NotaMayor(){
   
        double notaMayor = notasAlumno[0];
        
        for (int i = 0; i < notasAlumno.length; i++) {
            if (notasAlumno[i] > notaMayor ) {
                notaMayor= notasAlumno[i];
            }
        }
        return notaMayor;
    }
    
    //MÉTODO 4
    private  double NotaPromedio (){
        double promedio;
        double notaMas = NotaMayor();
        double notaMenos = NotaMenor();
        
        
        //sumar las notas obtenidas
        double sumaNotas = 0;
        for (int i = 0; i < notasAlumno.length; i++) {
            sumaNotas+= notasAlumno[i];
        }
        
        promedio = (sumaNotas - notaMas - notaMenos) / (notasAlumno.length-2);
        
        return promedio;
    }
    
    //MÉTODO 5
    public double getNotaFinalPromedio() {
        return notaFinalPromedio;
    }
    
    
}
