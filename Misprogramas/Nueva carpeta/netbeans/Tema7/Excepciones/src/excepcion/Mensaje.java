/*
Escribe un método, de nombre enviarMensaje, que reciba por
parámetro una cadena de caracteres correspondiente a una dirección
de correo electrónico. El método comprobará que la dirección recibida
es correcta lanzando la excepción DirCorreoIncorrectaExcepcion en
caso contrario. La comprobación consistirá en verificar que la dirección
contiene el carácter (@), algún carácter después de él antes del carácter
(.) y algún carácter después de éste
 */
package excepcion;

/**
 *
 * @author ASIR 7L
 */
import java.util.Scanner;

public class Mensaje {

    public static void enviarMensaje(String correo)  {//no hace falta que pongamos el throws
        //Scanner lector=new Scanner(System.in);
        //System.out.println("Introduce tu correo: ");
        // correo=lector.nextLine();
        //correo.substring(correo.indexOf(".")+1) devuelve la cadena posterior al punto,empieza a contar a partir del punto.
        char c;
        int pos;
        int pos2;
        pos = correo.indexOf("@");//para saber la posicion del @
        pos2 = correo.lastIndexOf(".");//para saber la posicion del último .
        try {
            if (pos == -1 || pos2 == -1 || pos2 - pos <= 1 || correo.substring(correo.indexOf(".") + 1).length() < 1) {//pos y pos2 si no se encuentran dará un -1 y utilizamos el subString para ver si hay algo después del punto
                throw new DirCorreoIncorrectaException("La dirección no es correcta");
            } else {
                System.out.println("El correo está correcto");
            }
        } catch (DirCorreoIncorrectaException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        String correo = "javita@.com";
        enviarMensaje(correo);
    }

    static class DirCorreoIncorrectaException extends Exception {

        public DirCorreoIncorrectaException(String s) {
            super(s);

        }
    }
}
