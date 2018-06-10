/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Siby
 */
import java.util.Scanner;
import java.util.Calendar;

public class PlanVariable extends PlanPensiones {
    Scanner lector=new Scanner(System.in);
    
    public PlanVariable(String fInicio,String fFinal, int edadActual, double cMensual){
        super(fInicio,fFinal, edadActual, cMensual);
        this.codigo=this.generarCodigo();
        this.estado=EnumEstado.ACTIVO;
        this.interesMensual=this.generarImensual();
        this.interesCancelacion=2.4;    
    }
    
    public double generarImensual(){
        Calendar cal = Calendar.getInstance();//para poder obtener el mes tenemos que crear un objeto
        if(cal.get(Calendar.MONTH)%2==0){
            return 0.2;
        }        
        return 0.3;
    }
    
    @Override
    public String toString(){
        return  "TIPO PLAN " + EnumPlan.VARIABLE 
                + "\n Interes mensual: "
                + interesMensual 
                + "\n Interes de Cancelación: "
                + interesCancelacion + " "
                + super.toString() + "\n------------------\n"; 
    }    
}
