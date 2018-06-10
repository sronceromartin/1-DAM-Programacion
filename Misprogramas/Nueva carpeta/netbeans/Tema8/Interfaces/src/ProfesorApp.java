/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siby
 */
public class ProfesorApp {
    public static void main(String[] args) {
        ProfesorFP _profesor=new ProfesorFP();
        _profesor.setNombre("Paco");
        _profesor.identificarse();
    }
}    
    interface IProfesor{
        public void identificarse();
    
    }
    
    abstract class ProfesorBase implements IProfesor{
        String nombre;
        
        public void setNombre(String nombre){
        
            this.nombre=nombre;
        }
        
        public void identificarse(){
            System.out.println("Me llamo "+ this.nombre);
            masInfo();
        }
        
        protected abstract void masInfo();
    
    }
    
     class ProfesorFP extends ProfesorBase{
         
         @Override
         protected void masInfo(){
             System.out.println("Soy profesor especialista en FP");
             
         }
    
    
    }
    

