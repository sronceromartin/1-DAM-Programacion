/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploJuanvi;

/**
 *
 * @author Siby
 */
public class Coche {
    public String Marca;    
    public static int TotalCoches;
    
    public Coche(){
        TotalCoches++;
    }
    
    public int CalculoTotalCoches(){
        return TotalCoches;
    }
}