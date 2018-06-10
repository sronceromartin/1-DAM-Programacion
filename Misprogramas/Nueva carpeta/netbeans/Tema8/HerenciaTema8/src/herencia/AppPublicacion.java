/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Siby
 */
public class AppPublicacion {
    public static void main(String[] args) {
        Periodico p=new Periodico(50,2.95F,"Las gaviotas",2018);
        System.out.println(p.toString());
        Libro l= new Libro(250,16.95F,"Olivia Ardey","0098-4567","Amore se escribe con licor de limón","blanda");
        System.out.println(l.toString());
    }
}
