/*
Ampliación (Tras ver los filtros DataInputStream y DataOutùtStream) para los ficheros binarios
Amplia el ejercicio anterior para que al comenzar se carguen los datos de un fichero
(carrera.dat), si existe, y al finalizar el programa se guarden en él.
 */
package FicherosDeTexto;

import static FicherosDeTexto.XML.guardarDatos;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author ASIR 7L
 */
public class Participantes implements Comparable{
   
    private String nombre;
    private int dorsal;
    
    public Participantes(String nom,int dorsal){
        this.nombre=nom;
        this.dorsal=dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.dorsal;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Participantes other = (Participantes) obj;
        if (this.dorsal != other.getDorsal()) {
            return false;
        }
        return true;
    }

    public int compareTo(Object p) {
        Participantes p1=(Participantes)p;//downCasting
        if(this.dorsal >p1.getDorsal()){
            return 1;
        }else if(this.dorsal==p1.getDorsal()){
            return 0;
        }
        return -1;
    }
    
    
    
    public String toString(){
        return "Nombre: "+ this.getNombre() + "Dorsal: " + this.getDorsal();// con el this es como llamar a 
    
    }
    

}

class XMLBIS {
     static Scanner lector=new Scanner(System.in);
     static TreeSet<Participantes>participa=new TreeSet();// lo sacamos fuera para poder utilizarzo en el menu
    public static void main(String[] args) throws Exception {
        
        boolean finalizar=false;
        String nombre;
        int dorsal=0;
        Participantes p;
        int opc=0;
        do{
            cargarFichero();
            opc=menu();
            // no hacemos comparación de los dorsales aquí ya que con el equals y hashcode compara y no dejan que se repitan los dorsales, están en la clase participante
            switch(opc){
                case 1://Introducir datos
                    lector.nextLine();
                    System.out.println("Introduzca su nombre: ");
                    nombre=lector.nextLine();
                    System.out.println("Introduzca el dorsal: ");
                    dorsal=lector.nextInt();
                    p= new Participantes(nombre,dorsal);
                    if(participa.add(p)==true){
                        System.out.println("El participante ha sido añadido");
                    }else{
                        System.out.println("El dorsal está repetido");
                    }
                       break;
               
                
                case 2:
                   System.out.println("Hasta pronto");
                   guardarDatos();
                   finalizar=true;   
            }
        }while(finalizar!=true);
    }
    public static int menu(){
        int opcion;
        //recorro la lista para imprimir su contenido antes de que salga el menú al usuario
        System.out.println("---Estos son los participantes---");
        Iterator <Participantes> ir=participa.iterator();
        while(ir.hasNext()){
            System.out.println(ir.next());
        }
        System.out.println("Introduzca la opción que desee: \n"+ "1-Introducir datos\n "+ "2-Salir\n ");
        opcion=lector.nextInt();
        return opcion;
    }
    
    public static void guardarFicheroBinario(){
        String fichero="carrera.dat";
        //1º escribo en el fichero binario
      
  FileOutputStream fs;
        DataOutputStream filtro=null;//inicializo para que no de error
        
        
        try{
            fs= new FileOutputStream(fichero);
            filtro=new DataOutputStream(fs);
            //utilizo un iterator para que me recorra el TreeSet
            Iterator <Participantes> ir=participa.iterator();
            while(ir.hasNext()){
               Participantes p=ir.next();//guardo al participante en la variable p
               //escribo en el binario
               filtro.writeUTF(p.getNombre());// me escribe los nombres en todo el fichero
               filtro.writeInt(p.getDorsal());// el dorsal para que se me salga en el archivo tengo que ponerlo como un String, para ello tengo que concatenarlo
            }
            
        }catch(IOException e){
            System.out.println("Error al cargar el fichero");
            System.out.println(e.getMessage());
        
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
    public static void cargarFichero(){
        //Carga de datos mediante un read si los hay
        String fichero="carrera.dat";
        FileInputStream fi;
        DataInputStream filtro2=null;
        String linea,linea2;
        //leemos del fichero
        try{
            while(filtro2.available()!=0){//si es diferente de 0 significa que hay datos en el fichero
                fi=new FileInputStream(fichero);
                filtro2=new DataInputStream(fi);
                Participantes p2=new Participantes(filtro2.readUTF(),filtro2.readInt());
                participa.add(p2);
            }
            //mostrar el TreeSet
            Iterator <Participantes> ir=participa.iterator();
            while(ir.hasNext()){
                System.out.println(ir.next());
            }
            
        }catch(IOException e){
            System.out.println("Error al leer el archivo");
            System.out.println(e.getMessage());
        }finally{
            try{
                if(filtro2!=null){
                    filtro2.close();
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }        
        }
    
    }
}    
    