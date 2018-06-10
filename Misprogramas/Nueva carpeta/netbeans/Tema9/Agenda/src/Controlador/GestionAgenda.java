/*
La aplicación permitirá añadir, borrar, y buscar (lo que identifica a un contacto
es su nombre), y visualizar los elementos de la agenda
 */
package Controlador;

/**
 *
 * @author Siby
 */
import Modelo.Contacto;
import Consola.AppAgenda;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GestionAgenda {
    
   static Scanner lector=new Scanner(System.in);
   static ArrayList <Contacto> agenda= new ArrayList();;
    
 
    
 
    
    //Creamos un método para añadir el contacto al arrayList de la agenda
    
    public static void añadirContacto(Contacto c){
        agenda.add(c);
    }
   
    public static void borrarContacto(String nombre){
        Iterator <Contacto> it=agenda.iterator();
        while(it.hasNext()){// mientras haya un elemento en el array después de donde se haya quedado
            if(it.next().nombre.equalsIgnoreCase(nombre)){
                it.remove();
            }
        }
    }
    
    public static void buscarXNombre(String nombre){
        Iterator <Contacto> it=agenda.iterator();
        int i=0;
        while(it.hasNext()){// mientras haya un elemento en el array después de donde se haya quedado
            if(it.next().nombre.equalsIgnoreCase(nombre)){
                System.out.println(agenda.get(i).toString());
            }else{
                       System.out.println(nombre + " no se ha encontrado");
            }
                   
        i++;// para que recorra el arrayList    
        }
    }

    public static void buscarXTelefono(String telefono){
        Iterator <Contacto> it=agenda.iterator();
        int i=0;
        while(it.hasNext()){// mientras haya un elemento en el array después de donde se haya quedado
            if(it.next().telefono.equals(telefono)){
                System.out.println(agenda.get(i));
            }else{
                       System.out.println(telefono + " no se ha encontrado");
            }
                   
        i++;// para que recorra el arrayList    
        }
    }
    
    public static void mostrarContacto(){
        int i;
        
        for(i=0;i<agenda.size();i++){
            
        }
        System.out.println(agenda.toString());
        
        /*Iterator <Contacto> it=agenda.iterator();
        int i=0;
        while(it.hasNext()){// mientras haya un elemento en el array después de donde se haya quedado
            System.out.println(it.next());
         
                   
        i++;// para que recorra el arrayList    
        }*/
    
    }

}
