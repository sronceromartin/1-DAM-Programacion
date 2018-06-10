/*
Construir una clase ArrayReales que declare un atributo de tipo
double[ ] y que implemente una interfaz llamada Estadisticas
 */
package interfaces;

/**
 *
 * @author Siby
 */
public class ArrayReales implements Estadisticas {
    
    public double a[];//declarado pero no instanciado
    
    public ArrayReales(double a[]){
        this.a=a;
    }
    
    public double minimo(){
        double min=a[0];
        int i;
        for(i=0;i<a.length;i++){
            if(min>=a[i]){//tiene que ser mayor o igual para que yo le cambie el valor al que es menor
                min=a[i];
            }
        }
        return min;
    }
    
    public double maximo(){
        double max=a[0];
        int j;
        for(j=0;j<a.length;j++){
            if(max<=a[j]){
                max=a[j];
            }
        }
        return max;
    }
    
    public double sumatorio(){
        double sum=0;
        int i;
        for(i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        return sum;
    }
    
}

