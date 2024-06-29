package Parcial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class ManejoAlumnos {

    public static ArrayList LeerArchivo() throws FileNotFoundException {
        Scanner lector = new Scanner(new File("Evaluaciones.txt"));

    //lista de objetos que guardarán nombre y notas de cada alumno
        ArrayList<Alumnos> contenido = new ArrayList<>();

        while (lector.hasNextLine()) {
            String linea = lector.nextLine();
            //va a separar los datos
            String[] datos = linea.split(",");

            String nombre = datos[0]; //tomo el nombre que es el primer dato
            double[] notasTodas = new double[datos.length - 1]; //datos-1 para comenzar desde los numeros y no desde el nombre

            //asignamos las notas en donde deben estar
            for (int i = 1; i < datos.length; i++) {
                //-1 para que cuadre perfectamente cada posicion
                notasTodas[i - 1] = Double.parseDouble(datos[i]);
            }

            //Creando un objeto que tendrá todas las notas dentro
            Notas notasObjeto = new Notas(notasTodas);

            //Creando un objeto de tipo alumno que tendrá cada alumno con sus notas correspondientes
            Alumnos alumno1 = new Alumnos(nombre, notasObjeto);

            //agregamos cada alumno nuevo al arraylist
            contenido.add(alumno1);
        }        
        return contenido;
    }

    public static void MostrarTodo(ArrayList<Alumnos> contenido) {
        System.out.printf("%-20s", "Nombre");
        System.out.printf("%-11s", "Nota F");
        System.out.printf("%7s %n", "Status");
        
        //quiero imprimir el metodo mostrar de cada alumno
        for (int i = 0; i < contenido.size(); i++) {
            //un ciclo for para recorrer mi lista de objetos con cada alumno y decirle a cada alumno que ejecute su método mostrar
            contenido.get(i).Mostrar();
        }
    }
}
