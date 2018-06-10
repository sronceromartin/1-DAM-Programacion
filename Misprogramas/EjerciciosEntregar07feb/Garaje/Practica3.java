/*
Desarrollar una clase llamada Practica3 que en su método main:
• Cree un garaje.
• Cree 2 coches.
• El garaje irá cogiendo los coches y devolviéndolos, acumulando un
importe aleatorio (Math.random()) de la avería tratada.
• Si la avería del coche es “aceite” incrementar en 10 los litro de aceite.
• Los coches entrarán al menos 2 veces en el garaje.
• Mostrar la información de los coches al final de main.
 */
package repaso;

/**
 *
 * @author Siby
 */
public class Practica3 {
    public static void main(String[] args) {
        
        //creamos un objeto Garaje
        Garaje g=new Garaje();
        
        //creamos dos objetos coche
        Coche c1=new Coche("Opel","Astra");
        Coche c2=new Coche("Ford","Escort");
	
	//creamos un array con 3 coches

	 Coche c[]=new Coche[3];//declaro el array
         c[0] =new Coche("Opel", "Astra") ;//creo el objeto
        
         c[1]=new Coche("Ford","Focus");
       
         c[2]=new Coche("seat","Ibiza");
       
        
        //El garaje irá cogiendo los coches y devolviéndolos, acumulando un importe aleatorio (Math.random()) de la avería tratada.
        g.aceptarCoche(c1,"Se ha roto una pieza del motor");
        System.out.println("El coche C1 "+ g.getValorAveria() );
        double PrecioAveria1=(double)Math.random()*100;// para que de el importe de la averia
        c1.acumularAveria(PrecioAveria1);
        System.out.println("El precio de la averia es: "+ PrecioAveria1);
        g.devolverCoche();
        //Metemos el coche2
        g.aceptarCoche(c2, "Se ha quedado sin aceite");
        //Si la avería del coche es “aceite” incrementar en 10 los litro de aceite.
        System.out.println("El coche C2 "+ g.getValorAveria() );// para que me imprima la averia que tiene, "g" es la clase donde está la avería
        if(g.getValorAveria() == "Se ha quedado sin aceite"){//se tiene que igualar a lo mismo getValorAveria devolverá "Se ha quedado sin aceite"
            c2.getValorMotor().setValorLitros(10);// necesito un objeto coche, después para poder acceder al objeto motor ponemos su función y luego la función para cambiar los litros de aceite
        }    
        double PrecioAveria=(double)Math.random()*100;// para que de el importe de la averia
        c2.acumularAveria(PrecioAveria);
        System.out.println("El precio de la averia es: "+ PrecioAveria);
        g.devolverCoche();

        
        
        
       
        // Los coches entrarán al menos 2 veces en el garaje.
        
        
        
        // Mostrar la información de los coches al final de main.
        //COCHE 1    
        g.aceptarCoche(c1,"Se ha roto una pieza del motor");
        System.out.println("El coche de la marca: "+ c1.getValorMarca()+ "," + "del modelo :  " + c1.getValorModelo()+ ","+ "tiene la siguiente avería: " + g.getValorAveria());
        System.out.println("El valor acumulado es: "+ c1.getValorPrecioA());
        g.devolverCoche();//para que podamos imprimir los valores del siguiente coche tenemos que sacar este coche del garaje.
        
        
        //COCHE 2
        g.aceptarCoche(c2, "Se ha quedado sin aceite");// tenemos que poner esto aquí para que me pueda decir la avería.
        System.out.println("El coche de la marca: "+ c2.getValorMarca()+ "," + "del modelo: "  + c2.getValorModelo() + "," + "tiene la siguiente avería: " + g.getValorAveria());
        System.out.println("El valor acumulado es: "+ c2.getValorPrecioA());
        g.devolverCoche();

	//array de los 3 coches
	g.aceptarCoche(c[0], "Se ha quedado sin aceite");	
	g.devolverCoche();
	g.aceptarCoche(c[1], "Se ha quedado sin aceite");
	g.devolverCoche();
	g.aceptarCoche(c[2], "Se ha quedado sin aceite");
	g.devolverCoche();

}
}