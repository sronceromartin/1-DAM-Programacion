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
  
    public enum Genero{ROCK, POP, PUNK,FLAMENCO,CLASICA,TECNO,JAZZ;
    public static boolean estaEn(String g){//este método es para que no lance una excepcion cuando no se introduzca bien el genero
         for(Genero gen: Genero.values()){
            if(gen.name().equalsIgnoreCase(g))
                return true;
            
         }
         return false;
     }
    } //este es el de Genero, no hay clase
