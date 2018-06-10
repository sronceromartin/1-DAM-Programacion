/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cola;
import Modelo.Vehiculo;
import java.util.LinkedList;

/**
 *
 * @author ASIR 7L
 */
public class GestorAutopista {
    static private Cola efectivo=new Cola();//ponemos que es de tipo cola por que en cola creamos el linkedList
    static private Cola tarjeta= new Cola();
    static private Cola Iexacto= new Cola();
    static int contarVehiculo;
    public static void anyadirVehiculo(Vehiculo v, int tipoCola){
        
            switch(tipoCola){
                case 1:
                    if(efectivo.anyadir(v)){
                        System.out.println("El vehiculo entra en la autopista , en la cola de efectivo");
                    }
                    break;
                case 2:
                    if(tarjeta.anyadir(v)){
                        System.out.println("El vehiculo entra en la autopista , en la cola de Tarjeta");
                    }
                    break;
                case 3: 
                    if(Iexacto.anyadir(v)){
                        System.out.println("El vehiculo entra en la autopista , en la cola de Importe exacto");
                    }
                    break;
            }
            contarVehiculo ++;
            System.out.println(contarVehiculo+ "Han entrado en la autopista");
    
    }
    
    public static void sacarVehiculo(int tCola){
                switch(tCola){
                        case 1:
                            efectivo.sacar();
                            System.out.println("El vehiculo sale de la autopista ");
                            break;

                        case 2:
                            tarjeta.sacar();
                            System.out.println("El vehiculo sale de la autopista ");
                            break;

                        case 3: 
                            Iexacto.sacar();
                            System.out.println("El vehiculo sale de la autopista ");
                            break;
                }
                int salenVehiculos=contarVehiculo --; 
                System.out.println(salenVehiculos + "vehiculos quedan en la autopista");//me dice el número de coches que quedan
    }
        
}

