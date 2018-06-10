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
public class Periodico extends Publicacion {
    private String nombre;
    private int fecha;
    
    public Periodico(int pag, float prec, String nom, int F){
        super(pag,prec);
        this.nombre=nom;
        this.fecha=F;
    }
    
    public String getNom(){
        return nombre;
    }
   


}
