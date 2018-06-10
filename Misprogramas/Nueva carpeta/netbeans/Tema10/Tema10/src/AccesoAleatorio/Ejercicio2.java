/*
2. Crea un programa que pida una palabra, la busque en dicho fichero de texto y la ponga
en mayúsculas.
 */
package AccesoAleatorio;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author ASIR 7L
 */
public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        String linea="";//lo inicializo
        String lineaCambi="";//aqui se me guardarán los cambios
        String Bpalabra="palabra";//es la palabra que quiero buscar
        boolean finArchivo=false;
        RandomAccessFile archivo=null;
        long puntero=0;//lo utilizo para la posicion del puntero y lo pongo como long ya que si no cuando hago puntero=archivo.getFilePointer(); me dice que haga un casting a long
        try{
            //abro el archivo
            archivo=new RandomAccessFile("cambioLetra.txt","rw");
             //leemos la linea
            linea=archivo.readLine();
            while(linea!=null){
                
                //hago la conversión
                lineaCambi=linea.replaceAll(Bpalabra,Bpalabra.toUpperCase());
                //podría comprobar si está if(Bpalabra.indexOf){}
                
                //volvemos a posicionar el puntero para que vuelva al principio de la linea anterior
                archivo.seek(archivo.getFilePointer()-linea.length()-2);//ponemos el menos 1 pq no cuenta los retornos de carro y se nos come caracteres cuando lo sobreescribimos
                //escribimos en el fichero la modicación
                archivo.writeBytes(lineaCambi);
                archivo.writeChars("\n");
                //leemos la linea siguiente
                linea=archivo.readLine();
            }
                 System.out.println("Cambio hecho"); 
                  
        }catch(EOFException e){
            finArchivo=true;
            archivo.close();
            System.out.println("Conversión realizada");
        }catch(FileNotFoundException e1){
            System.out.println("No se encontró el archivo");
        }catch(Exception ex){
            System.out.println("Problemas con el archivo");
        }    
            
    }            
}
