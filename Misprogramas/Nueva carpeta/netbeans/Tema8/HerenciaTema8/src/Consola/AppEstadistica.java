/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consola;

/**
 *
 * @author Siby
 */
import Modelo.ListaMultimedia;
import Modelo.Multimedia;
import Modelo.Formato;
import java.util.Arrays;
public class AppEstadistica {
    
    public static void main(String[] args) {
        ListaMultimedia lm=new ListaMultimedia(2);
        Multimedia multi1=new Multimedia("Cars","Disney",Formato.formato.DVD,108.33);
        Multimedia multi2=new Multimedia("El silencio de los corderos","Phil mik",Formato.formato.MP3,133.45);
        //inserto dentro de la lista Multimedia los dos objetos
        lm.add(multi1);
        lm.add(multi2);
     
      
        
        // sout min 108.33
        System.out.println("El mínimo será: "+ lm.minimo());//minimo está dentro de ListaMultimedia "lm"
        
        // sout max 133.45
        
        System.out.println("El máximo será: "+ lm.maximo());
        
        // sout sum 241.78
        System.out.println("Sumatorio: "+ lm.sumatorio());
        
        // Ordeno el array de multimedia por duracion (de menor a mayor).
        Arrays.sort(lm.m);
        System.out.println("Array ordenado por duración");
        imprimeArrayMultimedia(lm.m);
        
    }
    
    static void imprimeArrayMultimedia(Multimedia m[]) {
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }
    }
}
