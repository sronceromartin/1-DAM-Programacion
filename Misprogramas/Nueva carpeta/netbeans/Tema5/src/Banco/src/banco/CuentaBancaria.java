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
public class CuentaBancaria {
    private String NomCliente;
    private String numCuenta;
    private double tipoInteres;
    private double saldo;
    
    public CuentaBancaria(){
    
    
    }
    public CuentaBancaria(String cliente,String numCuenta, double interes,double saldo){
        this.NomCliente=cliente;
        this.numCuenta=numCuenta;
        this.tipoInteres=interes;
        this.saldo=saldo;
     }
    public CuentaBancaria(CuentaBancaria cliente){//hemos copiado la cuenta de un cliente
        this.NomCliente=cliente.NomCliente;
        this.numCuenta=cliente.numCuenta;
        this.tipoInteres=cliente.tipoInteres;
        this.saldo=cliente.saldo;
        
    }
    public String getNomCliente() {
        return NomCliente;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomCliente(String NomCliente) {
        this.NomCliente = NomCliente;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public String toString(){
       return "nombre Cliente " + NomCliente + "\n Cuenta " + numCuenta+ "\n Saldo: "+ saldo; 
    
    }
    public void ingreso(double ing){
        saldo=saldo+ing;
        
    }
    public void reintegro(double rein){
        saldo=saldo-rein;
    
    }
    public void Transferencia(CuentaBancaria cliente,double cantidad){
        if(cantidad<saldo){
            reintegro(cantidad);//me descuento en mi cuenta
            cliente.ingreso(cantidad);//le ingreso a ese cliente
            
        
        }
    
    
    }
}
