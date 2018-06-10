/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado;


public class Cuadrado {
   
    private int lado;
    
    public Cuadrado(int longitud){
    
        lado=longitud;
    
    
    }

    public int getLado() {
        return lado;
    }
    
    
    public  void Dibujar(int lado){
        
       
        int i,j;
        for(i=1;i<=lado;i++){
            for(j=1;j<=lado;j++){
                if(i==1||i==lado||j==1||j==lado){
                
                    System.out.print("*");
                
                }else{
                
                    System.out.print(" ");
                }
            }
            System.out.println();
            }
    }    
        
}
    
    

