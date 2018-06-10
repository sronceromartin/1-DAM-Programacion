/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author ASIR 7L
 */
public class Coche extends Vehiculo{
    public int ruedas;
    public double gasolina=0;
    
    public Coche(double v,int r,double g){
        super(v,r);
        this.ruedas=r;
        this.gasolina=g;
    
    }
    public void reposta(double g){
        gasolina=gasolina+g;
    
    }
    public void acelerar (double a){
        super.acelerar(a);
        gasolina*=0.9;
    }
    @Override
    public String toString(){
         return("Velocidad: "+ velocidad + "KM"+ " Nº ruedas: "+ ruedas + "Gasolina: "+ gasolina+ "litros" );
    }
}
class AppCoche{
    public static void main(String[] args) {
       Coche c=new Coche(180.2,4,0);
       c.reposta(150);
       c.acelerar(100);
       c.frenar();
       System.out.println(c.toString());
    }
    
}
