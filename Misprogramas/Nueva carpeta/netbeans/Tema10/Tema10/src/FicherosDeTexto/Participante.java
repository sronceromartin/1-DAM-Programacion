/*
 Crear aplicación que guarde el registro de los participantes de una carrera
De cada participante tenemos el nombre y la dorsal (int).
Los participantes se guardarán sin repetirse (la dorsal) y en orden (según la
dorsal).(TreeSet)(Implementar Comparable y sobreescribir equals y hashCode)
El programa pide los datos de los participantes y los va guardando en memoria. Cuando se
selecciona la opción de finalizar, guarda los datos en un fichero xml con la siguiente estructura
<?xml version="1.0">
<carrera>
<participante>
<dorsal></dorsal>
<nombre></nombre>
</participante>
</carrera>

 */
package FicherosDeTexto;

/**
 *
 * @author ASIR 7L
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
class XML {
     static Scanner lector=new Scanner(System.in);
     static TreeSet<Participante>participantes=new TreeSet();// lo sacamos fuera para poder utilizarzo en el menu
    public static void main(String[] args) throws Exception {
        
        boolean finalizar=false;
        String nombre;
        int dorsal=0;
        Participante p;
        int opc=0;
        
        do{
            opc=menu();
            // no hacemos comparación de los dorsales aquí ya que con el equals y hashcode compara y no dejan que se repitan los dorsales, están en la clase participante
            switch(opc){
                case 1://Introducir datos
                    lector.nextLine();
                    System.out.println("Introduzca su nombre: ");
                    nombre=lector.nextLine();
                    System.out.println("Introduzca el dorsal: ");
                    dorsal=lector.nextInt();
                    p= new Participante(nombre,dorsal);
                    if(participantes.add(p)==true){
                        System.out.println("El participante ha sido añadido");
                    }else{
                        System.out.println("El dorsal está repetido");
                    }
                       break;
               
                
                case 2:
                   System.out.println("Hasta pronto");
                   guardarDatos();
                   finalizar=true;   
            }
        }while(finalizar!=true);
    }
    public static int menu(){
        int opcion;
        //recorro la lista para imprimir su contenido antes de que salga el menú al usuario
        System.out.println("---Estos son los participantes---");
        Iterator <Participante> ir=participantes.iterator();
        while(ir.hasNext()){
            System.out.println(ir.next());
        }
        System.out.println("Introduzca la opción que desee: \n"+ "1-Introducir datos\n "+ "2-Salir\n ");
        opcion=lector.nextInt();
        return opcion;
    }
    
    public static void guardarDatos(){
        FileWriter fw;
        BufferedWriter filtro=null;
        String fichero="carrera.txt";
        
        try{
            fw=new FileWriter(fichero);
            filtro=new BufferedWriter(fw);
            Iterator <Participante> ir=participantes.iterator();
            //para poder escribir como en un documento xml, tenemos que poner las etiquetas respectivas
            filtro.write("<?xml version=\"1.0\">");
            filtro.newLine();
            filtro.write("<carrera>");
            filtro.newLine();
            while(ir.hasNext()){// utilizo un iterator para recorrer el TreeSet
                Participante p = ir.next();// hago esta variable para que solo me haga una vez el next en la lista, pq sino no me escribiría el dorsal, saltaría de un nombre al otro
                filtro.write("<participante>");
                filtro.newLine();
                filtro.write("<nombre>"+p.getNombre()+ "</nombre>");// me escribe los nombres en todo el fichero
                filtro.newLine();//para hacer el salto de linea
                filtro.write("<dorsal>"+p.getDorsal()+"</dorsal>");// el dorsal para que se me salga en el archivo tengo que ponerlo como un String, para ello tengo que concatenarlo
                filtro.newLine();//para hacer el salto de linea
                filtro.write("</participante>");
                filtro.newLine();
            }
            filtro.write("</carrera>");
            filtro.newLine();    
            
        
        }catch(IOException e){
            System.out.println("Error de escritura");
            System.out.println(e.getMessage());
        }finally{    
            try{
                if(filtro!=null){
                    filtro.close();
                }
            }catch(Exception e){
                System.out.println(e.getMessage());    
            }
            
        }    
            
    }
}

public class Participante implements Comparable{
   
    private String nombre;
    private int dorsal;
    
    public Participante(String nom,int dorsal){
        this.nombre=nom;
        this.dorsal=dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDorsal() {
        return dorsal;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.dorsal;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Participante other = (Participante) obj;
        if (this.dorsal != other.dorsal) {
            return false;
        }
        return true;
    }

    public int compareTo(Object p) {
        Participante p1=(Participante)p;//downCasting
        if(this.dorsal >p1.dorsal){
            return 1;
        }else if(this.dorsal==p1.dorsal){
            return 0;
        }
        return -1;
    }
    
    
    
    public String toString(){
        return "Nombre: "+ this.getNombre() + "Dorsal: " + this.getDorsal();// con el this es como llamar a 
    
    }
    

}