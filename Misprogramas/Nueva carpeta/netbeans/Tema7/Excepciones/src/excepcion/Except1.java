/*
Escribe una clase de nombre ClaseExcep1 que incluya un método
denominado dividirEntreArray. Este método recibirá por parámetro un
número entero y un array de elementos del mismo tipo. El método
mostrará por pantalla el resultado de la división entre el número recibido
y cada uno de los elementos del array. A continuación, se escribirá un
programa que invoque al método con el número 2 y un array con los
elementos -2, -1, 0, 1 y 2.
• Reescribe el método anterior para capturar la excepción derivada
del intento de división entre 0, de forma que no se interrumpa la
ejecución del programa y se continúe dividiendo entre los otros
elementos del array.
• Reescribe el código anterior con las sentencias de código necesarias
para que la excepción no llegue a producirse (comprobar que el divisor
debe ser distinto de cero) 
 */
package excepcion;

/**
 *
 * @author Siby
 */
public class Except1 {
    public Except1(int num, int array[]){
    //lo que está comentado se utilizaría en el caso de que quisieramos que el programa se parase y no calculara el resto de divisiones después de la excepción
    }
    public static void dividirEntreArray(int num, int array[]) /*throws Exceptionnum*/{
        int i;
        int division=0;
        for(i=0;i<array.length;i++){
            //ponemos un try ...catch para que retenga la excepcion y pueda seguir calculandose las divisiones
            try
            {
                if(array[i]==0){
                    throw new Exceptionnum("No se puede dividir entre 0");
                }else{
                    division=num/array[i];
                }
                System.out.println("Division: "+ division);
            }
            catch(Exceptionnum e){
                System.out.println(e.getMessage());
        
            }
        }
        
    
    }
    
    public static void main(String[] args) {
        int a[]={2, -1, 0, 1, 2};
        
            //try{
                dividirEntreArray(2,a);
                
            /*}catch(Exceptionnum e){
                System.out.println(e.getMessage());
        
            }catch(ArithmeticException e2){
                System.out.println(e2.getMessage());
        
            }finally{
                System.out.println("Fin del programa");
            }*/
           
    }
}
