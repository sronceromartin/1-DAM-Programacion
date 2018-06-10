package Modelo;

/* * cJoven.java  * Creado el  16-mar-2018, 10:45:17  
 * @autor Vicente Martínez Juan * Contacta conmigo en torrent636588336@gmail.com*/
//final, prohibe que una clase sea extendida declarándola como final.
public final class cJoven extends Cuenta {   
    private double devRecDomiciliados; //Devolución de hasta el 3 % de los recibos domiciliado
    
    public cJoven(){
        super();
        saldo=100;//es un saldo de bienvenida (regalo del banco)
        interes=1.0;
    }  

    @Override
    public String toString(){
        return "\n---DATOS CUENTA---\n"
                + "CUENTA " + EnumCuenta.JOVEN + " " +  super.toString() + " " + nCuenta + " saldo: " + this.saldo;
    }
}
