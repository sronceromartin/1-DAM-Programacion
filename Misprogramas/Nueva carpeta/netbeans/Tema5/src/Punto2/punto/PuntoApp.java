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
public class PuntoApp {
    public static void main(String[] args) {
  
        Punto p=new Punto(0,0);
        Punto p2=new Punto(5.0,2.5);
        
        //calcular distancia entre dos puntos
        System.out.println("La distancia será: "+ p.calcularDistanciaDesde(p2));
	
	//creo un objeto de la clase Circulo

	Circulo c1=new Circulo(p2,3.4);
	double distancia=calcularDistancia(p2)
	System.out.println("La distancia será: "+ distancia);
	System.out.println("El area será: "+ circulo.calcularArea());
	System.out.println("El area será: "+ circulo.calcularPerimetro());

    }   
}
