/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestiones;

/**
 *
 * @author ASIR 7L
 */
public class Vehiculo {
    protected String marca;
    protected double precio;
    
    public Vehiculo(String marca,double precio){
        this.marca=marca;
        this.precio=precio;
    }
    
    public void incrementar_precio(double p){
        precio=precio+p;
    }
    
    public double devolver_precio(){
        return precio;
    }
    
    public String devolver_marca(){
        return marca;
    }
    
}

class Coche extends Vehiculo{
    public Coche(String marca, double precio){
        super(marca,precio);
    
    }
    
    public void incrementar_precio(double p){
        precio=precio+2*p;
    }

}

class EjercicioApp{
    public static void main(String[] args) {
        Vehiculo v=new Vehiculo("AAA",1000);
        Coche c=new Coche("BBB",1000);
        v.incrementar_precio(100);
        System.out.print(v.devolver_marca()+"");
        System.out.println(v.devolver_precio());
        c.incrementar_precio(100);
        System.out.print(c.devolver_marca()+"");
        System.out.println(c.devolver_precio());
        v=c;
        System.out.print(v.devolver_marca()+"");
        System.out.println(v.devolver_precio());
    }

}
