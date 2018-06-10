/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intalacionE;

/**
 *
 * @author Siby
 */
public class Consumo {
    
    CalculoConsumo bombilla= new CalculoConsumo(100);
    CalculoConsumo radiador= new CalculoConsumo(2000);
    CalculoConsumo plancha= new CalculoConsumo(1200);
    
    if(bombilla.EstaEncendido()==true && plancha.EstaEncendido()==true){
    
            System.out.println("El consumo de la bombilla será: " + bombilla.consumoTotal);
    }else if(bombilla.EstaEncendido()==true && radiador.EstaEncendido()==false && plancha.EstaEncendido()==false ){
    
    }
    
    
    
}
