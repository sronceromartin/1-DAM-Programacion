/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author ASIR 7L
 */
public class CuentaApp {
    public static void main(String[] args) {
        
        CuentaBancaria c1=new CuentaBancaria();
        CuentaBancaria c2=new CuentaBancaria("Pepe","ES250025006335218921",0.12,20000);
        CuentaBancaria c3=new CuentaBancaria(c2);//como utilizamosel constructor d ela cuenta del cliente le metemos c2, que es la cuenta del cliente que se copia
        
        System.out.println("c2 "+c2);//con esto no haría falta el get y el set para consultar
        System.out.println("c3 "+c3);
        c2.ingreso(200);
        System.out.println("c2 "+c2);//lo imprimimos para que nos haga un aumento del saldo
        System.out.println("c3 "+c3);
        c2.reintegro(100);
        System.out.println("c2 "+c2);//lo imprimimos para que nos haga un aumento del saldo
        System.out.println("c3 "+c3);
        c2.Transferencia(c3, 200);
         System.out.println("c2 "+c2);//lo imprimimos para que nos haga un aumento del saldo
        System.out.println("c3 "+c3);
    }
}
