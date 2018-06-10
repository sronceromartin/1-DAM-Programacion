/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author ASIR 7L
 */
public class Rectangulo {
    private int x;
    private int y;
    private int ancho;
    private int largo;
    
    
public Rectangulo(){
    
    x=0;
    y=0;
    ancho=0;
    largo=0;
}    
 
public Rectangulo(int x1, int y1, int w, int h){

    x=x1;
    y=y1;
    ancho=w;
    largo=h;
}
public Rectangulo(int w,int h){
    
    x=0;
    w=0;
    ancho=w;
    largo=h;


}
}
