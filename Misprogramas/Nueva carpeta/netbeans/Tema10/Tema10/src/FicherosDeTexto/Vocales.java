/*
Adivinar cuántas filas tienen todas las vocales en una misma fila
 */
package FicherosDeTexto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ASIR 7L
 */
public class Vocales {
    public static void main(String[] args) {
        
        String fichero="vocales.txt";
        FileReader fr;
        BufferedReader filtro1=null;
        String linea;
        ArrayList<String>cadena[];
        
        try{
            //abro el fichero
            fr=new FileReader(fichero);
            //lo paso al filtro 
            filtro1=new BufferedReader(fr);
            //leo el fichero
            linea=filtro1.readLine();
            
            //ponemos la condición
            
            
        }catch(IOException e){
        
        }finally{
        
        }
        }
}
