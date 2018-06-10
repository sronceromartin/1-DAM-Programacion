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
public class programa {
    public static void main(String[] args) {
        Clase1 obj1= new Clase1();
        obj1.imprimir(4);
        Clase2 obj2=new Clase2();
        obj2.imprimir(3);
    }
}
class Clase1{
    protected int prop1=10, prop2=4;
    
    public void imprimir(int i){
        prop1=prop1+i;
        prop2=prop2+i;
        System.out.println( prop1 + " "+ prop2+ " ");
    
    }
}

class Clase2 extends Clase1{
    public void imprimir(int i){
       prop1=prop1-i;
       prop2=prop2-i;
       System.out.println(prop1 + " "+ prop2 + " ");
    }

} 

//resultado: 14 8/7 1