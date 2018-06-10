/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package item;

/**
 *
 * @author Siby
 */
public class ItemEjercicioClase {
    
    private String nombre;
    private int identificador;
    
    
    public ItemEjercicioClase(String nom,int id){
    
        nombre=nom;
        identificador=id;
    
    }
    public String getNombre(){
    
        return nombre;
    
    }
    public int getIdentificador(){
    
        return identificador;
    }
}
class ItemApp{

    public static void main(String[] args) {
        
        ItemEjercicioClase uno =new ItemEjercicioClase("uno",1);
        ItemEjercicioClase dos =new ItemEjercicioClase("dos",2);
        ItemEjercicioClase tres =new ItemEjercicioClase("tres",3);
        
        System.out.println(uno.getNombre()+ uno.getIdentificador());
        System.out.println(dos.getNombre()+ dos.getIdentificador());
        System.out.println(tres.getNombre()+ tres.getIdentificador());
    }


}
