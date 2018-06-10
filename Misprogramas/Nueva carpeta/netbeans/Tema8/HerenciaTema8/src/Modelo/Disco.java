/*
- Escribe una clase Disco que herede de la clase Multimedia ya realizada. La
clase Disco tiene, aparte de los elementos heredados, un atributo para
almacenar el género al que pertenece (rock, pop, punk, etc.). La clase debe tener
un método para obtener el nuevo atributo y debe sobrescribir el método toString()
para que devuelva, además de la información heredada, la nueva información.
 */
package Modelo;

/**
 *
 * @author Siby
 */
public class Disco extends Multimedia {
   
    Genero genero;
   
    
    public Disco(String t,String a,Formato.formato f,double d,String g)throws Exception{
        super(t,a,f,d);// son el titulo,autor,formato y duracion
        try{
            if(g!=null){
                Genero.estaEn(g);
                this.genero=Genero.valueOf(g.toUpperCase());
            }
        }catch(Exception e){
            throw new Exception("Error al introducir los datos: ");
        }
    
    }
    
    public Genero getGenero(){// el string lo convierto en la clase genero para devolverlo
        return genero;
    }
    
    @Override
    public String toString(){
        return super.toString()+ "Género: "+ this.genero;
    
    }
    
}
