/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logistica;

/**
 *
 * @author DAM 6J
 */
public class LogisticaAlmacen {
    
    private int almacen1;
    private int almacen2;
    private int almacen3;
    
    
    public LogisticaAlmacen(){
    
        almacen1=0;
        almacen2=0;
        almacen3=0;
    
    }
    
    public boolean MeterContenedor(){
        if(almacen1<2){
        
            almacen1++;//te suma los sitios que quedan
            return true;
       
        }else if(almacen2<4){
        
            almacen2++;
            return true;
            
        }else if(almacen3<8){
        
            almacen3++;
            return true;
        
        }else{
        
            return false;
        }
    
    
    
    }
    public boolean SacarContenedor(){
        if(almacen1<=2 && almacen1>0){
        
            almacen1--;//te resta los sitios que quedan
            return true;
       
        }else if(almacen2<=4 && almacen2>0){
        
            almacen2--;
            return true;
            
        }else if(almacen3<=8 && almacen3>0){
        
            almacen3--;
            return true;
        
        }else{
        
            return false;
        }
    
    
    }
    
}
