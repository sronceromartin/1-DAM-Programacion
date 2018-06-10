/*
 */
package Modelo;

import java.io.Serializable;

/**
 *
 
 */
public class PlanFijo extends PlanPensiones  {
    
    public PlanFijo(String fInicio,String fFinal, int edadActual, double cMensual){
        super(fInicio,fFinal,edadActual, cMensual);
        this.codigo=this.generarCodigo();
        this.estado=EnumEstado.ACTIVO;
        this.interesMensual=0.4;
        this.interesCancelacion=5.4;    
    }
    
    @Override
    public String toString(){
        return  "TIPO PLAN " + EnumPlan.FIJO
                + "\n Interes mensual: "
                + interesMensual 
                + "\nInteres de Cancelación: "
                + interesCancelacion + " "
                + super.toString() + "\n------------------\n";    
    }    
}
