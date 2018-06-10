/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Siby
 */
import java.awt.Color;
public abstract class Figura implements Comparable {
    
    private Color color;
    private float posicion[];
    
  
    public Figura(Color c,float p[]){
       this.color=c;
       this.posicion=p;
    }   
        
    public Color getColor(){
        return color;
   }
   
    public void setColor( Color c){
       this.color=c;
    }
    
    public float[] getPosX(){
        return posicion;
    }
    public float[] getPos(){
        return posicion;
    }

    public void setPos(float[] p) {
        this.posicion = p;
    }
    
    //Todas las figuras tendrán un método que calcule el área y un método que calcule el perímetro.
    public abstract double calcularArea();
        
    
    
    public abstract double calcularPerimetro();
    
    
    public String toString(){
        return "El centro de la figura es: "+ getPos() + "El color de la figura es: "+ getColor();
    } 
    
  //---------------------------------------------------------- 
    public int compareTo(Object t){
        Figura f=(Figura)t;
            if(calcularArea()<f.calcularArea()){
                return -1;
            }
            if(calcularArea()>f.calcularArea()){
                return 1;
            }
        return 0;
    }
   
    
      
   
}    
 /*public  void pintar(){
        
    }
class App{
    public static void main(String[] args) {
        //Color c=new Color();Las clases abstractas no pueden intanciarse
        Figura f=new Figura();
        f.pintar();
    }

}*/
