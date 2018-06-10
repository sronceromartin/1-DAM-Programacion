/*
Desarrollar una clase llamada Coche que:
• Tenga un atributo prívate de tipo Motor, un atributo de tipo String
(marca), otro de tipo String (modelo) y otro de tipo double con el precio
acumulado con las averías.
• Tenga un constructor con dos parámetros de tipo String que inicialice
la marca y el modelo.
• Tenga un getvalor para cada uno de los atributos.
• Un método acumularAveria que incrementará el importe gastado en
averías.
 */
package repaso;

/**
 *
 * @author Siby
 */
public class Coche {
    private Motor m;
    private String marca;
    private String modelo;
    private double PAcumulado;
    
  
    public Coche(String marca, String modelo){
    
        this.marca=marca;
        this.modelo=modelo;
        this.m=new Motor(110); //hay que poner el parámetro cv, ya que está en el constructor de la clase Motor. No puedo poner Motor this.m pq da error
    }
    public Motor getValorMotor(){
    
        return m;
    }
    public String getValorMarca(){
    
        return marca;
    }
    public String getValorModelo(){
    
        return modelo;
    }
    public double getValorPrecioA(){
    
        return PAcumulado;
    }
    public void acumularAveria(double Paveria){
    
        PAcumulado=PAcumulado+Paveria;// PAcumulado es el precio Acumulado en averías y Paveria es el precio de cada avería.
    
    }
}
