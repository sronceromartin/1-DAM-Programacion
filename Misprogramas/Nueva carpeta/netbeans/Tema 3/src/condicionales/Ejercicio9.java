
package condicionales;


import java.util.Scanner;
public class Ejercicio9 {
    
    
    public static void main(String[] args) {
        
        Scanner lector=new Scanner(System.in);
        int cuota=500;
        int cuotaF;
        int edad;
        System.out.print(" Introduce tu edad: ");
        edad=lector.nextInt();
        
        if(edad>=65){
        
            cuotaF=500-(500*50/100);
            System.out.print(" La cuota final será: " + cuotaF);
        }else if(edad<18){
            char socio;
            System.out.print(" ¿Tus padres son socios? Escribe 't' si lo son y 'f' si no lo son: ");
            socio=lector.next().charAt(0);
            if(socio=='t'){
            
                cuotaF=500-(500*35/100);
                System.out.print(" La cuota final será: "+ cuotaF);
            
            }else if(socio=='f'){
                
                cuotaF=500-(500*25/100);
                System.out.print(" La cuota final será: "+ cuotaF);
            }else{
            
                System.out.print(" No se ha introducido el caracter correcto" );
            
            }    
        
        }else{
        
            cuotaF=cuota;
            System.out.print(" La cuota final será: "+ cuotaF);
        
        }
        
    }
    
}
