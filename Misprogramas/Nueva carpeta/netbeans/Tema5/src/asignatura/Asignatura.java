
package asignatura;

/**
 *
 * @author Siby
 */
public class Asignatura {
    
    private String nombre;
    private int cod;
    private int curso;
    
    
    public Asignatura(String nom,int code,int curs){
    
        this.nombre=nom;
        this.cod=code;
        this.curso= curs;
    
    }
    public String getNombre(){
    
        return nombre;
    
    }
    public void setNombre(String nombre){
	this.nombre=nombre;

    }


    public int getCod(){
    
        return cod;
    
    }

    public void setCod(int cod){

       this.cod=cod;

    }
    public int getCurso(){
    
        return curso;
    
    }
    public void setCurso(int curso){

        this.curso=curso;
    }
    
    @Override
    public String toString(){
    
        return "El nombre de la asignatura es: " + nombre + " el codigo: " + cod + " del curso " + curso ;
    
    }
    
    
}
    
    class AsignaturaApp{
    public static void main(String[] args) {        
        Asignatura asig=new Asignatura("Matematicas", 1017, 1);
        
        System.out.println( asig);
        
    }
    }
    
    


