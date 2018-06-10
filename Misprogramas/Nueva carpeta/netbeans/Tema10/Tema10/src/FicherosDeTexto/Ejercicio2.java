/*
Programa que a partir de un fichero dado, devuelva su número de
líneas y la longitud de cada una de ellas.
 */
package FicherosDeTexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ASIR 7L
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String fichero="A1.txt";
        FileReader fr=null;
        BufferedReader filtro=null;
        String linea; //linea que va a ser leida para hacer el recuento
        int nfilas=0;// es el contador que cuenta las lineas
        
        try{
            //abro el archivo y lo leo
            fr=new FileReader(fichero);
            //paso el contenido del archivo al filtro
            filtro=new BufferedReader(fr);
            //leo la primera línea del archivo
            linea=filtro.readLine();
            
            //ponemos la condicion
            while(linea!=null){
                 nfilas++;//me cuenta el número de lineas, lo tengo que poner aquí
                System.out.println(linea);// imprimimos la linea
                
                System.out.println("La longitud de la linea es: "+ (linea.length()));// ponemos el más 1 pq empieza en 0 la posicion
               //vuelvo a leer el archivo
                linea=filtro.readLine();
            }
            
            System.out.println("El número de filas es: "+ nfilas);
        
        }catch(IOException ex){
            System.out.println("Error al leer el fichero");
            System.out.println(ex.getMessage());
    
        }finally{
            try{
                if(filtro!=null){
                    filtro.close();
                }else{
                    System.out.println("Error al cerrar el fichero");
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }    
                
        }
        
    }
}
