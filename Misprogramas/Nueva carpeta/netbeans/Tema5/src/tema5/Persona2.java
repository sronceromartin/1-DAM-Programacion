/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

/**
 *
 * @author ASIR 7L
 */
public class Persona2 {
    private String nombre;
    private String Apellido1;
    private String Apellido2;
    private int edad;
    
    public Persona2 (String nombre,String Apellido1,String Apellido2 ){
      this.nombre= nombre;
      this.Apellido1= Apellido1;
      this.Apellido2= Apellido2;
    
    }
    public Persona2 (int edad){
      this.edad= edad;     
    }
    public Persona2 (String nombre,String Apellido1,String Apellido2, int edad ){
      this.nombre= nombre;
      this.Apellido1= Apellido1;
      this.Apellido2= Apellido2;
      this.edad= edad;  
} 
    public Persona2(){
      nombre="Luisa" ;
      Apellido1="Lopez" ;
      Apellido2="Gonzalez" ;
      edad=23; 
}
    public String getNombre(){
        return nombre;
    }
    public String getApellido1(){
        return Apellido1;
    }
    public String getApellido2(){
        return Apellido2;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre ){
        nombre= "Begoña";
    }
    public void setApellido1(String apellido2 ){
        Apellido2= "Lopez";
     }
    public void setedad (int edad){
        edad=42;
    }
    
}