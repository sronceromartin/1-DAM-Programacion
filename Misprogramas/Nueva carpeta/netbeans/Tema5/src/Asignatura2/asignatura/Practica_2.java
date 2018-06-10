/*
 * Desarrollar una clase llamada Practica_2 que en su método main:
• Cree e inicialice tres Asignaturas
• Cree un Alumno con las tres Asignaturas.
• Cree un Profesor que le ponga calificaciones al Alumno y muestre por
pantalla la media del Alumno.

 */
package asignatura;

/**
 *
 * @author ASIR 7L
 */
public class Practica_2 {
    public static void main(String[] args) {
        /*Asignatura Programacion=new Asignatura(4532);
        Asignatura Redes=new Asignatura(1111);
        Asignatura Estadistica=new Asignatura(3696);*/
	Alumno Nuria=new Alumno(4532,1111,3696);

	//para que no se machaquen las notas de la alumna 1 conj las del alumno 2 tengo que crear nuevas asignaturas aunque se llamen igual

	/*Asignatura Programacion=new Asignatura(4532);
        Asignatura Redes=new Asignatura(1111);
        Asignatura Estadistica=new Asignatura(3696);*/
              
        Alumno Marco=new Alumno(4532,1111,3696);//con esto he llamado al constructor que le pasamos los id, y qque se declaran las asignaturas
        
        Profesor Ramon=new Profesor();
        //Cree un Profesor que le ponga calificaciones al Alumno y muestre por pantalla la media del Alumno.
        
        
        //Alumno1
        Ramon.setponerNotas(Nuria);//profesor.setponerNotas(Nuria)
        System.out.println("Identificador Asignatura: "+ Programacion.getValorI());
        System.out.println("alum:"+ Nuria.getValorA1().getValorC());
	System.out.println("La media del alumno es: "+ pepe.calcularMedia(Nuria));
        
        //Alumno2
        Ramon.setponerNotas(Marco);
        System.out.println("Identificador Asignatura: "+ Redes1.getValorI());
        System.out.println("alum2:"+ Marco.getValorA2().getValorC());
	System.out.println("La media del alumno es: "+ pepe.calcularMedia(Marco));
    }
}
