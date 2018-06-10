/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ASIR 7L
 */
public class Persona implements Serializable{
    private String Dni;
    private String nombre;
    private String apells;
    private int edad;
    //private Mascota mascota=null; 
    private ArrayList <Mascota> mascotas=new ArrayList();//lo pongo a null por defecto y lo transformo en un arrayList para poder almacenar más de una mascota
    
/*
    public Persona(String Dni, String nombre, String apells, int edad,Mascota mascota) {
        this.Dni = Dni;
        this.nombre = nombre;
        this.apells = apells;
        this.edad = edad;
        this.mascotas =new ArrayList();
        //this.mascota=mascota;
    }
*/
    public Persona(String Dni, String nombre, String apells, int edad) {
        this.Dni = Dni;
        this.nombre = nombre;
        this.apells = apells;
        this.edad = edad;
    }
    
    public boolean addMascota(Mascota m){
        mascotas.add(m);//al arrayList le añado la mascota
        return true;
    }

    public String getDni() {
        return Dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApells() {
        return apells;
    }

    public int getEdad() {
        return edad;
    }

    /*public Mascota getMascota() {
        return mascota;
    }*/
    public ArrayList<Mascota> getMascotas(){
       return mascotas;
        
    }
    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApells(String apells) {
        this.apells = apells;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    /*
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    */
    @Override
    public String toString() {
        if(mascotas !=null){
            return "Persona{" + "Dni=" + Dni + ", nombre=" + nombre + ", apells=" + apells + ", edad=" + edad + ", mascota=" + Arrays.toString(mascotas.toArray());
        }else{
            return "Persona{" + "Dni=" + Dni + ", nombre=" + nombre + ", apells=" + apells + ", edad=" + edad + "}";
        
        }    
    }
    
    
}
