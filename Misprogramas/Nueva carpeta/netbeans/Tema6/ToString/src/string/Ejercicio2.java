/*
Escribe una clase con los métodos que se piden a continuación y un método main en el
que se pruebe su funcionamiento:
1. Escribe un método que, dado un String, devuelve otro objeto String en el que se
cambian todas las vocales minúsculas del original por la letra 'a'.
2. Escribe un método que, dada una cadena de caracteres, devuelve la mitad inicial de
la cadena. El método principal llamará a este método con las cadenas “Hola que tal”
y “Adiós”, para probarlo
3. Escribe un método que, dada una cadena de caracteres, sustituya todas las
ocurrencias del texto “es” por “no es”.
Si la cadena de caracteres es “es “esto1234es5678bueno900” el método debe devolver “no
esto1234no es5678bueno900”
Escribe un método que sustituya todos los grupos de dígitos por un único carácter
asterisco, es decir, si la cadena de caracteres es “esto1234es5678bueno900” el
método debe devolver “esto*es*bueno*”.
Nota: La expresión regular \\d+ significa un dígito o más.
Puedo usar replaceAll( “\\d+” , “*” );
Más información sobre expresiones regulares en Java:
http://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#sum
http://chuwiki.chuidiang.org/index.php?title=Expresiones_Regulares_en_Java
Escribe un método que dado un texto y una cadena de caracteres, cuente cuántas
veces aparece la misma en dicho texto.
Por ejemplo, para la cadena “En un lugar de la mancha, de cuyo nombre no puedo
acordarme”, si se cuenta cuántas veces aparece “o”, deberá indicar que son 5.
Añadir al ejercicio los siguientes métodos:

*Método que devuelve el número de palabras de la cadena que recibe como parámetro.
*Método que devuelve las siglas de la cadena que recibe como parámetro (Inicial de cada palabra en myúsculas)
Ej.: Producto Bruto Interno --> PIB
 */
package string;

/**
 *
 * @author ASIR 7L
 */
public class Ejercicio2 {
    
/* Escribe un método que, dado un String, devuelve otro objeto String en el que se
cambian todas las vocales minúsculas del original por la letra 'a'.*/
    public static String CambiarLetra(String cadena){
        return cadena.replaceAll("[aeiou]", "a");
    
    }

/*Escribe un método que, dada una cadena de caracteres, devuelve la mitad inicial de
la cadena. El método principal llamará a este método con las cadenas “Hola que tal”
y “Adiós”, para probarlo*/

    public static String devolverCadena(String cadena){
        int mitadCadena=cadena.length()/2;
        return cadena.substring(0,mitadCadena);
    }
/* Escribe un método que, dada una cadena de caracteres, sustituya todas las
ocurrencias del texto “es” por “no es”.
Si la cadena de caracteres es  “esto1234es5678bueno900” el método debe devolver “no
esto1234no es5678bueno900”*/

    public static String Sustituir(String cadena){
    
        return cadena.replaceAll("es","no es");
    
    }
    public static String Reemplazar(String cadena){
    
        return cadena.replaceAll("\\d+" , "*" );
    
    }
    
    /*escribe un método que dado un texto y una cadena de caracteres, cuente cuántas
veces aparece la misma en dicho texto.*/
    public static void contarLetras(String cadena,char c){
    
        int contador=0;
        int i;
        for(i=0;i<=cadena.length()-1;i++){
            if(c==cadena.charAt(i)){
                contador++;
            
            }
        }
        System.out.println(contador);
    }
    
    /*Método que devuelve el número de palabras de la cadena que recibe como parámetro.*/
    public static int ContarPalabras(String cadena){
        int cont=1;//me va a contar los espacios entre las palabras ya que yo no puedo contar esas palabras, empezamos en 1 pq hay menos espacios que palabras
        int j;
        for(j=0;j<cadena.length()-1;j++){
            if(cadena.charAt(j)==' '){//si hay un espacio, espacio es un char por eso ponemos comillas simples y separadas
                cont++;
            }
        
        }
        return cont;
    
    }  
    /*Método que devuelve las siglas de la cadena que recibe como parámetro (Inicial de cada palabra en myúsculas)*/
    
    public static char devolverSiglas(String cadena){
    
         int x;
        String primeraLetra=Character.toString(cadena.charAt(0));//trnasforma la primera letra en cadena
        
        for(x=1;x<=cadena.length()-1;x++){//se empieza en uno por que ya tenemos la primera letra
            char c=cadena.charAt(x);
            if(c==' '){
                
                primeraLetra=primeraLetra+cadena.charAt(x+1);
                        
            }
        }
        return primeraLetra;
    
    }



    public static void main(String[] args) {
        
        String cadena1="Hola a todos";
        String cadena2="";
        cadena2=CambiarLetra(cadena1);
        System.out.println(cadena2);
        
        
        String c1="Hola que tal";
        String c2="Adios";
        String mitadC1=devolverCadena(c1);
        System.out.println("La mitad de la cadena uno es: "+ mitadC1);
        String mitadC2=devolverCadena(c2);
        System.out.println("La mitad de la cadena dos es: "+ mitadC2);
        
        String c="esto1234es5678bueno900";
        String cs=Sustituir(c);
        System.out.println(cs);
        String cr=Reemplazar(c);
        System.out.println(cr);
        
        
        String c3="En un lugar de la mancha, de cuyo nombre no puedo acordarme";
        char caracter='a';
        contarLetras(c3,caracter);
        
        //Me cuenta las palabras que hay en la cadena
        System.out.println(ContarPalabras(c3));

	  // devuelve las siglas de la cadena 
        String s="Producto Interior Bruto";
        String r="";
        r=devolverSiglas(s);
        System.out.println("Siglas: "+r.toUpperCase());
        
    }

    
    



}