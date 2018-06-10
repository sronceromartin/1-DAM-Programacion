package Modelo;
import java.io.Serializable;
import java.util.ArrayList;      
import java.util.HashSet;
import java.util.Set;


//SI UNA CLASE ES ABSTRACTA, NO SE PUEDEN CREAR OBJETOS DE ELLA
public abstract class Cuenta implements Serializable {        
    public ArrayList <Producto> prod = new ArrayList();    
    public ArrayList <Movimientos> mov = new ArrayList();    
    protected String IBAN; //ES + 2 primeros digitos de la entidad bancaria ES14 1465 0100 96 3707518653
    protected int entidad; //4 digitos: identifican Entidad Bancaria    1465
    protected int nOficina; // 4 digitos: código de la oficina          0100
    protected int digControl; //2 digitos: digitos de control para dar validez a la cuenta bancaria 96
    protected long nCuenta; // 10 digitos: número de cuenta              3707518653
    protected double saldo;
    protected double interes; //interés de la cuenta
    protected EnumCuenta enumCuenta;
    
    public Cuenta() {
        this.IBAN = "ES14";
        this.entidad = 1465;
        this.nOficina = 0100;
        this.digControl = 96;
        this.nCuenta=generarCuenta();
    }
    public long getnCuenta() {
        return nCuenta;
    }
    public long generarCuenta(){ 
        long devolver;
        devolver=(long)(Math.random()*(9999999999L-1000000000L))+1000000000L;
        return devolver;
    }  
    @Override
    public String toString(){
        return IBAN + " " + entidad + " " + nOficina + " " + digControl;
    }

    public double getsaldo(){
        return saldo;
    }

    public void ingreso(Cuenta c, double ing) {
        if (ing < 0) {
        } else {
            saldo = saldo + ing;
            Movimientos i = new Movimientos("Ingreso de ", ing);
            c.mov.add(i);
        }
    }
    
    public void reintegro(double reint) { //método reintegro
        if (reint < 0) {
        } else if (saldo >= reint) {
            saldo -= reint;
            Movimientos r = new Movimientos("Reintegro de ", reint);
            this.mov.add(r);
        } else {
            System.out.println("El reintegro es mayor que su saldo. Operación Anulada");
        }
    }
    //método transferencia: Debe haber suficiente saldo en la cuenta origen
    public boolean transferencia(Cuenta c, double importe) {
        boolean transf=false;
        if (importe < 0) {
        } else if (saldo >= importe) {
            reintegro(importe); //Aquí me descuentan el dinero
            c.ingreso(c,importe);//Aquí le hago el ingreso a la otra cuenta
            transf=true;
        } else {
            System.out.println("La Transferencia es mayor que su saldo. Operación Anulada");
        }
        return transf;
    }
    
    public void setproducto(Producto producto){
        if(prod.add(producto)){
            System.out.println("Producto añadido");
        }else{
            System.out.println("Su operación no ha sido posible!");
        }
    }
    
    
    public String printDatosCuentaBase(){
        return  "Cuenta Corriente " + IBAN +" "+ nOficina +" "+ digControl +" "+ nCuenta;
    }
    public String printMovimientos(){
        String cadena="";        
        for(Movimientos m : mov){
            cadena = cadena + m.toString() + "\n";
        }
        return  cadena;
    }
    public String printProductosContratados(){
        String cadena="";
        for(Producto p : prod){
            cadena = cadena + p.toString();
        }
        return cadena;
    } 
}