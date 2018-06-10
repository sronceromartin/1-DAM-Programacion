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
    private static int incrementoItem=0;//es estatico pq es de la clase
    
    
    public ItemEjercicioClase(String nom){
    
        nombre=nom;
        incrementoItem++;//lo utilizamos para que nos imprima el 1, 2, 3
        identificador=incrementoItem;
    
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
        
        ItemEjercicioClase uno =new ItemEjercicioClase("uno");
        ItemEjercicioClase dos =new ItemEjercicioClase("dos");
        ItemEjercicioClase tres =new ItemEjercicioClase("tres");
        
        System.out.println("Nombre: "+ uno.getNombre()+ "ID :"+  uno.getIdentificador());
        System.out.println("Nombre: "+ dos.getNombre()+ "ID :"+ dos.getIdentificador());
        System.out.println("Nombre: "+ tres.getNombre()+ "ID:" + tres.getIdentificador());
    }


}
