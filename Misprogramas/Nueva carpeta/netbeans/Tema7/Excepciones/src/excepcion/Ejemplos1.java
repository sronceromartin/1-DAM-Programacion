/*
Programa que pida 2 enteros y devuelva la división
◦ Mostrar al final un mensaje de despedida: “El programa ya ha acabado”
◦ Probar la ejecución si se introduce un valor no numérico o un 0 como divisor
◦ Modificar el programa para que se traten las excepciones y muestre el mensaje genérico.
◦ Probar la ejecución si se introduce un valor no numérico o un 0 como divisor
◦ Modificarlo para que continúe hasta que la entrada sea correcta
◦ Modificar para que dependiendo del tipo de excepción muestre:
▪ -”Error de conversión”
▪ -”Error de lectura”//cuando introduces un dato que no es un string
▪ -”División por 0”
▪ -”Error desconocido”
 */
package excepcion;

/**
 *
 * @author ASIR 7L
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejemplos1 {
    public static void main(String[] args) {
        
       
       
       Scanner lector=new Scanner(System.in);
       int a;
       int b;
       int division=0;
       boolean correcto=false;
       do{//para que nos siga pidiendo los datos
            
            try{
                System.out.println("Introduce el dividendo: ");
                a=lector.nextInt();
                System.out.println("Introduce el divisor: ");
                //b= Integer.parseInt(lector.nextLine());//introducimos un string que luego convertirá a número
                b=lector.nextInt();
                division=a/b;
                System.out.println("División" + division);
                correcto=true;
            }catch(InputMismatchException e1){
                     System.out.println(e1.getMessage());
                     System.out.println("No has introducido un entero");
                     lector.nextLine();//para que se vacie el buffer
     
            }catch(ArithmeticException e2){
                     System.out.println(e2.getMessage());//mensaje del tipo de error sin que se pare el programa
                     System.out.println("No se puede dividir por 0");
                     lector.nextLine();

            
            }catch(NumberFormatException e3){
                System.out.println(e3.getMessage());
                System.out.println("Error de conversion");
                lector.nextLine();

            }catch (Exception e4){
                System.out.println(e4.getMessage());
                System.out.println("Error desconocido");
            }finally{
                 System.out.println("El programa ya ha acabado");
            }
       }while(!correcto);
       
               
           
       
    }
}
