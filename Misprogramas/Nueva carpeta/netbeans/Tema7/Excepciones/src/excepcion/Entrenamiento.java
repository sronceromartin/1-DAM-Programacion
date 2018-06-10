/*
 Escribe una clase, de nombre Entrenamiento, en cuyo método
main() se creará un objeto Corredor con una energía de 50 unidades.
Se hará que el corredor corra hasta que se agote 3 veces. La primera
vez que se agote, su energía se recargará con 30 unidades. La segunda
vez que se agote su energía se recargará con 10 unidades. Cuando el
corredor se agote por tercera vez se dará el entrenamiento por
concluido
 */
package excepcion;

/**
 *
 * @author Siby
 */
public class Entrenamiento {
    public static void agotar(Corredor c){
         int vecesagotado=0;
         while(vecesagotado<=2){
            try{
                c.correr();
        
            }catch(AgotadoException e){
                System.out.println(e.getMessage());    
                vecesagotado++;
                if(vecesagotado==1){
                    c.recargarEnergia(30);
                }else if(vecesagotado==2){
                    c.recargarEnergia(10);
                }else{
                    System.out.println("Entrenamiento concluido");
                }
             }
        }
    }     
    public static void main(String[] args) {
       
        Corredor c=new Corredor(50);
        agotar(c);
        
    }
}
