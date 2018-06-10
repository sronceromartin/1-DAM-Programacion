/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotas;

/**
 *
 * @author ASIR 7L
 */
public class Pajaro extends Mascota{
   private boolean anillado=false;
   private String codigo;
   
   public Pajaro(String nombre,int patas)throws PatasImparesException{
       super(nombre,patas);//le pongo a piñon el 2 pq son las patas que tiene que las hereda de la clase mascota
   }

    public boolean isAnillado() {
        return anillado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setAnillado(boolean anillado) {
        this.anillado = anillado;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
   
   
   

    @Override
    public String toString() {
        return super.toString()+ "Pajaro{" + "anillado=" + anillado + ", codigo=" + codigo + '}';
    }
   
   
}
