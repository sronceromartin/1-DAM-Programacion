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
public class Alumno extends Persona{
    
    public String grupo;
    public String horario;
    
    
    public Alumno(String nom,String apells,int aNac,String g,String h){//tengo que meter los atributos que heredo del padre
        super(nom,apells,aNac);
        this.grupo=g;
        this.horario=h;
    
    }
    public void imprime(){//he reescrito el método heredado para que me pueda imprimir los atributos heredados y los nuevos
        System.out.println("Nombre: "+ nombre + "Apellidos: "+ apellidos + "Año de nacimiento: "+ anyoNacimiento+ "Grupo: "+ grupo + "Horario: "+ horario);
    
    
    }
            
            
    
}
class appAlumno{
    public static void main(String[] args) {
        Alumno a=new Alumno("Pepe ","Romero Martinez", 1990,"a1","Mañanas");
        a.imprime();
    }

}
