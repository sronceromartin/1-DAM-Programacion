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
public class Driver {
    public static void main(String[] args) {
        Uno[] lista=new Dos[2];
        lista[0]=new Dos();
        lista[1]=new Tres();
        for(int i=0;i<2;i++){
            lista[i].frase();
        }
    }
}

abstract class Uno{
    protected int i=2;
    abstract public void frase();

}

class Dos extends Uno{
    public void frase(){
        int i=3;
        System.out.println("Estoy en un objeto de clase Dos con i: "+ i);
    }

}
class Tres extends Dos{
    public void frase(){
        System.out.println("Estoy en un bojeto de clase tres con i: "+ i);
    }
}


//resultado:
//Estoy en un objeto de clase Dos con i: 3
//Estoy en un bojeto de clase tres con i: 2