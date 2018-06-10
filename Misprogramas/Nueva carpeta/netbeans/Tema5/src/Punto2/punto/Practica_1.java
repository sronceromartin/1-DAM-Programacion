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
public class Practica_1 {
    public static void main(String[] args) {
        Punto p1=new Punto(0.0,2.5);
        Punto p2=new Punto(2.5,5.2);
        
        
        System.out.println("La distancia de un punto a otro será: " + p1.calcularDistanciaDesde(p2));//calcula la distancia de un punto a otro
        
        
        Circulo c1=new Circulo(4.0,3.2,4.2);
       
        
        System.out.println("La distancia del circulo: "+ c1.calcularDistancia(p2));
    }
}

}
