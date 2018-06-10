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
public class CalculoConsumo {
   static public int consumo;
   
   public CalculoConsumo(int potencia){
   
       
   
   }
   
   public boolean EstaEncendido(int consumo){
   
       if(consumo>0){
       
           return true;
       
       }else{
       
           return false;
       }
   
   
   }
   public void encenderAparato(int consumo){
   
       consumo++;
   
   }
   public void apagarAparato(int consumo){
   
       consumo--;
   
   }
   public int consumoTotal(int consumo){
   
       return consumo;
   
   }
}
