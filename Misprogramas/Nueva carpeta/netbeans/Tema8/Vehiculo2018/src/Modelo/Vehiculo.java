/*
a) Sus características comunes son la matrícula y la velocidad. En el 
momento de crearlos, la  matrícula se recibe por parámetro y la velocidad se
inicializa a 0. El método toString() de los vehículos devuelve información acerca
de la matrícula y la velocidad. Además se pueden acelerar, pasando por
parámetro la cantidad en km/h que se tiene que acelerar. 
 */
package Modelo;

/**
 *
 * @author Vicente Martínez Juan
 */
public class Vehiculo {
    protected String matricula;
    protected float velocidad;
    
    //public Vehiculo(){}
    public Vehiculo(String matricula){
        this.matricula=matricula;
        velocidad=0;
    }
    public void acelerar(float v){
        velocidad+=v;
    }
    @Override
    public String toString(){
        return "Matricula " + matricula + " velocidad " + velocidad;
    }
}
