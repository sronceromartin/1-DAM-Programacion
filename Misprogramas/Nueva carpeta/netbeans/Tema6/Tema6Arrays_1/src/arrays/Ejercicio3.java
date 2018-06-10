/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
  El programa genera una seri de números aleatorios hasta que se haya generado al menos un número con cada terminación posible 0,1,2,3,4,5,6,7,8,9). 
  * Determinar la cantidad de total de números generados para que estén todas las terminaciones de 0 a 9. 
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
        boolean presencia[]=new boolean[10];//vamos a tener todo false en un principio y luego se irán pasando a true
        int posicion,i;
        boolean result;
        
        do{
            result=true;//lo inicializamos en true que es lo contrario de lo que tenemos ahora
            posicion=(int)(Math.random()*10);//hay que ponerlo entre paréntesis si no no sale
            presencia[posicion]=true;
            System.out.print(" "+posicion);
            for(i=0;i<presencia.length;i++){
                if(presencia[i]==false){
                     result=false;
                }
        
            }
        
        }while(result!=true);//mientras resultado sea distinto de true se irá repitiendo que me salga un número
        for(i=0;i<presencia.length;i++){//recorremos el bucle para poder imprimir su información
            System.out.print( " " + presencia[i]);
        }
        
    }
}
   
    
/*public int obtenerUltimoNumero(int numero){
    int resto=0;
    int ultimoNum;
    resto=numero%10;
    ultimoNum=resto;
    return ultimoNum;


} */   
    
    

