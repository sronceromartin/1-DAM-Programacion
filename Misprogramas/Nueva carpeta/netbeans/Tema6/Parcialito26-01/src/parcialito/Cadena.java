/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialito;

/**
 *
 * @author Siby
 */
public class Cadena {
    public static boolean buscarCadena(String cadenas[],String cadena){
    
        int i;
        for(i=0;i<cadenas.length;i++){
            
            if(cadenas[i].equals(cadena)){
                return true;
            
            }
        
        }
       return false;// se pone cuando el array está vacío y no entraría en el for, por lo tanto si tenemos algo en la cadena pero en el array no hay nada directamente irá al false fuera del for.
    }
    
    public static void main(String[] args) {
        String cadenas[]={"hola","adios","no","si"};
        String cad="no";
        boolean result=buscarCadena(cadenas,cad);
        System.out.println("Resultado:"+ result);
        
    }
}
