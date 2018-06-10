/*
Escribe un método, de nombre mostrarCadenasArray, que reciba por
parámetro un array con cadenas de caracteres. El método mostrará por
pantalla el primer carácter de cada una de las cadenas contenidas en el
array.
• Se debe evitar que se produzca una excepción
NullPointerException si alguna de las posiciones del array
contiene una referencia no inicializada (valor null) o una
excepción StringIndexOutOfBoundsException si la cadena está
vacía
• Probar el método con los siguientes vectores:
.1. String[] x = {"Hola", "Pepe", "Maria", "Miguel Angel"};
.2. String[] m = new String[5];
.3. String[] z = {"hola", null, "pepe", "", "quinta"};
 */
package excepcion;

/**
 *
 * @author Siby
 */
public class Cadena {
    public static void mostrarCadenasArray(String cad[]){
       int i;char c;
       
       for(i=0;i<=cad.length-1;i++){
           try{ 
                c= cad[i].charAt(0);// la primera letra está en lo posicion 0 siempre
                System.out.print( c + "\n");
           }catch(StringIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
           }catch(NullPointerException e2){
               System.out.println("Cadena "+ i+ ": vacia");
           
           }    
        }
              
    }   

    public static void main(String[] args) {
        String cad[]={"Hola", "Pepe", "Maria", "Miguel Angel"};
        String[] m = new String[5];
        String[] z = {"hola", null, "pepe", "", "quinta"};
        mostrarCadenasArray(cad);
        mostrarCadenasArray(m);
        mostrarCadenasArray(z);
    }
}
