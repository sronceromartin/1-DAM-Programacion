/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author ASIR 7L
 */
public class Vehiculo {
    public double velocidad=0;
    public int ruedas;
    
    
    public Vehiculo(double v,int r){
        this.velocidad=v;
        this.ruedas=r;
    
    }
    public void acelerar(double v){
    
        velocidad=velocidad+v;
        
    }
    
    public void frenar(){
        velocidad=0;
    }
}
