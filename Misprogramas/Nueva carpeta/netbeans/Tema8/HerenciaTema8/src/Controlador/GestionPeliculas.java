/*
Escribe una aplicación donde:
a) Se crea un objeto de tipo ListaMultimedia de tamaño máximo 10 objetos multimedia.
b) Se pidan tres películas y se añadan a la lista.
c) Se muestre la lista por pantalla.
d) Se cree un objeto de tipo Película introduciendo el título y el autor de
una de las películas de la lista. Para el resto de los argumentos se utilizan valores
no significativos.
e) Busca la posición de este objeto en la lista.
f) Obtenga el objeto que está en esa posición y lo muestre por pantalla
junto con la posición en la que se encuentra.
 */
package Controlador;

import Modelo.Pelicula;
import Modelo.ListaMultimedia;
import javax.swing.JOptionPane;

/**
 *
 * @author Siby
 */
public class GestionPeliculas {
        
        public static ListaMultimedia lm=new ListaMultimedia(10);
        
        public static boolean insertar(Pelicula p){
            return lm.add(p);
        }
        
        public static String listar(){
            return lm.toString();
        }
        
        public static void buscar(Pelicula p) throws Exception{
            int pos=lm.indexOf(p);
            try{
                JOptionPane.showMessageDialog(null,lm.getOMult(pos)+" "+ pos);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    
    
    
    
        /*public static void main(String[] args) {
        
        Pelicula p1=new Pelicula("Thor","Kenneth Branagh","dvd",105,"Chris Hemsworth","Natalie Portman");
        Pelicula p2=new Pelicula("Cincuenta sombras liberadas","James Foley","dvd",115,"Jamie Dornan","Dakota Johnson");
        Pelicula p3=new Pelicula("La bella y la bestia","Bill Condon","dvd",123,"Dan Stevens","Emma Watson");
   
        //añadimos las películas a la lista
            lm.add(p1);
            lm.add(p2);
            lm.add(p3);
        
        // Se muestre la lista por pantalla.    
           System.out.println(lm.toString());
           
        //Se cree un objeto de tipo Película introduciendo el título y el autor de una de las películas de la lista
        Pelicula nueva=new Pelicula("La bella y la bestia","Bill Condon"," ",0,"","");
        
        //Busca la posición de este objeto en la lista.
        //primero lo introduzco en el array
        lm.add(nueva);
        int i;
        int posicion;
        posicion=lm.indexOf(nueva);
        System.out.println("Posicion: "+ posicion);
        
        //Obtenga el objeto que está en esa posición y lo muestre por pantalla junto con la posición en la que se encuentra.
        System.out.println(lm.getOMult(posicion));
    }*/
}
