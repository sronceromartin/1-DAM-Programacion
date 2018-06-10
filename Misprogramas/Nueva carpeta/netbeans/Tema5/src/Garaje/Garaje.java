/*
Desarrollar una clase llamada Garaje que:
• Tendrá tres atributos, un coche, un String con la avería asociada y el
número de coches que ha ido atendiendo.
• El garaje solo podrá atender a un coche en cada momento. Controlar
esta premisa.
• Tenga un método aceptarCoche que recibe un parámetro de tipo
Coche y la avería asociada. El garaje solo podrá atender a un coche
en cada momento. Si ya está atendiendo uno, que devuelva un false.
• Tenga un método devolverCoche que dejará al garaje en estado de
aceptar un nuevo coche.

 */
package repaso;

/**
 *
 * @author Siby
 */
public class Garaje {
    private Coche c;// si se atendiera más de un coche sería un array
    private String averia;
    private  int numCoches=0;// lo inicializamos a 0 pq se supone que no hay coches al principio e irá acumulando
    
    public String getValorAveria(){
        
        return averia;
    
    }
    public boolean aceptarCoche(Coche c1,String averia){
    
        if(this.c==null){
            this.c=c1;
            this.averia=averia;
            return true;
        
        }else{
        
            return false;
        }
    
    }
    public boolean devolverCoche(){// no ponemos parámetros ya que vamos a quitar el coche y la avería
    
        if(this.c!=null){//lo ponemos distinto de null ya que si fuera igual a null significa que no habría ningun coche y no se podría devolver
            this.c=null;
            this.averia="";
            return true;
        }else{
            return false;
        
        }
    
    }
}
