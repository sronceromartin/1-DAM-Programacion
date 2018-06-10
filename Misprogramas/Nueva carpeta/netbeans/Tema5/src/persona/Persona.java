/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author ASIR 7L
 */
public class Persona {
    
    private String nombre;
    private String apell1;
    private String apell2;
    private int edad;

    public Persona(String nombre,String apell1,String apell2){
        this.nombre=nombre;
        this.apell1=apell1;
        this.apell2=apell2;

    }      
    public Persona(int edad){    

        this.edad=edad;
    }

    public Persona(String nombre,String apell1,String apell2,int edad){//le pongo variables y se le paso los parámetros

        this.nombre=nombre;
        this.apell1=apell1;
        this.apell2=apell2;
        this.edad=edad;
    }

    public Persona(){

        nombre="Luisa";
        apell1="Lopez";
        apell2="Gonzalez";
        edad=23;


    }  
    public String getNombre(){

        return nombre;
    }
    public String getApellido1(){

        return apell1;

    }
    public String getApellido2(){

        return apell2;

    }

    public int getEdad(){

        return edad;

    }
    public void setNombre(String nombre){

        nombre="Pepe";

    }
    public void setApellido1(String ape1){

        apell1="Romero";
    }
    public void setApellido2(String ape2){

        apell2="Diaz";

    }
    public void setEdad(int edad){

        edad=31;

    }

    public String suNombre(){

        return nombre;

    }
    public String suApellido1(){

        return apell1;


    }
    public String suApellido2(){

        return apell2;
    }

    public int suEdad(){

        return edad;
    }
    public int Distancia(){
    
    
    
    }
}