/*
A partir de dos ficheros de texto se creará un tercer fichero cuyo
contenido se obtendrá uniendo la información de estos ficheros.
Cada línea del fichero creado estará formado por la unión de la misma
línea de los dos ficheros leídos.
Se solicitará al usuario el nombre de los ficheros y la tira de separación
entre ambas líneas.
 */
package FicherosDeTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ASIR 7L
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        String fichero1="A1.txt";
        String fichero2="A2.txt";
        String nuevoFichero="A3.txt";
        FileReader f1;// me sirve para leer el archivo 1
        FileReader f2;//me sirve para leer el archivo 2
        FileWriter fw3;// voy a escribir el fichero 3
        BufferedReader filtro1=null;// es el filtro del archivo 1
        BufferedReader filtro2=null;
        BufferedWriter filtro3=null;
        String linea1,linea2,linea3;
        
        try{    
            //lo primero es abro los archivos que tengo escritos
                f1=new FileReader(fichero1);//leo del fichero1
                f2=new FileReader(fichero2);
                //abro el tercero donde escribiré
                   fw3= new FileWriter(nuevoFichero);
                // paso el contenido de los ficheros al filtro
                filtro1=new BufferedReader(f1);
                filtro2=new BufferedReader(f2);
                filtro3=new BufferedWriter(fw3);
                //leo una linea de cada archivo
                linea1=filtro1.readLine();
                linea2=filtro2.readLine();
                //condicion para entrar a leer y a escribir
                while(linea1!=null||linea2!=null){//no puedo poner && pq no hará las comprobaciones de si tienen los mismos números de linea
                    //imprimimos las lineas y las leemos 
                    System.out.println(linea1 + " "+ linea2);
                    //si linea1 es un null lo convertirá en cadena vacía, es como un if
                    linea1=linea1==null?"":linea1;
                    linea2=linea2==null?"":linea2;
                    //concatenamos y escribimos en el filtro3  que contiene el archivo 3
                    filtro3.write(linea1 + "-"+ linea2);
                    //genera un salto de linea en el archivo  para que no lo escriba de seguido
                    filtro3.newLine();// para que se haga un salto de línea
                    // y vuelvo a leer de los archivos 1 y 2
                    linea1=filtro1.readLine();
                    linea2=filtro2.readLine();
                }
            
        
        }catch(IOException e){
            System.out.println("Error de escritura");
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

            }catch(Exception e2){
                System.out.println("");
                System.out.println(e2.getMessage());
            }
        
        }
        
        
    }
}
