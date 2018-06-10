/*
Desarrollar una clase llamada Asignatura que:
• Tenga dos atributos prívate de tipo int (el identificador) y de tipo
double (la calificación).
• Tenga un constructor con un parámetro de tipo int.
• Tenga un getvalor para cada uno de los atributos.
• Tenga un setvalor para la calificación.

 */
package asignatura;

/**
 *
 * @author Siby
 */
public class Asignatura {
    private int identificador;
    private double calificacion;
    
public Asignatura(int i){

    this.identificador=i;


}    
public int getValorI(){

    return identificador;
}    
public double getValorC(){

    return calificacion;

}    
public void setCalificacion(double c){

    this.calificacion=c;
} 
}
