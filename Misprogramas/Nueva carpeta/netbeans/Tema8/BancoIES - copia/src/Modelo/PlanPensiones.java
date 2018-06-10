package Modelo;

/**
 *
 * @author Siby
 */
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;// para que me importe la fecha actual

public abstract class PlanPensiones extends Producto {// es la clase abstracta por que no tenemos un plan de pensiones sin más, tiene que ser de un tipo u otro

    protected int codigo;
    protected EnumEstado estado;// indica el estado en el que está el Plan de pensiones, activo, cancelado o congelado
    protected  EnumPlan plan; //numero de tarjeta
    protected int edadActual;
    protected final int EJUBILACION=67;
    protected int anyosRestantes;//son los años entre la edad que tienes y la edad que quieres jubilarte
    protected double capitalMensual; // lo que el usuario ingresa mes a mes en el plan de pensiones
    protected double interesCancelacion;// el interes que se aplica cuando se cancela el Plan de pensiones
    protected double interesMensual;//el interés que hace que suba mes a mes el capital
    protected Date fActual;

    public PlanPensiones(String fInicio, String fFinal, int edadActual, double cMensual) {
        super(fInicio, fFinal);
        this.codigo = this.generarCodigo();//le asignamos el código producido por la función generarCodigo
        this.estado = estado.ACTIVO;// por defecto ,una vez se crea, estará Activo
        this.edadActual=edadActual;
        this.capitalMensual = cMensual;

    }

    public Date getFechaInicial() {// para pasar un String a formato Date
        try {
            DateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
            Date fechaContrato = formatter.parse(super.fechaContrato);
            return fechaContrato;
        } catch (ParseException e) {
            // ¿Qué hacemos cuando fecha inicial no se ha podido transformar a Date?
            System.out.println("La fecha inical no es válida");
            return null;
        }
    }

    public int generarCodigo() {
        return (int) (Math.random() * 1000);//le pongo multiplicado por 1000 pq me lo he inventado yo, quería que hubieran hasta 4 números
    }

    public double calcularDerechoConsolidado() {
        anyosRestantes=EJUBILACION-edadActual;
        int tiempoPagado = (int) (Math.abs(this.getFechaInicial().getYear() - this.fActual.getYear()));
        double capitalConsolidado = 0;
        capitalConsolidado = tiempoPagado * this.capitalMensual * this.interesMensual;
        return capitalConsolidado;
    }

    public double calcularPenalizacionDeCancelacion() {
        anyosRestantes=EJUBILACION-edadActual;
        int tiempoPagado = (int) (Math.abs(this.getFechaInicial().getYear() - this.fActual.getYear()));
        int anyosNoCobrados = this.anyosRestantes - tiempoPagado;
        double capitalConCancelacion = 0;
        capitalConCancelacion = this.calcularDerechoConsolidado() - anyosNoCobrados * this.interesCancelacion;
        return capitalConCancelacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAños que faltan para jubilarte: " 
                + (this.EJUBILACION-this.edadActual) + "\nCapital aportado mensualmente: " 
                + this.capitalMensual;
    }
}
