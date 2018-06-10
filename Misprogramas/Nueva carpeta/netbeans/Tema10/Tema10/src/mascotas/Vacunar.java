/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotas;

/**
 *
 * @author ASIR 7L
 */
import mascotas.TrabajoFicheros.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Date;
public class Vacunar {
    public static int diasDif(Date fini, Date ffin){
        int dias=(int) ((ffin.getTime()-fini.getTime())/86400000);
        return dias;
    }
    public static void vacunar(Perro p) {
     java.util.Date hoy = new Date();
        if(p.getVacunado()){
            if(diasDif(p.fecha,hoy)>365){
                p.setFecha(hoy);
            }
        }else{
              p.setFecha(hoy);
              p.setVacunado(true);
     }

    }
     public static void ComprobaVacuna(){
        ArrayList <Persona>temp=new ArrayList(); 
        File f=new File("Mascotas.dat");
        TrabajoFicheros.cargar_lista(temp,f);
        for(Persona p:temp){//corpuebo cada persona
            if (p.getMascotas()!=null){
                for (Mascota m : p.getMascotas()) {//compruebo que tiene mascotas que p.getMAscota() no es null
                    if(m instanceof Perro){
                        vacunar((Perro)m);
                    }
                 }
            }
        }
    }
}