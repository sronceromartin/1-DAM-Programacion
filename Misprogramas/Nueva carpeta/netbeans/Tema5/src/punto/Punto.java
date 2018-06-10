/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto;

/**
 *
 * @author Siby
 */
public class Punto {
    private float coordX;
    private float coordY;


    public Punto(){
    
        coordX=0;
        coordY=0;
    
    }
    public Punto(float X,float Y){
    	this.coordX=X;
	this.coordY=Y;
    
    
    }
    
    public float getCoordenadaX(){
    
        return coordX;
    
    }

    public void setCoordenadaX(float X){

        this.coordX=X;

    }
    public float getCoordenadaY(){
    
        return coordY;
    
    }
    public void setCoordenadaY(float Y){

        this.coordY=Y;

    }
    public double Distancia(Punto p){


	return Math.sqrt(Math.pow(p.getCoordenadaX()-coordX,2)+Math.pow(p.getCoordenadaY()-coordY,2));

    }
    public double distancia(){//lo utilizamos para hallar la distancia al origen

	return Math.sqrt(Math.pow(coordX,2)+Math.pow(coordY,2));

    }
   
    
    
    
    
    
}
