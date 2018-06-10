package excepcion;

/**
 *
 * @author Siby
 */
public class EjemploJuanvi {
    
    public void uno(){
        System.out.println("uno");
        dos();
        System.out.println("finuno");
    }
    
    public void dos (){
        System.out.println("dos");
        tres();
        System.out.println("findos");
    }
    
    public void tres(){
        System.out.println("tres");
        cuatro();
        tresymedio();
        System.out.println("fintres");
    }
    
    public void tresymedio(){
        System.out.println("tresymedio");
        System.out.println("fintresymedio");
    }
    
    public void cuatro(){
        System.out.println("cuatro");
        try{
            int[] a = new int[10];
            a = null;
            a[1] = 1;
        }
        catch(NullPointerException e){
            System.out.println("a");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("b");
        }
        finally{
            System.out.println("Siempre me ejecuto, jodete");
        }
        
        System.out.println("fincuatro");
    }
}