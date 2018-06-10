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
public class Prueba {
    public static void main(String[] args) {
        
        Punto p1=new Punto(0,0);
        Punto p2=new Punto(5,3);
        Punto p3=new Punto(2,-1);
        Punto p4=new Punto(((p2.getCoordenadaX()+p3.getCoordenadaX())/2),((p2.getCoordenadaY()+p3.getCoordenadaY())/2));
     	Punto p5=new Punto(4,3);
        
        
    }
}
