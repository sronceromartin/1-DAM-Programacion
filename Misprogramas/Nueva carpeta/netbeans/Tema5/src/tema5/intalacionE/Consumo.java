/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5.intalacionE;

/**
 *
 * @author Siby
 */
public class Consumo {
    public static void main(String[] args) {
    CalculoConsumo bombilla= new CalculoConsumo(100);
    CalculoConsumo radiador= new CalculoConsumo(2000);
    CalculoConsumo plancha= new CalculoConsumo(1200);
    
    System.out.println("El calculo del consumo inicial es: "+ CalculoConsumo.consumo);//como es una variable de la clase se tiene que acceder con la clase
    bombilla.setEncendido();
    plancha.setEncendido();
    System.out.println("El calculo del consumo actual es: "+ CalculoConsumo.consumo);//par acalcular el consumo
    plancha.setApagado();//tengo que apagar la plancha
    radiador.setEncendido();//tengo que encender el radiador
    System.out.println("El calculo del consumo actual es: "+ CalculoConsumo.consumo);//par acalcular el consumo
    
    
    }    
}
