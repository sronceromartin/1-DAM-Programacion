/*
a) Se cree un objeto de tipo ListaMultimedia de tamaño máximo 10. ListaMultimedia del Ejercicio 10.
b) Se creen tres discos y se añadan a la lista.
c) Se creen tres películas y se añadan a la lista.
d) Trabajando con la lista y suponiendo que no se sabe en qué posiciones están los discos y las películas:
• Se muestre la lista por pantalla.
• Se calcule la duración total de los objetos de la ListaMultimedia.
• Se muestre cuántos discos hay de rock.
• Se obtenga cuántas películas no tienen actriz principal.

 */
package Controlador;

import Modelo.ListaMultimedia;//tenemos que importar el package que tiene la lista multimedia
import Modelo.Disco;///tenemos que importar el package que tiene disco
import Modelo.Formato;
import Modelo.Genero;
import Modelo.Pelicula;
import Modelo.Multimedia;
import javax.swing.JOptionPane;

/**
 *
 * @author ASIR 7L
 */
public class GestionMultimedia {
    static ListaMultimedia lm2=new ListaMultimedia(10);
    
    public static boolean insertar(Disco disco){
            return lm2.add( disco);
        
    }
    public static boolean insertarP(Pelicula p){
            return lm2.add(p);
    }
    
     public static void buscar(Disco disco){
            int pos=lm2.indexOf(disco);
                try{
                    JOptionPane.showMessageDialog(null,lm2.getOMult(pos)+" "+ pos);// es un mensaje de la interfaz
                }catch(Exception e){
                    System.out.println(e.getMessage());
                
                }
    }
    public static void buscarM(Multimedia p) throws Exception{
            int pos=lm2.indexOf(p);
            try{
                JOptionPane.showMessageDialog(null,lm2.getOMult(pos)+" "+ pos);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        } 
     
        
        public static String listar(){
            return lm2.toString();
        
        }
        
         //se calcule la duración total de los objetos de la ListaMultimedia
        public static void duracionTotal(){
            int i;
            double contador=0;
            for(i=0;i<lm2.size();i++){//dentro del objeto de tipo listaMultimedia está el array m, en teoría debería ser Lmulti.m.length pero como hay null dentro del array ya que nose ha rellenado todo, utilizamos el size para que solo recorra los objetos discos y peliculas dentro del array y m no la ponemos ya que size es un método de lista multimedia          contador=contador+Lmulti.m[i].getDuracion();
                contador=contador+lm2.m[i].getDuracion();
            }
            System.out.println("Duración total: "+ contador);
        }
        
        // Se muestre cuántos discos hay de rock.
        public static void GeneroRock(){
            int j;
            int c=0;
            for(j=0;j<lm2.size();j++){
                Multimedia multi = lm2.m[j];
                if(multi instanceof Disco)
                {
                    Disco disco = (Disco)multi;// es un downCasting de Multimedia a Disco
                    if (disco.getGenero() == Genero.ROCK)
                    {
                        c = c + 1;//le vamos sumando uno cada vez
                    }
                }
            }
            System.out.println("Discos de género Rock: "+ c);
        } 
        
        //Se obtenga cuántas películas no tienen actriz principal.
        public static void sinActriz(){
            int numSinActrices=0;
            for(int x=0;x<lm2.size();x++){
                Multimedia m1=lm2.m[x];
                if(m1 instanceof Pelicula){
                    Pelicula p=(Pelicula)m1;
                    if(p.getActriz()==" "){
                         numSinActrices=numSinActrices+1;

                    }
                }
            }
            System.out.println("Peliculas sin actrices: "+ numSinActrices);
        }
        
        
        
    }
        
        
    /*public static void main(String[] args) {
       static ListaMultimedia Lmulti=new ListaMultimedia(10);//solo da el tamaño al array
         
       public  void insertar(ListaMultimedia Lmulti){
            try{//código susceptible de producir una excepcion
                Disco d1=new Disco("Sobreviviré","Monica Naranjo",Formato.formato.MP3,180.30,"POP");
                Disco d2=new Disco("Bring me to life","Evanescence",Formato.formato.MP3,200.50,"ROCK");
                Disco d3=new Disco("Madness","Muse",Formato.formato.MP3,250.10,"ROCK");

               Lmulti.add(d1);//tengo que ponerlas aquí dentro ya que d1,d2 y d3 están declarados dentro del try, si se añadieran fuera a la lista no me dejaría ya que no existen esas variables fuera
               Lmulti.add(d2);
               Lmulti.add(d3);
           }catch(Exception e){
               System.out.println(e.getMessage());
           }

           try{
              Pelicula p1=new Pelicula("Thor","Kenneth Branagh",Formato.formato.DVD,105.78,"Chris Hemsworth","");
              Pelicula p2=new Pelicula("Cincuenta sombras liberadas","James Foley",Formato.formato.MOV,115.45,"Jamie Dornan","Dakota Johnson");
              Pelicula p3=new Pelicula("La bella y la bestia","Bill Condon",Formato.formato.CDAUDIO,123.23,"Dan Stevens","Emma Watson");

              Lmulti.add(p1);
              Lmulti.add(p2);
              Lmulti.add(p3);


           }catch(Exception e2){
               System.out.println(e2.getMessage());
           }
       }
       // Se muestre la lista por pantalla.
        public void ver(ListaMultimedia Lmulti){
            System.out.println(Lmulti.toString());
        }
        
        
        
        
*/    

   

