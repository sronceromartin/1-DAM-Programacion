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
public class Padre {
    protected int aa=0;
    public int aa(){
        return aa;
    
    }
}

class Hija extends Padre{
    public Hija (int bb){
        this.aa=bb+1;
    }
    
}

class Nieta extends Hija{
    public Nieta (int cc){
        super(cc+2);
    }

}

class Familia{
    public static void main(String[] args) {
        Hija h=new Hija(4);
        h=f(h);
        System.out.println(h.aa());
    }   
        private static Nieta f(Padre h){
            Nieta n= new Nieta(h.aa());
            return n;
        }
    
}

//resultado=8