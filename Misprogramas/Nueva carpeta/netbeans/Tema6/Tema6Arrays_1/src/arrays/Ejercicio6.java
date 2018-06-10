/*
a. Crear una clase Alumno  con 2 atributos : 
 nombre, de tipo String 
 nota, de tipo float 
b. Crear u programa  principal que defina un array de alumnos, inicialice sus elementos (nombre y nota para cada uno de ellos) y los muestre por pantalla 
 
 */
package arrays;
import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        String nombre;
        
        Alumno alumno[]=new Alumno[10];
        Alumno al;//objeto de la clase alumno
        int i;
        for(i=0;i<alumno.length;i++){//se utiliza para que me pida el nombre y para que se vaya almacenando en el array
            System.out.println("Introduce un nombre: ");
            nombre=lector.nextLine();
            al=new Alumno(nombre,(float)Math.random()*10);//declaramos el objeto
            alumno[i]=al;
        }
        for(i=0;i<alumno.length;i++){
            System.out.println("Alumno: "+ alumno[i].getNombre()+ " nota: " + alumno[i].getNota());
        }
        
        
    }
}
