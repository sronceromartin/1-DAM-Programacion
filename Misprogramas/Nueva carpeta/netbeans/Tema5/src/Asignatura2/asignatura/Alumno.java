/*
Desarrollar una clase llamada Alumno que:
• Tenga tres atributos prívate de tipo Asignatura.
• Tenga un constructor con tres parámetros de tipo Asignatura que
inicialice los tres atributos.
• Tenga un constructor con tres parámetros de tipo int que inicialice los
tres atributos. (De momento no lo gastaremos, pero luego veremos su
utilidad)//si es de tipo int es el identificador lo que se le pasa
• Tenga un getvalor para cada uno de los atributos.

 */
package asignatura;

/**
 *
 * @author Siby
 */
public class Alumno {
      private Asignatura asig1;
      private Asignatura asig2;
      private Asignatura asig3;
      
      
public Alumno(Asignatura a1,Asignatura a2,Asignatura a3){// con este machacamos la información cada vez que llamamos a un alumno

    asig1=a1;
    asig2=a2;
    asig3=a3;

} 
public Alumno(int id1,int id2, int id3){//con este no se machaca la información de cada alumno cuando se machaca

    asig1=new Asignatura(id1);//creamos el objeto, el cual llamará al constructor Asignatura y le pasamos por parámetro el identificador
    asig2=new Asignatura(id2);
    asig3=new Asignatura(id3);

}
public Asignatura getValorA1(){

    return asig1;
}
public Asignatura getValorA2(){

    return asig2;
}
public Asignatura getValorA3(){

    return asig3;
}
}
