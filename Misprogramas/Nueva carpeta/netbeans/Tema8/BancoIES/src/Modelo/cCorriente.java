/* SI UNA CLASE DERIVA DE UNA CLASE ABSTRACTA Y NO IMPLEMENTA ALGUNO DE LOS
METODOS ABSTRACTOS DE LA CLASE PADRE, ENTONCES HEREDA EL METODO ABSTRACTO Y SE
CONVIERTE EN CLASE ABSTRACTA
PARA PODER CREAR OBJTOS, HAY QUE IMPLEMENTAR TODOS LOS METODOS ABSTRACTOS HEREDADOS
*/
package Modelo;

/* * cCorriente.java  * Creado el  16-mar-2018, 10:43:36  
 * @autor Vicente Martínez Juan * Contacta conmigo en torrent636588336@gmail.com*/
//final, prohibe que una clase sea extendida declarándola como final.
public final class cCorriente extends Cuenta {
    private double anticipoNom; //Anticipo de nómina de hasta 6.000 €
    
    public cCorriente(){
        super();
        saldo=50;//es un saldo de bienvenida (regalo del banco)
        interes=2.0; 
    }

    @Override
    public String toString(){
        return "\n---DATOS CUENTA---\n"
                + "CUENTA " + EnumCuenta.CORRIENTE + " " + super.toString() + " " + nCuenta + " saldo: " + this.saldo;
    }
}
