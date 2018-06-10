/*
 Desarrollar una clase llamada Motor que:
• Tenga dos atributos prívate de tipo int (litros de aceite) y de tipo int
(CV)
• Tenga un constructor con un parámetro de tipo int para los CV. Los
litros de aceite por defecto serán 0.
• Tenga un getvalor para cada uno de los atributos.
• Tenga un setvalor para los litros.
 */
package repaso;

/**
 *
 * @author Siby
 */
public class Motor {
    
    private int LAceite=0;// dice que por defecto será 0
    private int CV;
    
    public Motor(int cv){
    
        this.CV=cv;
    
    }
    public int getValorLitros(){
    
        return LAceite;
    }
    public int getValorCV(){
    
        return CV;
    }
    public void setValorLitros(int litros){
    
        this.LAceite=litros;
    }
}
