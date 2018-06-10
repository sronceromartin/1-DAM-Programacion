/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author Siby
 */
public class Coche {
    private String modelo;
    private String color;
    private boolean metalizada;
    private String matricula;
    private String tipo;
    private int anyoF;
    private String seguro;


    public Coche(String modelo,String color,boolean metalizada,String matricula,String tipo,int anyoF,String seguro){
         this.modelo=modelo;
         this.color=color;
         this.metalizada=metalizada;
         this.matricula=matricula;
         this.tipo=tipo;
         this.FechaF=FechaF;
         this.seguro=seguro;

    public String getModelo(){

	return modelo;

    }
    public void setModelo(String modelo){
	this.modelo=modelo;

    }	 
    public String getColor(){

	return color;

     }
    public void setColor(String color){
        this.color=color;	
	
    }
    public boolean getMetalizada(){
	return metalizada;

    }
    public void setMetalizada(boolean metalizada){
	this.metalizada=metalizada;

    }		 
    public String getMatricula(){

	return matricula;

    }
	
    public void setMetricula(String matricula){
	this.matricula=matricula;

    }		 
    public String getTipo(){

	return tipo;

    }

    }
    public void setTipo(String tipo){
	this.tipo=tipo;

    }		 
    public int getAnyoF(){

	return FechaF;

    }
}
    public void setAnyoF(int FechaF){
	this.FechaF=FechaF;

    }		 
    public String getSeguro(){

	return seguro;

    }	
    public void setSeguro(String seguro){

	this.seguro=seguro;

    }



    public void imprimeCoche() {//no le pongo parámetros pq no me lo dice  el enunciado
        
        System.out.println("El modelo será: "+ modelo);
        System.out.println("El color será: "+ color);
        
    }
    
    class ProbarCoche{
       public static void main(String[]args){

		Coche c1=new Coche("500","Azul",true,"3456GHY","mini",2016,"a todo riesgo");
                c1.imprimeCoche();



	}








}

    
   
    
}

