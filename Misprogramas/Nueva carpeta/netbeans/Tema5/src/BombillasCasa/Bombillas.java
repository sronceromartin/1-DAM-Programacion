/*
Se desea representar las bombillas que pueda haber en una casa. 
Cada bombilla tiene asociada un interruptor y sólo uno. 
Así mismo, existe un interruptor general de la casa. 
    Un interruptor tiene dos estados, ON y OFF.
Una bombilla luce si el interruptor general de la casa está ON y su
interruptor asociado también. 

Escribe una clase de nombre Bombilla que permita modelar la información anterior. 
Para ello, la clase dispondrá de:
• un método para cambiar el estado del interruptor de la bombilla.
• Un método para cambiar el estado del interruptor general de la casa.
• Un método que determina si una bombilla está luciendo o no.

 */

package BombillasCasa;

/**
 * @Creado el 15-dic-2017 & 10:18:55
 * @author Vicente Martinez Juan
 */
public class Bombillas {
    private boolean estadoBombilla;
    /*Para acceder a los métodos de la siguiente propiedad desde otro archivo
    tendré que utilizar clase.propiedad o clase.metodo static*/
    private static boolean estadoInterruptorG=true; 
    static int contBombillas; //contador de bombillas. Si no se pone nada, por defecto es público
    
    public Bombillas(){
        estadoBombilla=true;
        contBombillas++;
    }
    public void setInterruptorB(){ //interruptor bombilla
        if(estadoInterruptorG==true)
            if(estadoBombilla==true)
                estadoBombilla=false;
            else
                estadoBombilla=true; 
        else
            System.out.println("El interruptor General está apagado");
    }
    /*Para cambiar el estado del interruptor general. Al tratarse de una propiedad
    de clase o static, tengo que acceder a través de un método static si quiero 
    acceder desde BombillasApp*/
    public static void setPulsarInterruptorG(){ 
        if(estadoInterruptorG==true)
            estadoInterruptorG=false;
        else
            estadoInterruptorG=true;
    }
    public static boolean getEstadoIntG(){ //para realizar consultas desde BombillasApp
        return estadoInterruptorG;
    }
    public boolean getEstadoB(){ //Nos indica el estado de la bombilla
        if(getEstadoIntG()==false){//si el interruptor General está apagado, devolvemos siempre false
            return false;
        }
        return estadoBombilla;
    }
}


