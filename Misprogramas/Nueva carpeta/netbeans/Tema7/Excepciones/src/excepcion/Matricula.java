/*
Se desea programar la introducción por teclado de matrículas de vehículos en un país donde las matrículas se componen 
por 8 caracteres siendo el primero una letra Si alguna matrícula introducida por el usuario no sigue el formato, 
se recogerá la interrupción oportuna y se escribirá un aviso en la consola.
 */
package excepcion;

/**
 *
 * @author ASIR 7L
 */
import java.util.Scanner;
public class Matricula extends Exception{
    private int MalFormada=0;
    static final int MAL_TAMANIO=-1;
    static final int MAL_LETRA=-2;
    
    public Matricula(){
    
    
    }
    public Matricula(int MalFormada){
        this.MalFormada=MalFormada;
    
    }
    public int DimeProblema(){
        return MalFormada;
    }
    public static boolean UnaLetra(String Matricula){
        return Matricula.substring(0,1).matches("[A-Za-z]");
    }
    
    public static void Validar(String Matric) throws Matricula{
        if(Matric.length()!=8){
            throw new Matricula(Matricula.MAL_TAMANIO);
        }else if(!UnaLetra(Matric)){
            throw new Matricula(Matricula.MAL_LETRA);
        }else{
            System.out.println("Está correcta");
        }

    }
        public static void main(String[] args) {
         try{
            Scanner lector=new Scanner(System.in);
            System.out.println("Introduce Matrícula:");
            String M=lector.nextLine();
            Validar(M);
         }catch(Matricula e){
                 switch(e.DimeProblema()){
                     case Matricula.MAL_TAMANIO:
                         System.out.println("Tamaño incorrecto");
                         break;
                     case Matricula.MAL_LETRA:
                         System.out.println("Falta letra");
                         break;
                 }
         }         
        
        }  
}  