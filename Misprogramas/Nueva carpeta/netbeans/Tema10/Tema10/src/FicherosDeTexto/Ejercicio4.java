/*
A partir de dos ficheros de texto se creará un tercer fichero cuyo
contenido se obtendrá uniendo la información de estos ficheros.
Las líneas del fichero creado contendrán todas las combinaciones de
líneas del primer fichero con las líneas del segundo. Se solicitará al
usuario el nombre de los ficheros y la tira de separación entre ambas
líneas.
Para cada línea del primer fichero recorreremos el 2ndo fichero entero.
Y querremos volver al principio. Tendremos en cuenta lo siguiente:
//Sea “ficero2.txt” el segundo fichero
 File f=new File("fichero2.txt");
//sea rf2 el filtro BufferedWriter que hemos creado para el fichero “fichero2.txt”
 rf2.mark((int)f.length()+1); //Esta instrucción marca la posición actual del
Stream
Si hacemos esto antes de leer nada del segundo fichero, tendremos
marcado el principio y cuando nos haga falta, con la instrucción
Ff2.reset();
Volveríamos a la posición marcada.
 */
package FicherosDeTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Siby
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        String fichero1="fichero1.txt";
        String fichero2="fichero2.txt";
        String fichero3="fichero3.txt";
        //son los ficheros que tengo que leer
        FileReader f1;
        FileReader f2;
        //es el fichero que tengo que escribir
        FileWriter f3;
        //filtros para leer los archivos 1 y 2
        BufferedReader filtro1=null;
        BufferedReader filtro2=null;
        //filtro para escribir en el archivo 3
        BufferedWriter filtro3=null;
        String linea1,linea2,linea3;
        
        try{
            f1=new FileReader(fichero1);
            f2=new FileReader(fichero2);
            f3=new FileWriter(fichero3);
            filtro1=new BufferedReader(f1);
            filtro2=new BufferedReader(f2);
            filtro3=new BufferedWriter(f3);
            // leola primera linea del primero
            linea1=filtro1.readLine();
            File f=new File("fichero2.txt");
            filtro2.mark((int)f.length()+1);// me marca la posición donde se ha quedado
            //recorre la primera linea del archivo 1
            while(linea1!=null){ 
                linea2=filtro2.readLine();
            // pongo la condición para que si tienen lineas de texto en los archivos puedan escribirse
                 while( linea2!=null){
                //imprimimos el texto de un fichero con el otro
                 filtro3.write(linea1+ "-"+ linea2);
                 filtro3.newLine();
                //vuelvo a leer el contenido de los filtros
                 linea2=filtro2.readLine();
                }
                filtro2.reset();
                linea1=filtro1.readLine();
            }
        
        }catch(IOException e){
            System.out.println("Error de lectura");
            System.out.println(e.getMessage());
            
        }finally{
            try{
                if(filtro1!=null){
                    filtro1.close();
                }
                if(filtro2!=null){
                    filtro2.close();
                }
                if(filtro3!=null){
                    filtro3.close();
                }
                
            }catch(Exception e){
                System.out.println("Error al cerrar los filtros");
                System.out.println("e.getMessage()");
            }
        
        }
        
    }
}
