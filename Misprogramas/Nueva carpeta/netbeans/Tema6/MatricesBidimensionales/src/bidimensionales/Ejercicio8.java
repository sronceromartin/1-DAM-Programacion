/*
  En un supermercado se ha decidido controlar las horas de entrada de los trabajadores de los distintos departamentos de la empresa 
(panadería, carnicería, perfumería, verdulería, charcutería, almacén, ventas), 
con el objeto de ajustar los horarios en función de la demanda de clientes en las horas de apertura al público del establecimiento. 
Para hacer la estadística se han creado unas plantillas identificando a un empleado por el número de departamento (filas) y el número de empleado(columnas): 
Se desea saber:
α) Relación de todos los empleados que llegaron antes de una hora dada por el usuario, identificados por el nº de dpto. y el nº de empleado.
Por ejemplo si la hora introducida fuera 9.00, en relación a los datos  anteriores, el programa devolvería: 00, 01, 10, 20, 32, 33, 52, 64
β) Número   de   empleados   total   que   se  encontraban   trabajando   en   el establecimiento  entre  un  intervalo  de  horas  dadas  por  el  usuario. 
Por ejemplo, si el intervalo de horas fuera entre las 7.00 y las 8.00 el resultado del programa sería 8 
χ) Número  de  empleados  de  cada  uno  de  los  departamentos  que   se encontraban en el establecimiento a una hora dada. 
Por ejemplo, si la hora dada por el usuario fuera las 9.00, el resultado del programa sería:
• Panadería: 2 
• Carnicería: 1 
• Perfumería: 1 
• Verdulería: 3 
• Charcutería: 0 
• Almacén: 1 
• Ventas: 2 
Para ello el programa mostrará un menú con las opciones dadas y otra para salir del programa. 
 
 
 */
package bidimensionales;

/**
 *
 * @author Siby
 */
import java.util.Scanner;
public class Ejercicio8 {
    
    public static void mostrarMatriz(double matriz[][]){
        int f,c;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[0].length;c++){
                 System.out.print("\t"+ matriz[f][c]);
            }
            System.out.println(" ");
        }
    }
    public static void empleadosAntesHora(double matriz[][],double hora){
        int f,c;
        //double menor=hora;//lo igualo a la hora pq es la de referencia
        int posicionf=0;
        int posicionC=0;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[0].length;c++){
                if(matriz[f][c]<hora){
                    posicionf=f;
                    posicionC=c;
                    System.out.print(  posicionf + "" + posicionC +"," );
                   
                }
                
            }
            
        }
    
    }
    public static void numEmpleados(double matriz[][],double h1,double h2){
        int f,c;
        int suma=0;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[0].length;c++){
                if(matriz[f][c]>=h1&&matriz[f][c]<=h2){
                    suma++;
                }
            
            }
        }
        System.out.println("Numero de empleados trabajando: "+ suma);
    
    
    }
    public static void empleadosporDepartamento(double matriz[][],double h){
        int f,c;
        int panaderia=0;
        int carniceria=0;
        int perfumeria=0;
        int verduleria=0;
        int charcuteria=0;
        int almacen=0;
        int ventas=0;
        for(f=0;f<matriz.length;f++){
            for(c=0;c<matriz[0].length;c++){
                if(matriz[f][c]<h){
                    if(f==0){
                        
                        panaderia++;
                        
                    }else if(f==1){
                        
                        carniceria++;
                        
                    }else if(f==2){
                        
                        perfumeria++;
                        
                    }else if(f==3){
                        
                        verduleria++;
                        
                    }else if(f==4){
                        
                        charcuteria++;
                       
                    }else if(f==5){
                       
                        almacen++;
                       
                    }else{
                        
                        ventas++;
                        
                    }
                    
                }
            }
        }
        System.out.println("Panaderia: "+panaderia);
        System.out.println("Carniceria: "+ carniceria);
        System.out.println("Perfumeria: "+perfumeria);
        System.out.println("Verduleria: "+verduleria);
        System.out.println("Charcuteria: "+charcuteria);
        System.out.println("Almacen: "+ almacen);
        System.out.println("Ventas: "+ ventas);  
    
    }
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        double horas[][]={{7.30,7.35,9.30,9.30,9.30,13.00},{7.30,12.30,13.06,17.17,19.00,9.32},{7.30,12.00,13.27,15.40,17.07,18.00},{9.00,13.06,7.30,7.30,9.30,17.07},{9.14,9.30,17.07,13.06, 15.40,15.40},{12.30, 17.07, 7.30, 9.30, 15.40, 13.06 },{9.00, 9.30 ,13.06 ,17.07, 7.30 ,9.30}};
        int opcion;
        
        do{
            
            System.out.println("Introduce una opción:");
            opcion=lector.nextInt();
            double hora;
            double hora2;
            
           
                switch (opcion){
                            case 1:
                                System.out.println("Introduce una hora: ");
                                hora=lector.nextDouble();
                                mostrarMatriz(horas); 
                                empleadosAntesHora(horas,hora);
                                break;    
                            case 2:
                                System.out.println("Introduce una hora: ");
                                hora=lector.nextDouble();
                                System.out.println("Introduce otra hora: ");
                                hora2=lector.nextDouble();
                                numEmpleados(horas,hora,hora2);
                                break;
                            case 3:
                                System.out.println("Introduce una hora: ");
                                hora=lector.nextDouble();
                                empleadosporDepartamento(horas,hora);
                              break;
                            default:
                                System.out.println("La opción introducida no es correcta");
                } 
        }while(opcion<=3);
      
    }
}
