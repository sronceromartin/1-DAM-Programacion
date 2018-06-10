/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto;

/**
 *
 * @author Siby
 */
public class Circulo {
    

private Punto punto;
    private double radio;
    
    public Circulo(Punto p,double r){
    
        punto=p;
        radio=r;
    
    }
    public Circulo(){
        punto= new Punto(3.4,5.2);// se crea el objeto
        radio=5.2;
    }
    public Circulo(double r1,double x,double y){
        radio=r1;
        punto= new Punto(x,y);
    }
    public Punto getValorP(){
    
        return punto;
    
    }
    public double getValorR(){
    
        return radio;
    
    }
    public double calcularDistancia(Punto p){
        // Math.sqrt(Math.pow(punto.getValorX()-x,2)+ Math.pow(punto.getValorY()-y,2));
        return p.calcularDistanciaDesde(punto)-radio;
    
    }
    public double  calcularArea(){
    
        return Math.PI*radio*radio;
    
    }
    public double calcularPerimetro(){
    
        return Math.PI*2*radio;
    }
    
    
    

}
