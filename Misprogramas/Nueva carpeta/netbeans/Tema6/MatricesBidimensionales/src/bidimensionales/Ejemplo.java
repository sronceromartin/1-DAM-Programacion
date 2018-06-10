/*
 Se desea implementar un programa para el manejo de las notas de un grupo. 
El grupo se compone de 45 alumnos y tiene 3 módulos. 
 Calcular las notas medias de cada alumno. No se calculará la nota media si alguno de los módulos está suspendido 
 Calcular la máxima nota de un módulo 
 La nota media por módulo y cuantos alumnos la sobrepasan

 */
package bidimensionales;

/**
 *
 * @author ASIR 7L
 */
public class Ejemplo {
    public static double[][] creaMatriz(double matriz[][]){
        int f,c;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[0].length;c++){
                matriz[f][c]=(int)(Math.random()*10);
            }
        }
        return matriz;
    
    }
    public static void verMatriz(double matriz[][]){
        int f,c;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[0].length;c++){
                System.out.print("\t"+matriz[f][c]);
            }
            System.out.println("");
        } 
       
    }
    public static void mediaAlumno(double matriz[][]){
        int f,c;
        double acumulador=0;
        boolean parar=false; //por defecto sigo
        double media=0;
        for(f=0;f<matriz.length;f++){
            System.out.println("\t Alumno"+ f);
            acumulador=0;
            parar=false;
            for(c=0;c<matriz[0].length;c++){ 
                if(matriz[f][c]>=4 && parar==false){
                   acumulador=acumulador+matriz[f][c];//para que me calcule la media de cada alumno 
                }else{
                    parar=true;
                    acumulador=0;
                }
              
            }
            media=acumulador/3;
            System.out.println("Media: "+ media);
       }
    }
    public static void notaMaxModulo(double m[][]){
        int f,c;
        double media=0;
        double Mnota=m[0][0];
        for(c=0;c<m[0].length;c++){
            System.out.println("Modulo "+ c);
            Mnota=m[0][c];
            for(f=0;f<m.length;f++){
                if(m[f][c]>Mnota){
                    Mnota=m[f][c];
                }
            }
            System.out.println("Máxima nota: "+ Mnota);
        }
         
    }
    public static void notaMediaModulo(double m[][]){
        int f,c;
        double acumulador=0;
        double media=0;
        int contador=0;
        for(c=0;c<m[0].length;c++){
            acumulador=0;
            for(f=0;f<m.length;f++){
                acumulador=acumulador+m[f][c];                 
            }
            media=acumulador/m.length;//la media se calcula cuando sales del bucle de las filas
            System.out.println("La media por módulo es:" + media);
            contador=0;
            for(f=0;f<m.length;f++){
               
                if(m[f][c]>media){
                    contador++; 
                }
            }  
            
            System.out.println("Alumnos que superan la media: "+contador ); 
        }
        
       
    }
    public static void main(String[] args) {
        double notas[][]=new double [5][3];
        creaMatriz(notas);
        verMatriz(notas);
        mediaAlumno(notas);
        notaMaxModulo(notas);
        notaMediaModulo(notas);
    }
}
