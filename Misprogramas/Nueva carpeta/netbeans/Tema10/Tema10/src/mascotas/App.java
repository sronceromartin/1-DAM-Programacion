/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASIR 7L
 */
public class App {
    
    static Scanner tec=new Scanner(System.in);
     public static void main(String[] args) throws PatasImparesException {
        int op;
        Persona p1 ;
        String opciones="1.Insertar\n "+"2.Listar\n "+"3.Vacunar\n"+"4.Salir\n";
        do{
            op=menu(opciones);
                           
            switch(op){
                case 1: 
                        p1=pedir_datos();
                        guardar(p1); 
                        break;
                case 2: 
                    listar();
                        break;
                
                case 3:
                    Vacunar.ComprobaVacuna();
                    break;
                case 4:
                    System.out.println("Hasta pronto");
                    

            }
        }while (op!=4);
        }
     
     public static int menu(String opciones){
        int opc=0; 
        boolean salir=false;
        do{
            try{
                System.out.println(opciones);
                opc=tec.nextInt();
                 salir=true;

            }catch(Exception e){
                System.out.println("Error al introducir la opcion"); 
                
            }    
        }while(salir!=true);
        return opc;
     }   
    public static Persona pedir_datos() throws PatasImparesException{
        
        String nom, ape, dni, nomMasc,tipoAnimal,codigo;
        int edad, patas=0;
        boolean vacunado=false;
        boolean anillado=false;
        char resp='c';
        String fecha;
        Date fechaD;
        tec.nextLine();
        System.out.println("dni:");
        dni=tec.nextLine();
        System.out.println("Nombre:");
        nom=tec.nextLine();
        System.out.println("Apellidos:");
        ape=tec.nextLine();
        System.out.println("Edad:");
        edad=tec.nextInt();
        tec.nextLine();
        System.out.println("Tienes mascota?(S/N)");
        do{
            try{
                resp=(char)System.in.read();
            }catch(IOException e){
                    System.out.println("Error de lectura de teclado");
            }
        }while(resp!='s'&&resp!='S' && resp!='N'&& resp!='n');
            if(resp=='S' || resp=='s'){
                tec.nextLine(); 
                System.out.println("Es un perro o un pajaro?(perro/pajaro)");
                tipoAnimal=tec.nextLine();
                if(tipoAnimal.equals("perro")){
                    System.out.println("Nombre mascota:");
                    nomMasc=tec.nextLine();
                    Perro perro=null;// lo inicializo
                    do{
                        try{
                            System.out.println("Num patas:");
                            patas=tec.nextInt();
                            perro=new Perro(nomMasc,patas);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                    }while(patas%2!=0);    
                    tec.nextLine();
                    System.out.println("¿Está vacunado?(s/n)");
                    resp=tec.next().charAt(0);
                    if(resp=='s'||resp=='S'){
                        vacunado=true;
                        System.out.println("Introduzca la fecha de vacunación: ");
                        tec.nextLine();
                        fecha=tec.nextLine();
                        fechaD=ParseFecha(fecha);//lo utilizo para pasar a fecha
                        perro.setVacunado(vacunado);// para guardar si está vacunado
                        perro.setFecha(fechaD);// para guardar la fecha de vacunación
                    }else{
                        vacunado=false;
                        System.out.println("Debes vacunarlo");
                        perro.setVacunado(vacunado);
                    }
                    tec.nextLine();
                    Persona p=new Persona(dni,nom,ape,edad);
                    p.addMascota(perro);
                    return p;
                }else if(tipoAnimal.equals("pajaro")){
                    System.out.println("Nombre mascota:");
                    nomMasc=tec.nextLine();
                    Pajaro pajarito=null;//lo inicializo para que no de problemas
                    do{
                        try{
                            System.out.println("Num patas:");
                            patas=tec.nextInt();
                            pajarito=new Pajaro(nomMasc,patas);//ponemos el constructor pq es desde donde se propaga la excepcion
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                    }while(patas%2!=0); 
                    
                    System.out.println("¿Está anillado?(s/n)");
                    if(resp=='s'||resp=='S'){
                        anillado=true;
                        System.out.println("Introduzca el código: ");
                        codigo=tec.nextLine();
                        pajarito.setAnillado(anillado);
                        pajarito.setCodigo(codigo);
                    }else{
                        System.out.println("No está anillado");
                    }
                    
                    Persona p=new Persona(dni,nom,ape,edad);
                    p.addMascota(pajarito);
                    return p;
                }else{
         
                    return new Persona(dni,nom,ape,edad);
                }
            }else{
                return new Persona(dni,nom,ape,edad);
            }   
        
    }
    public static void guardar(Persona p){//es lo mismo que insertar
        String fichero="Mascotas.dat";
        File f=new File(fichero);
        FileOutputStream fos=null;
        MiObjectOutputStream moos=null;
        ObjectOutputStream oos=null;
        try{
            
            if(f.exists()){
                fos=new  FileOutputStream(fichero,true);
               moos =new MiObjectOutputStream(fos);
               moos.writeObject(p);
               System.out.println("Guardado"+ p.toString());
               
            }else{//si no le añado la cabecera
               fos=new FileOutputStream(fichero,true); // lo pongo también aqui pq puede ser que el fichero no esté creado aún
               oos=new ObjectOutputStream(fos);  
               oos.writeObject(p);     
               System.out.println("Guardado"+ p.toString());
              
            }
        }catch(IOException io){
            System.out.println(io.getMessage());
        }finally{
            try{
                if(moos!=null){
                    moos.close();
                }
                if(oos!=null){
                    oos.close();
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        
        }
    } 
    public static void listar(){
        String fichero="Mascotas.dat";
        FileInputStream fis=null;
        ObjectInputStream filtro=null;
        try{
            fis=new FileInputStream(fichero);
            filtro=new ObjectInputStream(fis);
            Object aux;
            try{
                aux=filtro.readObject();
                while(aux!=null){
                    if(aux instanceof Persona){
                        System.out.println(aux.toString());//lo muestro por pantalla
                    }
                    aux=filtro.readObject();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }catch(IOException io){
            System.out.println(io.getMessage());
        }finally{
            try{
                if(filtro!=null){
                    filtro.close();
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        
    }
    public static Date ParseFecha(String fecha){
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
        Date fechaD=null;
        try{
            fechaD=formato.parse(fecha);
        }catch(ParseException e){
            System.out.println(e.getMessage());
        }
        return fechaD;
    }
}

//redefinimos el objeto 
class MiObjectOutputStream extends ObjectOutputStream{
    
    public MiObjectOutputStream(OutputStream out)throws IOException{
        super(out);
    }
     public MiObjectOutputStream() throws IOException,SecurityException{
         super();
     }
    @Override
     protected void writeStreamHeader() throws IOException{
     
     } 

}


