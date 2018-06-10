/*
Crea con notepad un fichero de texto con un texto cualquiera.
1. Crea un programa que codifique dicho fichero sustituyendo las vocales por números:
A,a 1
E,e 2
I,i 3
O,o 4
U,u 5
 */
package AccesoAleatorio;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

/**
 *
 * @author ASIR 7L
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        char c;
        boolean finArchivo=false;
        RandomAccessFile archivo=null;
        try{
            archivo=new RandomAccessFile("aleatorio.txt","rw");//rw es pq es de lectura y escritura
            System.out.println("El tamaño es: "+ archivo.length());
            do{
                try{
                    c=(char)archivo.readByte();//el archivo lo pasamos a bytes para que nos lea los caracteres
                    if(c=='a'||c=='A'){
                        archivo.seek(archivo.getFilePointer()-1);//para que me devuelva la posición anterior
                        archivo.writeByte('1');
                    }else if(c=='e'||c=='E'){
                        archivo.seek(archivo.getFilePointer()-1);//para que me devuelva la posición anterior
                        archivo.writeByte('2');
                    }else if(c=='i'||c=='I'){
                        archivo.seek(archivo.getFilePointer()-1);//para que me devuelva la posición anterior
                        archivo.writeByte('3');
                    }else if(c=='o'||c=='O'){
                        archivo.seek(archivo.getFilePointer()-1);//para que me devuelva la posición anterior
                        archivo.writeByte('4');
                    }else if(c=='u'||c=='U'){
                        archivo.seek(archivo.getFilePointer()-1);//para que me devuelva la posición anterior
                        archivo.writeByte('5');
                    }
                }catch(EOFException e){
                    finArchivo=true;
                    archivo.close();
                    System.out.println("Conversión realizada");
                }
            
            }while(!finArchivo);
        }catch(FileNotFoundException e1){
            System.out.println("No se encontró el archivo");
        
        }catch(Exception ex){
            System.out.println("Problemas con el archivo");
        }
        
    }
    
}
