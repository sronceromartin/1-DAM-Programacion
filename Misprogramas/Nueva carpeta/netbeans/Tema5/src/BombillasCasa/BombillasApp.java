/*
Escribe un programa que utilice la clase Bombilla del apartado anterior.
Para ello, se creará una Bombilla y se visualizará por pantalla si luce o no.
Luego se pulsa el interruptor de la Bombilla y se vuelve a visualizar el
estado de la misma. Por último, se pulsa el interruptor general y se visualiza
el estado.
 */

package BombillasCasa;

/**
 * @Creado el 15-dic-2017 & 10:19:10
 * @author Vicente Martinez Juan
 */
public class BombillasApp {
    public static void main(String[]args){
        Bombillas bombilla=new Bombillas();
        Bombillas bombilla2=new Bombillas();
        System.out.println("Bombillas en mi instalación: " + Bombillas.contBombillas);
        System.out.println("Está encendida la bombilla? " + bombilla.getEstadoB());
        System.out.println("Está encendida la bombilla2? " + bombilla2.getEstadoB());

        //Veamos de nuevo, el estado de las dos bombillas
        bombilla.setInterruptorB();//Accionamos el interruptor de la bombilla
        System.out.println("Está encendida la bombilla? " + bombilla.getEstadoB());
        System.out.println("Está encendida la bombilla2? " + bombilla2.getEstadoB());
        
        System.out.println("Estado del Interruptor General " + Bombillas.getEstadoIntG());
        Bombillas.setPulsarInterruptorG();
        System.out.println("Voy a pulsarlo y su estado ahora es " + Bombillas.getEstadoIntG());
        System.out.println("Estado interruptor bombilla " + bombilla.getEstadoB());
        System.out.println("Estado interruptor bombilla2 " + bombilla2.getEstadoB());        
        
        System.out.println("Voy a encender la bombilla con el Interruptor general Apagado");
        bombilla.setInterruptorB();

        System.out.println("Enciendo nuevamente el interruptor General");
        Bombillas.setPulsarInterruptorG();
        System.out.println("El estado actual del Interruptor general es " + Bombillas.getEstadoIntG());
        System.out.println("Asi que ahora, intentaré encender la bombilla");
        bombilla.setInterruptorB();
        System.out.println("¿Está el interruptor de la bombilla encendido? " + bombilla.getEstadoB());
    }
}
