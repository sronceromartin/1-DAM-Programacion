/*
Programa que pida un fichero origen y un fichero destino y AÑADA el
primero al segundo.
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
public class Ejercicio3 {
    public static void main(String[] args) {
        String fichero1="A1.txt";
        String nuevoFichero="anyadir.txt";
        FileWriter fw;
        FileReader fr;
        BufferedReader filtro1=null;
        BufferedWriter filtro2=null;
        String linea;
        
        try{
          // abro el fichero donde tengo el texto
          fr=new FileReader(fichero1);
          
          //abro el fichero donde voy a escribir y se pone a true para que no se sobreescriba
          fw=new FileWriter(nuevoFichero,true);// ponemos el true para que no machaque lo que ya había escrito en el fichero si quereos añadir cosas
          //lo paso los ficheros por el filtro para poder leerlo
          filtro1=new BufferedReader(fr);
          
          // paso el segundo archivo por el buffer para poder escribir en él
          filtro2=new BufferedWriter(fw);
          // leo la linea del archivo
          linea=filtro1.readLine();
          //pongo la condición para poder escribir y leer lo que se escribe
          while(linea!=null){
              // en el filtro 2 escribimos o añadimos lo que hay en linea que es lo del archivo 1
              filtro2.write(linea);
              filtro2.newLine();
              linea=filtro1.readLine();
          }
          /*
          do
          {
              linea=filtro1.readLine();
          }
          while(linea!=null);
          */
        }catch(IOException e){
            System.out.println("Error al leer el archivo");
            System.out.println(e.getMessage());
        }finally{
            try{
                if(filtro1!=null){
                    filtro1.close();
                }
                if(filtro2!=null){
                    filtro2.close();
                }
            }catch(Exception e1){
                System.out.println(e1.getMessage());
            }
            
        }
        
    }
}
