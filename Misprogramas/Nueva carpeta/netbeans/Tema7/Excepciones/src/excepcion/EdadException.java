/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion;

/**
 *
 * @author Siby
 */
public class EdadException extends Exception{
    public EdadException(String s){
       super(s);//es la clase Exception su constructor,tiene que ser la primera instrucción y solo se pone una vez el super
    
    }
}
