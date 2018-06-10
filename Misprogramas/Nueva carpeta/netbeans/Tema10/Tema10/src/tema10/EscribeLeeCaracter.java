/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASIR 7L
 */
public class EscribeLeeCaracter {
    public static void main(String[] args) {
    Scanner lector=new Scanner(System.in);
    String nombreFichero="nuevo.txt";
    
    FileWriter fw= null;
    
        try {
            fw=new FileWriter(nombreFichero);
            char c=(char)System.in.read();//lee lo que acabo de meter por teclado
            while(c!='*'){//cuando introduzco el * se para el programa y me lo guarda
                fw.write(c);//escribo el caracter    
                c=(char)System.in.read();// leo el siguiente caracter
                
            }

        }catch(IOException e){
                System.out.println("Error al introducir los datos");
                System.out.println(e.getMessage());
        }finally{
            try{
                if(fw!=null){
                    fw.close();
                }
            }catch(Exception e2){
                System.out.println("Error al cerrar el programa");
                System.out.println(e2.getMessage());
            }
        } 
    }
    
}
