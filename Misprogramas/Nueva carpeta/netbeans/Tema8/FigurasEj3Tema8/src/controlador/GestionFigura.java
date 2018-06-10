/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Siby
 */  
import modelo.Circulo;
import modelo.Rectangulo;
import java.awt.Color;
import modelo.Figura;
public class GestionFigura {
    static Figura f[]=new Figura[4];//puedo crear un array de tipo figura pero no un objeto
    static int numEle=0; 
    public static void insertar(Figura fig){
           if(numEle<f.length){
               f[numEle]=fig;//el array contendrá el objeto de tipo figura
               numEle++;//se incrementará el número de objetos introducidos
           }
    }
    
    public static void mostrar(){
        for(int i=0;i<f.length;i++){
            System.out.print("\n"+f[numEle]);
        }
    }
    
     
    
    
    
    /*public static Figura crearFigura(Color c, int pos[]){// como el array es la posicion x e y, necesitamos todo el array, si no sería solo una variable int para la posición
        
        return f ;// como está dentro de este ámbito, para que lo puedan utilizar lo tengo que devolver
    }
    
    public static void crearFigura(int pos[]){// como el array es la posicion x e y, necesitamos todo el array, si no sería solo una variable int para la posición
    
        crearFigura(Color.BLACK, pos);
    }*/
}


    /*for(i=0;i<f.length;i++){
                if(f[i] instanceof Circulo){
                    Circulo c=((Circulo)f[i]);
                    if()
                }else{
                    Rectangulo r=((Rectangulo)f[i]);*/