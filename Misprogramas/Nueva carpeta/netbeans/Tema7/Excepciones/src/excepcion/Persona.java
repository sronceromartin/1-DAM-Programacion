/*
Crear la clase persona con 2 atributos: nombre(String) y edad (int)
Los métodos serán:
◦ constructor al que se le pasa el nombre
◦ ponerEdad(int edad) y que comprueba si la edad está entre 0 y 100 y si no, lanza una
excepción con el mensaje “Edad incorrecta”
◦ toString que muestra nombre y edad
Crear la clase PruebaEdad para probar la anterior con un método main que:
• Pida el nombre
• Cree la persona
• Pida la edad y se la pase al objeto creado (esto se repetirá mientras la edad no
sea válida)
 */
package excepcion;

/**
 *
 * @author Siby
 */
import java.util.Scanner;
import java.lang.Exception;

public class Persona {
    String nombre;
    int edad;
    
    public Persona(String nombre){
        this.nombre=nombre;
    
    }
    public  void ponerEdad(int e)throws EdadException{//EdadException es la excepción
        
            
        if(e<0 || e>100){ //una persona no puede tener a la vez dos edades
                throw new EdadException("Edad incorrecta");
        }else{
                edad=e;
        }   
    }
    public  String toString(){
    
        return "Nombre"+ nombre + "Edad" + edad;
    }
            
            
        
        
    
   
        
        
    
}
        

