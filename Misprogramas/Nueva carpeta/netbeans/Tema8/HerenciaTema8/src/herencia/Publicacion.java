/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author ASIR 7L
 */
public class Publicacion {
    private int numPaginas;
    private float precio;
    
    public Publicacion(int numP,float p){
        this.numPaginas=numP;
        this.precio=p;
    }
    
    public int getPaginas(){
        return numPaginas;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public void setPaginas(int np){
    
    
    }
    public void setPrecio(int p ){
    
    }
    
}
