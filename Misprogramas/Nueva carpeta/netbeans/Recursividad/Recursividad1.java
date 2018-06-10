/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;
import java.util.Scanner;
public class Recursividad1 {
   
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int num;
        //long result;
        int result;
        System.out.println("Introduce un número: ");
        num=lector.nextInt();
        //int exp;
       // System.out.println("Introduce el exponente: ");
       // exp=lector.nextInt();
        //result=MetodosRecursivos.Potencia(num, exp);
        /*result=MetodosRecursivos.fact(num);*/
        /*System.out.printf("El factorial de %d es %d",num,result);*/
        //System.out.println("La potencia del nÃºmero serÃ¡: "+ result);
       // result=MetodosRecursivos.Producto(num, exp);
        //System.out.println("El prodcuto de"+ num +" es:" + result);
         //MetodosRecursivos.TrianguloRecursivo(num);
        MetodosRecursivos.TrianguloInverso(num);

	result=MetodosRecursivos.Fibonacci(num-1);//tiene que ser la posición menos 1, ya que empieza en cero
        System.out.println(result);
    }
    
    
    
}
