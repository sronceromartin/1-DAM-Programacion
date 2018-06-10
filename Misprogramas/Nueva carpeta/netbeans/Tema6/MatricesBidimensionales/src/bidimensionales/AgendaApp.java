/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidimensionales;

/**
 *
 * @author Siby
 */
import java.util.Scanner;
public class AgendaApp {
    static Contacto contactos[]=new Contacto [10];
    static int numEle=0;
    
    public static void eleminarElemento(int pos){//no hace falta que le pase como parámetro el vector ya que está como static en la clase
       int i;
      
        if(numEle>pos){
          for(i=pos;i<numEle-1;i++) 
              contactos[i]=contactos[i+1];
          
            contactos[numEle-1]=null;//el último elemento tiene que ser un null, ya que no tiene que tener elemento
            numEle--;//decrementa ya que se queda un hueco al eliminar uno
        }
    }
    public static void insertarElemento(Contacto c){
      //Cuando los datos no están ordenados
       //contactos[numEle]=c;
       //numEle++;
       //cuando los datos  están ordenados
       /* if(numEle==0){//caso 0
            contactos[0]=c;
            numEle++; //se incrementa
        }else if(numEle==1){//caso 1 en la posicion 1, cuando hay dos elementos
            String telf1=contactos[0].telefono;//se coge el de la clase contacto
            String telf2=c.telefono;//el telefono2 está almacenado en una variable por eso ponemos el nombre de la variable "c" y lo que queremos "telefono"
            if(telf1.compareTo(telf2)<0){
                // el  nuevo va detras
                contactos[1]=c;
            }else{
                // el nuevo va delante
                contactos[1]=contactos[0];
                contactos[0]=c;
        }*/
        if(numEle<contactos.length){
            if(numEle==0){//caso 0
                contactos[0]=c;
            }
            else{
            int i;
                for(i=numEle;i>0;i--){//es numEle -1 ya que empezamos en la posisicion 0
                    String telf1=contactos[i-1].telefono;
                    String telf2=c.telefono;
                    if(telf1.compareTo(telf2)<0){
                        contactos[i]=c;
                        break;
                    }else{
                        contactos[i]=contactos[i-1];
                        contactos[i-1]=c;
                    }
                } 
            }   
            
            numEle++;
        }
    }
    public static void yaExiste(String telf){
        boolean yaExiste=true;
        int i;
        for(i=0;i<contactos.length && yaExiste;i++){
            telf.equals(contactos[i].telefono);
            yaExiste=false;
            
        
        
        }
        
        
    
    }
    
    //ver contactos
        public static void verContactos(){
            int i;
            for(i=0;i<contactos.length;i++){
                if(contactos[i]!=null){
                    System.out.println("\t"+ contactos[i].toString());
                }    
            }
            
    
        }
    public static void main(String[] args) {//lista de contactos
        
        String nom="";
        String apell1="";
        String apell2="";
        String telf="";
        int f;
        int opcion;
        do{
            Scanner lector=new Scanner(System.in);
            
            System.out.println("Introduce una opción: ");
            opcion=lector.nextInt();
            switch(opcion){
                    case 1://añadir un contacto
                        System.out.println("1.Insertar contacto"+ "\n"+ "2.Eliminar contacto"+ "\n"+ "3.Buscar por nombre"+"\n"+"4.Buscar por nombre"+"\n"+"5.Salir" );
                        yaExiste(telf);
                        for(f=0;f<2;f++){//para que solo se me ejecute una vez
                            System.out.println("Nombre: ");
                            nom=lector.nextLine();
                            System.out.println("Apellido 1: ");
                            apell1=lector.nextLine();
                            System.out.println("Apellido 2: ");
                            apell2=lector.nextLine();
                            System.out.println("Teléfono: ");
                            telf=lector.nextLine();
                            Contacto c=new Contacto(nom,apell1,apell2,telf);//si quiero crear un objeto tengo que ponerle el new
                            insertarElemento(c);    
                        }
                            
                            break;
                            
                    case 2://eliminar contacto
                        System.out.println("2.Eliminar contacto");
                        System.out.println("Telefono a eliminar: ");
                        yaExiste(telf);
                            eleminarElemento(0);
                            break;
                    case 3://Buscar por nombre
                        
                        
            
        
            
        }
        }while (opcion!=5);
        verContactos();
        
        verContactos();
        //System.out.println("f: "+ f); // 10
        
    
    }
}
