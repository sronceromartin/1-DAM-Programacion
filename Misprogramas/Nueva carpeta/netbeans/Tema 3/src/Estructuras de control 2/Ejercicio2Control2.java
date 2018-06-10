/*
Programa en java que escriba las tablas de multiplicar del 1 al 9, separadas por una
línea horizontal, como en el ejemplo. Fíjate en la alineación de los números y los
símbolos del producto y el =

 */
package repetitivas;


public class Ejercicio2Repetitivas2 {
    public static void main(String[] args) {
        
        int i,j;
        int result=0;
       
        for(i=1; i<=10;i++){
        
            
            System.out.println("-------------------");/tambiñen podría ponerse abajo después del segundo for
            for(j=1;j<=10;j++){
                
                result=j*i;
                System.out.println( i + "*"+ j + " = "+ result );
            }
    }
        
    
}
}