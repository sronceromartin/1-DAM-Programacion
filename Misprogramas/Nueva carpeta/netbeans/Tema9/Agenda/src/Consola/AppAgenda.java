/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consola;

/**
 *
 * @author Siby
 */
import Modelo.Contacto;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import Controlador.GestionAgenda;


public class AppAgenda {
    static Scanner lector=new Scanner(System.in);    
    public static void main(String[] args) {
        String nombre="";
        String Apellido="";
        String telefono="";
        
        int pos=0;// lo defino aquí ya que voy a utilizarlo varias veces
        int op;// la tenemos que declarar fuera para que en el while no de error
        do{
            op=menu();//llamo al menu
            
            switch(op){
               case 1:// insertar contacto
                   //nombre
                    System.out.println("Introduce el nombre del contacto: ");                   
                    lector.nextLine();//pongo aqui la limpieza del buffer para que no me salga nombre y apellido juntos
                    nombre=lector.nextLine();//pongo después de reiniciar el buffer
                    //Apellido
                    System.out.println("Introduce el apellido del contacto: ");
                    Apellido=lector.nextLine();
                    //Telefono
                    System.out.println("Introduce el teléfono del contacto: ");
                    telefono=lector.nextLine();
                    //creamos el contacto después de introducir los datos, para que no nos dé error
                    Contacto c1=new Contacto(nombre,Apellido,telefono);
                    GestionAgenda.añadirContacto(c1);
                   break;
               case 2:// borrar contacto
                   String nAborrar;
                   System.out.println("Introduce el nombre del contacto que quieres borrar: ");
                   lector.nextLine();//pongo aqui la limpieza del buffer para que no me salga nombre y apellido juntos
                   nAborrar=lector.nextLine();
                   GestionAgenda.borrarContacto(nAborrar);
                   break;
               case 3:// buscar contacto por nombre
                   String nombreBuscado;
                   System.out.println("Introduce el nombre del contacto: ");
                   lector.nextLine();//pongo aqui la limpieza del buffer para que no me salga nombre y apellido juntos
                   nombreBuscado=lector.nextLine();
                   GestionAgenda.buscarXNombre(nombreBuscado);
                   break;
               case 4:// buscar contacto por teléfono
                   String telefonoBuscado;
                   System.out.println("Introduce el teléfono del contacto: ");
                   lector.nextLine();//pongo aqui la limpieza del buffer para que no me salga nombre y apellido juntos
                   telefonoBuscado=lector.nextLine();
                   GestionAgenda.buscarXTelefono(telefonoBuscado);
                   break;
                   
               case 5://Mostrar contacto  
                    GestionAgenda.mostrarContacto();
               case 6: //salir
                   System.out.println("Hasta pronto"); 
           }
        
           
        }while(op!=6);
       
       
       
       
    }
    
    public static int menu(){//devuelve el número que introduzco
        int opcM=0;
        boolean salir;
        do{
            try{
                System.out.println("Elige una opción: ");
                System.out.println("1-Añadir contacto \n2-Borrar contacto \n3-Buscar contacto por nombre \n4-Buscar contacto por teléfono \n5-Mostrar contacto \n6-Salir");
                opcM=lector.nextInt();
                salir=true;
            }catch(InputMismatchException e){//con este tipo de excepción se detecta cuándo un tipo de dato es incorrecto
                System.out.println("Debe indicar un número");
                lector.nextInt();// lo ponemos para formatear el buffer
                salir=false;//cuando se podruce la excepcion no se sale
            }
        
        }while(salir!=true);
        return opcM;
    }
}
