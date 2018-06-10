/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10;

/**
Crear un fichero de texto con el texto
introducido por teclado (acabando con un *)
Para leer cada carácter de teclado utilizaremos
la siguiente instrucción:
(char)System.in.read();
Escribir el contenido de dicho fichero en
pantalla
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;// para escribir
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribeLeeBinario {
    public static void main(String[] args) {
        String nFichero="Binario.txt";
        FileOutputStream fis=null;
        
        try{
            fis=new FileOutputStream(nFichero);
            byte b=(byte)System.in.read();//lee lo que acabo de meter por teclado
            while(b!='*'){
                fis.write(b);
                b=(byte)System.in.read();
            
            }
            
        }catch(IOException e){
            System.out.println("Error al introducir los datos");
            System.out.println(e.getMessage());
        }finally{
            try{
                if(fis!=null){
                    fis.close();
                }
            }catch(Exception e2){
                System.out.println("Error al cerrar el fichero");
                System.out.println(e2.getMessage());
            }
        
        }
        
    }
}   
