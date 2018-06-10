/*
La aplicación permitirá añadir, borrar, y buscar (lo que identifica a un contacto
es su nombre), y visualizar los elementos de la agenda
 */
package Agenda;

/**
 *
 * @author Siby
 */

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionAgenda {
    
   static Scanner lector=new Scanner(System.in);
   static ArrayList <Contacto> agenda= new ArrayList();;
    
 
    public static void escribirArchivo(){
        String fichero="AgendaContactos.txt";
        FileOutputStream fos=null;
        ObjectOutputStream filtro1=null;
        
        try{
            fos=new FileOutputStream(fichero);
            filtro1=new ObjectOutputStream(fos);
            //voy a recorrer el arrayList para meter los contactos
            for(Contacto c:agenda){// tipo que es el arrayList, lo guardo en una variable de ese tipo y pongo el nombre de mi ArrayList
                filtro1.writeObject(c);
            }
            
        }catch(IOException io){
            System.out.println(io.getMessage());
        
        }finally{
            try{
                if(filtro1!=null){
                    filtro1.close();
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void MostrarArchAgenga(){
        String fichero="AgendaContactos.txt";
        FileInputStream  fw=null;
        ObjectInputStream filtro2=null;
        
        try{
            fw=new FileInputStream(fichero);
            filtro2=new  ObjectInputStream(fw);
            //declaramos una variable auxiliar para leer el objet
            Object aux=filtro2.readObject();
            Contacto c;
            while(aux!=null){
                if(aux instanceof Contacto){
                    System.out.println(aux.toString());//leemos el objeto y lo mosttramos por pantalla
                    //creamos una variable objeto que guarde el contacto que le introduzco y me lo va a añadir al arrayList
                    c=(Contacto)aux;
                    agenda.add(c);
                }
                aux=filtro2.readObject();//vuelve a leerlo
            }
            filtro2.close();
        }catch(EOFException e1){
            System.out.println("Fin de fichero");
        }catch(IOException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {// se la he añadido para que no me de error en readObject()
           Logger.getLogger(GestionAgenda.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
            try{
                if(filtro2!=null){
                    filtro2.close();
                }
            }catch(Exception er){
                er.getMessage();
            }
        }
        
    }    
    
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
