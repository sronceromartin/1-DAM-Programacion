
public class Ejercicio6 {
    public static void main(String[] args) {
        
        float diametro=15.5f;
        float radio=diametro/2f;
        float altura=42.4f;
        final double PI=3.1415926536;//final significa que no se puede modificar en todo el programa, que es constante
	double area=PI*radio*radio+ 2*PI*radio*altura;// también podría ser area= Math.PI * Math.pow(radio,2)+2*Math.PI*radio*altura 
        double volumen=PI*radio*radio*altura;
        System.out.println("Radio = "+ radio);
        System.out.println("Area = "+ area);
        System.out.println("Volumen = "+ volumen);
        
        
        
        
    }
    
}
