/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.HashSet;

/**
 *
 * @author ASIR 7L
 */
public class Abono {
    protected int cCliente;//codigo del cliente
    protected int cVale;//codigo del vale
    protected double iCompra;//es el importe de la compra
    protected double descuentoV;//es el descuento del vale
    
    public Abono(int codClie,int codVale,double iCompra,double  descuentoV){
        this.cCliente=codClie;
        this.cVale=codVale;
        this.iCompra=iCompra;
        this.descuentoV=descuentoV;
    }

    @Override
    public int hashCode() {// cuando utilice el add se utilizarán estos dos métodos
        int hash = 7;
        hash = 31 * hash + this.cVale;
        return hash;        
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Abono other = (Abono) obj;
        if (this.cVale != other.cVale) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Abono{" + "cCliente=" + cCliente + ", cVale=" + cVale + ", iCompra=" + iCompra + ", descuentoV=" + descuentoV + '}';
    }
    
    
    
    
    
    
    
}
