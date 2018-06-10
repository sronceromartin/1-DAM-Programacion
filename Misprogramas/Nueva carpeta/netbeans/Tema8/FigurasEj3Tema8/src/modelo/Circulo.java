/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.awt.Color;

/**
 *
 * @author Siby
 */
public class Circulo extends Figura {
    protected double radio;
    
    
    public  Circulo(Color c,float p[],double r){
        super(c,p);
        this.radio=r;
        
   }
    @Override
    public double calcularArea(){
        
        return Math.PI*this.radio*this.radio;
    }
    
    @Override
    public double calcularPerimetro(){
       
        return Math.PI*2*this.radio;
    
    }
    
    @Override
    public String toString(){
        return "El centro de la figura es: "+ getPos() + "El color de la figura es: "+ getColor() + " y su radio es: "+ radio;
    
    }
    
}
