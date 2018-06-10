/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Siby
 */
public class Libro extends Publicacion{
   private String autor;
   private String ISBN;
   private String titulo;
   private String tipoPortada;
   
   
   public Libro(int pag, float prec, String a,String i, String t,String tP){
       super(pag,prec);
       this.autor=a;
       this.ISBN=i;
       this.titulo=t;
       this.tipoPortada=tP;
   }
   
   public String getAutor(){
       return autor;
   }
   
   public String getISBN(){
       return ISBN;
   }
   
   public String getTitulo(){
       return titulo;
   }
   
   public String gettipoPortada(){
       return tipoPortada;
   }
   
   @Override
    public String toString(){
        return "Número de paginas: "+ getPaginas() + "Precio: " + getPrecio() + "Autor: "+ getAutor() + "ISBN: " + getISBN()+ "Titulo: " + getTitulo() + "tipoPortada: " + gettipoPortada() ;
    
    }
   
}



    

