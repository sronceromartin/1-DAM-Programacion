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
public class CalculoConsumo {
   
    //atributo de los objetos
    private boolean estado= false;//lo inicializamos a false pq está apagado inicialmente
    private int potencia;
    
    //atributo de la clase
    static public int consumo=0;//es la potencia inicial del aparato, es un contador
   
   
   public CalculoConsumo(int potencia){
   
       this.potencia=potencia;
   
   }
   
   public void setEncendido(){
   
       if(estado==false){
           estado=true;
           incrementaConsumo(potencia);
       }else{
           System.out.println("El objeto ya estaba encendido");       
       }   
   }
   public void setApagado(){
   
       if(estado==true){
       
           estado=false;
           decrementaConsumo(potencia);
       
       }else{
       
           System.out.println("El objeto ya estaba apagado");
       }
   
   }
   public String getEstado(){
   
       if(estado==false){
           return "Apagado";
       
       }else{
           return "Encendido";
       
       }
   
   
   }
   public void incrementaConsumo(int poten){
   
       consumo=consumo+poten;
   
   }
   public void decrementaConsumo(int poten){
   
       consumo=consumo-potencia;
   
   }
   
}
