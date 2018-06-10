/*
Escribe una clase, de nombre Corredor, teniendo en cuenta las
siguientes especificaciones:
• La clase tendrá un atributo entero de nombre energía
• La clase tendrá un método constructor que reciba por parámetro
una cantidad de energía que asignará al atributo
• La clase tendrá un método, de nombre recargarEnergia, que
recibirá por parámetro una cantidad de energía que será sumada
al atributo energía
• La clase tendrá un método, de nombre correr, que mostrará por
pantalla un mensaje y decrementará la energía en 10 unidades.
Antes de proceder al decremento, el método comprobará que la
energía del corredor es igual o superior a 10 unidades. Si no es
así, el método lanzará una excepción de tipo AgotadoException
Para crear la excepción AgotadoException (en el fichero Corredor.java):
2
 */
package excepcion;

/**
 *
 * @author ASIR 7L
 */
public class Corredor {
    int energia=0;// de paquete para que todos los del mismo paquete puedan acceder a el
   
   public Corredor(int e){
       this.energia=e;
   
   }
   public void recargarEnergia(int e){ //al ser para un único corredor le quitamos el static      
       this.energia= this.energia + e;
   }
   public  void correr()throws AgotadoException{
        if(this.energia>=10){
           this.energia=this.energia-10;
           System.out.println("Energia: "+ this.energia);
       }else{
           throw new AgotadoException("Niveles de energía inferiores a 10");
       
       }
   }
    /*public static void main(String[] args) {
        recargarEnergia(20);
        try{
            correr();
        }catch(AgotadoException e){
            System.out.println(e.getMessage());
        
        }
        
    }*/
   
}
class AgotadoException extends Exception{
    public AgotadoException(String s){
        super(s);
    }

}
