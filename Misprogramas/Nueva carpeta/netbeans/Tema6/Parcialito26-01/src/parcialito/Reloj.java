/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialito;

/**
 *
 * @author Siby
 */
public class Reloj {
    public static int nrelojes=0;//para poder utilizarla para que me de el número de relojes la hago publica y luego en cada constructor la pongo como un contador
    private int hora;
    private int minuto;
    private int segundo;
    
    public Reloj(){
        nrelojes++;
        this.hora=0;
        this.minuto=0;
        this.segundo=0;
    }
    public Reloj(int hora, int min,int seg){
        nrelojes++;
        if(hora>=0&&hora<=24){
            this.hora=hora;
        }else{
            this.hora=0;
        }
        if(min>=0&&min<=60){
            this.minuto=min;
        }else{
            this.minuto=0;
        }
        if(seg>=0&&seg<=60){
            this.segundo=seg;
        
        }else{
            this.segundo=0;
        }
    }
    
    public Reloj(Reloj r){
        nrelojes++;
        r.hora=hora;
        r.minuto=minuto;
        r.segundo=segundo;
    }
    @Override
    public String toString(){
        return hora + ":"+ minuto + ":" + segundo;
    
    }
    public void hora12(){//no es static para que podamos acceder a los atributos no static (hora,min y seg).y no se le pasan parámetros
    
        if(hora>=0&&hora<=11){
            System.out.println( hora + ":" + minuto + ":"+ segundo + "AM");
        
        }else if(hora>=12 && hora<=23){
            int hora12=hora-12;//no se trata de cambiar la hora, si no de imprimirla en formato de 12h por eso creamos una nueva variable
            System.out.println( hora12 + ":" + minuto + ":"+ segundo + "PM");
        
        }
    }
    public  void ponerenHora(int hora,int minuto){
        //como pongo segundos a 0??
       
    
        if(hora>=0&&hora<=24){
            this.hora=hora;
        }else{
            this.hora=0;
        }
        if(minuto>=0&&minuto<=60){
            this.minuto=minuto;
        }else{
            this.minuto=0;
        }
        this.segundo=0;
        
        
    } 
    
    
    
    
    
    
    
    public static void main(String[] args) {
       Reloj r1=new Reloj();//utilizamos el constructor sin parámetros pq por defecto es (0,0,0)
       Reloj r2=new Reloj(20,30,45);
       Reloj r3=new Reloj(r2);
       
       r2.ponerenHora(15,45);
        r1.hora12();
        r2.hora12();
        r3.hora12();
        //Formato 24h
        System.out.println("r1 :" +r1.toString());
        System.out.println("r2: " +r2.toString());
        System.out.println("r3: "+ r3.toString());
       //Número de relojes
        System.out.println("Número de relojes: "+ nrelojes);
    }
}
