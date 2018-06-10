/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Siby
 */
public class EjemploEstrategia {
    public static void main(String[] args) {
        
        Coche context=new Coche();
        
        //Usamos la estrategia A
        
        Strategy estrategia_inicial=new EstrategiaABS();//no puedo hacer una instancia de una interface "Strategy"
        context.setStrategia(estrategia_inicial);
        context.frenar();
        
        //Usamos la estrategia B
        
        Strategy estrategia2=new EstrategiaSinABS();
        context.setStrategia(estrategia2);
        context.frenar();
        
        //Finalmente usamos la estrategia A de nuevo
        
        context.setStrategia(estrategia_inicial);
        context.frenar();
        
    }
}

//-------------------------------------------
interface Strategy{
    public void comoFrena();
}

//----------------------------------------------

class Coche {
    Strategy c;
    
    public void setStrategia(Strategy c){
        this.c=c;
    }
    
    public void frenar(){
        c.comoFrena();
    
    }
    
}

//--------------------------------------------------
//Estrategia A
class EstrategiaABS implements Strategy{

    @Override
    public void comoFrena(){
        System.out.println("Realizamos un frenado en 5 metros con ABS");
    }
    
}

//-------------------------------------------------------
//Estrategia B
class EstrategiaSinABS implements Strategy{

    @Override
    public void comoFrena(){
        System.out.println("Realizamos un frenado en 10 metros sin ABS");
    }
    
}

//-------------------------------------------------------