/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author ASIR 7L
 */
public class Cadenas {
    public static void main(String[] args) {
        String cad1="En un lugar de la Mancha";
        String cad2="de cuyo nombre";
        
        System.out.println(cad1);
        System.out.println(cad2);
        System.out.println(cad1.concat(cad2));
        System.out.println(cad1.concat (" ").concat(cad2));
        System.out.println(cad1.length());
        System.out.println(cad1.charAt(4));
        System.out.println(cad1.substring(3,9));
        System.out.println(cad1.indexOf('a'));
        System.out.println(cad1.indexOf('a', 10));
        System.out.println(cad1.lastIndexOf('a'));
        System.out.println(cad1.endsWith("cha"));
        System.out.println(cad1.replaceAll("[au]","A"));//está visto en el enlace de lapágina de patrones [] para que coja la a y la u
        System.out.println(cad1.replaceAll("un","UN"));
        System.out.println(cad1.toUpperCase());
    }
}
