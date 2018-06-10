/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.util.Scanner;
public class Vector {
    
    /* Hacer un programa que: RECORRIDO PARCIAL
a) Cree un array unidimensional de nombre vector de 10 elementos, de
tipo numérico entero.
b) Cargue el array con valores dados por el usuario.
c) Y calcule la suma de los primeros N elementos almacenados en el array
siendo N un número dado por el usuario, en el rango correcto.
d) Muestre el resultado de la suma así como el contenido del array.*/
    public static void ejercicio1(int n){//el usuario nos da un número n de elementos para que se calculen en la suma
        Scanner lector=new Scanner(System.in);//lo tengo que poner dentro de la función ya que al no ser estatico tiene que ir dentro de un estático
        int vector[]=new int[10];
        int i;
        int suma=0;
            if(n<=vector.length){//hay que comparar los tamaños    
                for(i=0;i<vector.length;i++){
                    System.out.println("Introduce un número: ");
                    vector[i]=lector.nextInt();
                    if(i<n){//para que me haga la suma de los que quiere el usuario
                        suma=suma+vector[i];
                    }
                
                   
                }
            }else{
                System.out.println("El tamaño introducido no es valido");
            
            }
            System.out.println("El resultado de la suma es: "+ suma);
            for(i=0;i<vector.length;i++){
                System.out.println("Vector: "+ vector[i]);
            
            }
    
    }
    /* Hacer un programa que: SELECCIONAR ELEMENTOS, COPIARLOS EN OTRO
ARRAY
a) Cree un array unidimensional de nombre origen de 12 elementos, de
tipo numérico entero.
b) Rellene el vector con los valores 10,25,26,40,37,45,90,76,78,81,58 y 32
respectivamente.
c) Muestre en pantalla la posición de los elementos pares
d) Mete en un segundo array de nombre destino todos aquellos elementos
que sean pares y mayores de 25
e) y muestre en pantalla el contenido de los dos arrays unidimensionales*/
    public static void ejercicio2(){
        int origen[]={10,25,26,40,37,45,90,76,78,81,58,32};
        int destino[]=new int[12];
        int i,j=0;
        for(i=0;i<origen.length;i++){
            if(origen[i]%2==0){
                System.out.println("Posicion de los pares: "+ i);
                if(origen[i]>25){ //me meterá los pares y los mayores de 25
                    destino[j]=origen[i];//hacemos que ambos se igualen
		    j++;//lo ponemos para que se vaya rellenando destino, pero no se rellenará en la misma posición, se empezará a rellenar desde 0	
                }
            }
        }
        for(i=0;i<origen.length;i++){
            System.out.print("Origen: "+ origen[i]);
           
        
        }
	for(i=0;i<j;i++){//j es la longitud del nuevo array por lo tanto i tendrá que ser menor que j
		 System.out.print("Destino: "+ destino[j]);
	}
    
    
    }
    /*Hacer un programa que: RELACIÓN ENTRE CONTENIDO E ÍNDICES
a) Lea una secuencia de 10 números enteros, almacenándolos en un array
de nombre números
b) Los visualice en la pantalla en orden inverso al de la entrada
*/
    public static void ejercicio3(){
        Scanner lector=new Scanner(System.in);
        int numeros[]=new int[10];
        int i;
        for(i=0;i<numeros.length;i++){
            System.out.println("Introduce un número: ");
            numeros[i]=lector.nextInt();
        }
        for(i=numeros.length-1;i>=0;i--){// tiene que se -1pq se empieza desde la posicion 0
            System.out.println("Numeros: "+numeros[i]);
        
        }
    
    }
    /*BUSCAR UN ELEMENTO Y MOSTRAR SU ÍNDICE
 Programa que asigna valores (desde teclado o generados de forma aleatoria
entre 1 y 100) a un vector de 10 enteros y visualizar el vector completo
indicando posición y contenido del elemento mayor. En caso de repetición
prevalece el primero*/
    public static void ejercicio4(){
        int matriz[]=new int[10];
        int i;
        int nMayor=matriz[0];//presuponemos que ambos son iguales en la posicion 0 del array
        int posicion=0;
        for(i=0;i<matriz.length;i++){
            matriz[i]=(int)(Math.random()*10);
            System.out.println("Matriz: "+ matriz[i]);
        }
        for(i=0;i<matriz.length;i++){
            if(matriz[i]>nMayor){
                nMayor=matriz[i];
                posicion=i;
            
            }
        }
        System.out.println("El número mayor es: "+ nMayor);
        System.out.println("Posición: "+ posicion);
        
    }
    /*RELACIÓN ENTRE CONTENIDO E ÍNDICES
 Programa que genera un vector de números enteros (de una sola cifra) y
comprueba si el número formado por cada uno de los elementos del vector
es capicúa o no.*/
    public static void ejercicio5(){
        //int matrizC[]= new int[5];
        int matrizC[]={2,4,6,4,2};
        int i;
        for(i=0;i<matrizC.length;i++){
           // matrizC[i]=(int)(Math.random()*10);
            System.out.println("MatrizC: "+ matrizC[i]);
        }
        for(i=0;i<matrizC.length;i++){
            if(matrizC[i]==matrizC[matrizC.length-1-i]){
                System.out.println("Es una matriz capicua");
            }else{
                System.out.println("La matriz no es capicua");
            
            }
        }    
    }
    /*USO DE LOS ARRAYS
 En una carrera de maratón hay 100 corredores con dorsales numeradas del
1 al 100. Se sabe que los dorsales acabados en 1 pertenecen al equipo 1,
los terminados en 2 al dos… y los terminados en 0 al 10. Sabiendo que cada
corredor tiene su marca personal de tiempo para la maratón, y que el
programa va leyendo las marca de cada uno de los corredores
(dorsal1,dorsal2..), se pide el tiempo total de cada equipo*/
    
    public static void ejercicio6(){
        int dorsales[]=new int[100];
        int i;
        float equipo1=0;
        float equipo2=0;
        float equipo3=0;
        float equipo4=0;
        float equipo5=0;
        float equipo6=0;
        float equipo7=0;
        float equipo8=0;
        float equipo9=0;
        float equipo10=0;
        float marcas[]=new float[100];
        for(i=0;i<dorsales.length;i++){
            dorsales[i]=(int)(Math.random()*100);
            marcas[i]=(float)(Math.random()*100);
            if(obtenerUltimo(dorsales[i])==1){
                equipo1=equipo1+marcas[i];                
            }else if(obtenerUltimo(dorsales[i])==2){
                equipo2=equipo2+marcas[i];
            }else if(obtenerUltimo(dorsales[i])==3){
                equipo3=equipo3+marcas[i];
            }else if(obtenerUltimo(dorsales[i])==4){
                equipo4=equipo4+marcas[i];
            }else if(obtenerUltimo(dorsales[i])==5){
                equipo5=equipo5+marcas[i];
            }else if(obtenerUltimo(dorsales[i])==6){
                equipo6=equipo6+marcas[i];
            }else if(obtenerUltimo(dorsales[i])==7){
                equipo7=equipo7+marcas[i];
            }else if(obtenerUltimo(dorsales[i])==8){
                equipo8=equipo8+marcas[i];
            }else if(obtenerUltimo(dorsales[i])==9){
                equipo9=equipo9+marcas[i];
            }else if(obtenerUltimo(dorsales[i])==0){
                equipo10=equipo10+marcas[i];
                
            }
            System.out.println("Dorsales: "+dorsales[i].toString);//me transforma el array en un string para ver los resultados
	    System.out.println("Dorsales: "+dorsales[i]);	

          }
          System.out.println("Marca del equipo1: "+ equipo1);
          System.out.println("Marca del equipo2: "+ equipo2);
          System.out.println("Marca del equipo3: "+ equipo3);
          System.out.println("Marca del equipo4: "+ equipo4);
          System.out.println("Marca del equipo5: "+ equipo5);
          System.out.println("Marca del equipo6: "+ equipo6);
          System.out.println("Marca del equipo7: "+ equipo7);
          System.out.println("Marca del equipo8: "+ equipo8);
          System.out.println("Marca del equipo9: "+ equipo9);
          System.out.println("Marca del equipo10: "+ equipo10);
    }
    public static int obtenerUltimo(int num){
            
        int resto=0;
        resto=num%10;
        return resto;
    
    }
    public static void main(String[] args) {
        /*Scanner lector=new Scanner(System.in);
        int n;
        System.out.println("Números que quiere el usuario que se calculen: ");
        n=lector.nextInt();
        ejercicio1(n);*/
        System.out.print("*************");
        System.out.println(" ");
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
	ejercicio6();
    }
    
}
