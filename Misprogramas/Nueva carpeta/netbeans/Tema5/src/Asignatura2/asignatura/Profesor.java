/*
 Desarrollar una clase llamada Profesor que:
• Tenga un método ponerNotas que recibe un parámetro de tipo Alumno
y que no devuelve nada. Pondrá una calificación aleatoria a cada una
de las asignaturas del alumno.
• Tenga un método calcularMedia que recibe un parámetro de tipo
Alumno y devuelve un double.

 */
package asignatura;

/**
 *
 * @author Siby
 */
public class Profesor {
    public void setponerNotas(Alumno a1){
    
        double nota=(double)(Math.random()*10);
	double nota1=(double)(Math.random()*10);
        double nota2=(double)(Math.random()*10);
        a1.getValorA1().setCalificacion(nota);//pq se le pone aleatorio
        a1.getValorA2().setCalificacion(nota1);
        a1.getValorA3().setCalificacion(nota2);
    }
    public double calcularMedia(Alumno a){
    
        return (a.getValorA1().getValorC()+a.getValorA2().getValorC()+a.getValorA3().getValorC())/3;//del alumno obtenemos la asignatura y de esa asignatura la nota
    
    }
  
    
    
    
}

