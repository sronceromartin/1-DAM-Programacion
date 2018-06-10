/*
 : Partiendo del ejemplo 4 mostrar cuantos alumnos hay en los siguientes tramos:

 Suspensos(de 0.0 a 4.99)
 Aprobados (de 5.0 a 10,00)
 Matrículas (10.00) 
 */
package arrays;

/**
 *
 * @author Siby
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        double notas[]=new double[15];
       String alumnos[]={"Luis","Merche","Pepe","Carol","Marta","Boro","Ignacio","Teresa","Java","Marce","Inma","Merche","Raúl","Javi","Concha"};
        double suma=0;
        int i;
        double media;
        int contador=0;
        for(i=0;i<notas.length;i++){// lo que me hace es introducir las notas en el array recorriendolo y sumarlas
            notas[i]=Math.random()*10;
            suma=suma+notas[i];
        }
        media=suma/notas.length;//notas.length es lo que mide el array y nos hace falta para saber el número de datos por los que dividir
    
    //como vemos cuantas notas hay por encima de la media
        for(i=0;i<notas.length;i++){
            if(notas[i]>media){
                contador++;
            }
        
        }
        
        System.out.println("Alumnos por encima de la media: "+ contador);
        System.out.println("***Notas de los alumnos***");
        for(i=0;i<notas.length;i++){
            System.out.println("Nombre: "+ alumnos[i]+ " Nota: "+ notas[i]);
        }
        System.out.println("***Alumnos aprobados***");
        for(i=0;i<notas.length;i++){
            if(notas[i]>=5){
                System.out.println("Nombre: "+ alumnos[i]+ " Nota: "+ notas[i]);
            }
        }    
        System.out.println("**Suspensos**");
        for(i=0;i<notas.length;i++){
            if(notas[i]<=4.99){
                System.out.println("Nombre: "+ alumnos[i]+ " Nota: "+ notas[i]);
            
            }
        
        }    
        System.out.println("**Aprobados**");
        for(i=0;i<notas.length;i++){
            if(notas[i]>4.99&&notas[i]<=10){
                System.out.println("Nombre: "+ alumnos[i]+ " Nota: "+ notas[i]);
            
            }
        
        }
        System.out.println("**Matricula**");
        for(i=0;i<notas.length;i++){
            if(notas[i]==10){
                System.out.println("Nombre: "+ alumnos[i]+ " Nota: "+ notas[i]);
            
            }else{
                System.out.println("No hay matriculas");
            }
        
        }
        
    
    }
}
