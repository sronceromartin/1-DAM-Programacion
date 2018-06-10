/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Siby
 */
public class Alumno {
    private String nombre;
    private float nota;
    
    
public Alumno(String nombre, float nota){
    
    this.nombre=nombre;
    this.nota=nota;
}
public String getNombre(){

    return nombre;

}
public float getNota(){

    return nota;

}
}
