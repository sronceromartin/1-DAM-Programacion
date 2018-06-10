/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consola;

import java.util.Arrays;
import Controlador.GestionCadenas;

/**
 *
 * @author ASIR 7L
 */
public class CadenaApp {
    public static void main(String[] args) {
            String[] cadenas={null, "aEiou", "ccc","Aeina","aceituno"};
             //String[] cadenas=null;
            /*Probad el funcionamiento con las 2 definiciones
           anteriores*/
            try{
                String[] c5v=GestionCadenas.obtenerArrCad5VocalesAL(cadenas);
                System.out.println(Arrays.toString(c5v));
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
 }
}
