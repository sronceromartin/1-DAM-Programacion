/*
Escribe una aplicación donde:
a) Se cree un objeto de tipo ListaMultimedia de tamaño máximo 10.
b) Se creen tres discos y se añadan a la lista.
c) Se muestre la lista por pantalla.
d) Se cree un objeto de tipo Disco introduciendo el título y el autor de uno
de los discos de la lista, para el resto de los argumentos se utilizan valores no
significativos.
e) Busca la posición de este objeto en la lista.
f) Obtenga el objeto que está en esa posición y lo muestre por pantalla
junto con la posición en la que se encuentra.
 */
package Controlador;

import Modelo.ListaMultimedia;
import Modelo.Disco;
import javax.swing.JOptionPane;

/**
 *
 * @author Siby
 */
public class GestionDiscos { // no hay método main, es una coleccion de métodos
   
        static ListaMultimedia lm2=new ListaMultimedia(10); 
        
        public static boolean insertar(Disco disco){
            return lm2.add( disco);
        
        }
        
        public static void buscar(Disco disco){
            int pos=lm2.indexOf(disco);
                try{
                    JOptionPane.showMessageDialog(null,lm2.getOMult(pos)+" "+ pos);// es un mensaje de la interfaz
                }catch(Exception e){
                    System.out.println(e.getMessage());
                
                }
        }
        
        public static String listar(){
            return lm2.toString();
        
        }
        
        
        
        
        
        
        
        
        /*// Se creen tres discos y se añadan a la lista
        Disco d1=new Disco("Sobreviviré","Monica Naranjo","mp3",180,"pop");
        Disco d2=new Disco("Bring me to life","Evanescence","mp3",200,"rock");
        Disco d3=new Disco("Madness","Muse","mp3",250,"rock");
        lm2.add(d1);
        lm2.add(d2);
        lm2.add(d3);
        
        // Se muestre la lista por pantalla
        
        System.out.println(lm2.toString());
        
        //Se cree un objeto de tipo Disco introduciendo el título y el autor de uno de los discos de la lista, para el resto de los argumentos se utilizan valores no significativos.
        Disco dnue=new Disco("Madness","Muse"," ",0," ");
    
        //posición de este objeto en la lista
        lm2.add(dnue);
        int posicion;
        posicion=lm2.indexOf(dnue);
        System.out.println("Posicion: "+ posicion);
        
        // Obtenga el objeto que está en esa posición y lo muestre por pantalla junto con la posición en la que se encuentra.
        System.out.println(lm2.getOMult(posicion));*/
    }

