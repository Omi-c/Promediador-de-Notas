
package Parcial;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Prin {

    public static void main(String[] args) throws FileNotFoundException {
        /*tengo que crear una variable nueva del mismo tipo para guardar los datos que retornó el método
        para que se pueda ejecutar en los otros métodos
        si no los guardo entonces no se ejeucta nada
        */
  
        ArrayList<Alumnos> alumnos = ManejoAlumnos.LeerArchivo();
        ManejoAlumnos.MostrarTodo(alumnos);    }
    
}
