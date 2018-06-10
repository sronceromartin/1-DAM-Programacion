/*
• Dos atributos prívate de tipo double.
• Un constructor con dos parámetros de tipo double que inicialice los dos
atributos.
• Un constructor por defecto (sin parámetros) que inicialice los dos
atributos al valor que se quiera.
• Un getvalor para cada uno de los atributos.
• Un método calcularDistanciaDesde que recibe un parámetro de tipo
Punto y que devuelve un double.

 */
package punto;

/**
 *
 * @author Siby
 */
public class Punto {
    
    private double x;
    private double y;
    
    public Punto(double x, double y){
    
        this.x=x;
        this.y=y;
    
    }
    
    public Punto(){
    
        x=0.0;
        y=2.5;
    
    }
    public double getValorX(){
    
        return this.x;
    }
    
    public double getValorY(){
    
        return this.y;
    
    }
    
    public double calcularDistanciaDesde(Punto punto){//ponemos como parametro un objeto de la clase Punto
     
        return Math.sqrt(Math.pow(punto.getValorX()-x,2)+ Math.pow(punto.getValorY()-y,2));
        
       
       
    
    
    }
    
}


    
