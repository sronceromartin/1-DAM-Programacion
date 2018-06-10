/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso;
import java.util.Scanner;
public class LogisticaConntrol1Contenedor {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int opcion;
        LogisticaAlmacen almacen1= new LogisticaAlmacen(2);
        LogisticaAlmacen almacen2= new LogisticaAlmacen(4);
        LogisticaAlmacen almacen3= new LogisticaAlmacen(8);
        
        do{
            System.out.println("Introduce una opción: ");
            opcion=lector.next().charAt(0);
            switch (opcion){
                case 'm':
                    
                        System.out.println("Meter contenedor");
                        if(almacen1.Disponibilidad()!=0){
                            System.out.println("Quedan" + almacen1.Disponibilidad() + "huecos en el almacen 1");
                            System.out.println("Ve al almacen 1");
                            almacen1.Meter();
                        }else if(almacen2.Disponibilidad()!=0){ //no hace falta que pongamos almacen1.Disponibilidad()==0 ya que va implicito en el else
                            System.out.println("No quedan huecos en el almacén 1 pero quedan " + almacen2.Disponibilidad()+ "en el almacen 2 ");
                             System.out.println("Ve al almacen 2");
                            almacen2.Meter();
                        }else if(almacen3.Disponibilidad()!=0){
                            System.out.println("No quedan huecos en el almacén 2 pero quedan " + almacen3.Disponibilidad()+ "en el almacen 3 "); 
                            System.out.println("Ve al almacen 3");
                            almacen3.Meter();
                        }else{
                            System.out.println("No quedan huecos");
                        }
                        break;
                    
                case 's':
                        
                        System.out.println("Sacar contenedor");
                        if(almacen1.ContenedoresParaSacar()<=1){//en ContenedoresParaSacar voy a obtener los huecos, es por ello que si hay 1 o 0 huecos es que tendré uno o dos contenedores para poder sacar
                            System.out.println("Hay contenedores para sacar en el almacen 1 ");
                            almacen1.Sacar();
                        }else if(almacen2.ContenedoresParaSacar()<=3){
                            System.out.println("Hay contenedores para sacar en el almacen 2");
                            almacen2.Sacar();
                        }else if(almacen3.ContenedoresParaSacar()<=7){
                            System.out.println("Hay contenedores para sacar en el almacen 3");
                            almacen3.Sacar();
                        }else{
                            System.out.println("No hay contenedores disponibles");
     
                        }
                        break;
            
                default:
                    
                        System.out.println("La opción elegida es incorrecta");
                        
            
            }
           
        }while(opcion=='m'|| opcion=='s');//por que un camionero o sacará o meterá un contenedor
        
        
        
        
        
        
        
    }
}
