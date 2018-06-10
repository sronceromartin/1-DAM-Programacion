/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ASIR 7L
 */
public class Vehiculo {
    protected String matricula;
    protected String modelo;
    protected String color;

    public Vehiculo(String matricula,String modelo,String color){
        this.matricula=matricula;
        this.modelo=modelo;
        this.color=color;
    }
    
    public String toString(){
        return "La matricula es: "+ this.matricula + " cuyo modelo es: "+ this.modelo + " de color "+ this.color;
    }
}
