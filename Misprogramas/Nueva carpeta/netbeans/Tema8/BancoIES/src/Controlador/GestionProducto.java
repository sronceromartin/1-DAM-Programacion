package Controlador;

import static Controlador.GestionCliente.vectorClie;
import static Controlador.GestionCliente.indiceClie;
import Modelo.Cliente;
import Modelo.TarjetaDeCredito;
import Modelo.TarjetaDeDebito;
import Modelo.cCorriente;
import Modelo.cJoven;
import Modelo.Cuenta;
import Modelo.PlanFijo;
import Modelo.PlanPensiones;
import Modelo.PlanVariable;
import java.util.Iterator;
import java.util.Scanner;

/* * GestionProducto.java  * Creado el  18-mar-2018, 18:09:02  
 * @autor Vicente Martínez Juan * Contacta conmigo en torrent636588336@gmail.com*/
public class GestionProducto {

    static Scanner tec = new Scanner(System.in);

    public static void contratarProducto(String fechaI, String fechaF, String dni, int tipoProd, int edadActual, double cMensual, Cliente usuario) {
        int i = 0, indexMiCta;
        do {


                System.out.println(usuario.toString()); //mostramos los datos del cliente
                try {
                    //MOSTRAR MIS CUENTAS---------------------------------------------------
                    Cliente.mostrarMisCtas(usuario);
                    System.out.print("\nElija una de sus cuentas 0|1|2|3...");
                    indexMiCta = tec.nextInt(); //elegimos el índice de la cuenta

                    if (tipoProd == 1) {//insertamos una tardeja de débito------   
                        //a la cuenta le asociacmos el arraylist prod  y le insertamos un producto
                        if (usuario.cuenta.get(indexMiCta).prod.add(new TarjetaDeDebito(fechaI, fechaF))) {
                            System.out.println("Tarjeta de débito añadida");
                        }
                    }
                    if (tipoProd == 2) {//insertamos una tarjeta de crédito----- 
                        if (usuario.cuenta.get(indexMiCta).prod.add(new TarjetaDeCredito(fechaI, fechaF))) {
                            System.out.println("Tarjeta de crédito añadida");
                        }
                    }
                    if (tipoProd == 3) {//Plan de pensiones fijo----- 
                        if (usuario.cuenta.get(indexMiCta).prod.add(new PlanFijo(fechaI, fechaF, edadActual, cMensual))) {
                            System.out.println("Plan de Pensiones fijo añadido");
                        }
                    }
                    if (tipoProd == 4) {//Plan de pensiones variable----- 
                        if (usuario.cuenta.get(indexMiCta).prod.add(new PlanVariable(fechaI, fechaF, edadActual, cMensual))) {
                            System.out.println("Plan de Pensiones variable añadido");
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Error de inserción NullPointerException");
                }

            i++;
        } while (i < indiceClie);
    }

    public static void consultarProductos(Cliente usuario) {
        Cuenta c;

        try {
            Iterator it = usuario.cuenta.iterator();
            while (it.hasNext()) {
                c = (Cuenta) it.next();
                System.out.println(c.printProductosContratados());
            }
        } catch (Exception e) {
            System.out.println("No tiene productos contratados");
        }
    }
}
