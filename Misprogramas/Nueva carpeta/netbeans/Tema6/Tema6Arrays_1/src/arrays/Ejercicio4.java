/*
 Ampliamos el ejemplo 1 añadiendo un array con el nombre de los alumnos. 
Se mostrará el nombre de cada alumno junto a su nota y después se mostrará el nombre de los alumnos aprobados 
 */
package arrays;

/**
 *
 * @author Siby
 */
public class Ejercicio4 {
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
        
    
    }
}
