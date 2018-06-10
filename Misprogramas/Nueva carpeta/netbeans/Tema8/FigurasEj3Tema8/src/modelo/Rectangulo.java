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
public class Rectangulo extends Figura{
    protected double lado1;
    protected double lado2;
    
    public Rectangulo(Color c,float p[],double l1,double l2){
        super(c,p);
        this.lado1=l1;
        this.lado2=l2;
    }
    
    @Override
    public double calcularArea(){
        return this.lado1*this.lado2;
    }
    
    @Override
    public double calcularPerimetro(){
        return lado1+lado1+lado2+lado2;
    
    }
   
}
