/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

/**
 *
 * @author ASIR 7L
 */
import controlador.GestionFigura;
import java.util.Scanner;
import modelo.Circulo;
import modelo.Figura;
import modelo.Rectangulo;
import java.awt.Color;
import java.util.Arrays;

public class AppFigura {
     static Scanner lector=new Scanner(System.in);//tiene que ser static ya que está declarado en la clase
    public static void main(String[] args) {
       
        
        int opcion=0;
        String opciones="1.Circulo"+ "n2.Rectanculo" + "n3.Salir"; 
        
        
        do{
            opcion=menu(opciones);
            switch(opcion){
                
                case 1:
                    Figura c=crearCirculo();//para que no me de error tengo que hacer el método para que me devuelva una figura y así poderselo asignar a una figura
                    GestionFigura.insertar(c);//le paso la variable de tipo figura
                    GestionFigura.mostrar();
                    break;
                
                case 2:
                    Figura r=crearRectangulo();
                    GestionFigura.insertar(r);//le paso la variable de tipo figura
                    GestionFigura.mostrar();
                    break;
                    
                case 3:
                    //para que se ordenen
                    Arrays.sort(f);
                
                case 4:
                    System.out.println("Hasta pronto");
                    break;
                    
                default:
                    System.out.println("Opción incorrecta");
        
            }
        
        }while(opcion!=4);
        
        
    }
    
    public static int menu(String opciones){
            int opcion;
            do{
                System.out.println("Opciones: ");
                opcion=lector.nextInt();//voy a meter por teclado la opcion
            }while(opcion<1||opcion>3);
        return opcion;    
    }
    
    
    public static Figura crearCirculo(){
           
           
            System.out.println("Introduce las posicion X:" );
            float x=lector.nextFloat();
            System.out.println("Introduce la posicion Y: ");
            float y=lector.nextFloat();
            System.out.println("Introduce el radio: ");
            float radio=lector.nextFloat();
            float m[]={x,y};//creo un array que irá dentro del array posiciones para la x y la Y
            Circulo c=new Circulo(Color.BLACK,m,radio);
            return c;
    }
    
    public static Figura crearRectangulo(){
            System.out.println("Introduce las posicion X:" );
            float x=lector.nextFloat();
            System.out.println("Introduce la posicion Y: ");
            float y=lector.nextFloat();
            System.out.println("Introduce el lado 1:");
            double lado1=lector.nextDouble();
            System.out.println("Introduce el lado 2:");
            double lado2=lector.nextDouble();
            float m[]={x,y};
            Rectangulo r=new Rectangulo(Color.CYAN,m,lado1,lado2);
            return r;
    }
}
