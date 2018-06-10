package Controlador;

import Modelo.Cliente;
import Modelo.cCorriente;
import Modelo.cJoven;
import Modelo.Cuenta;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.Scanner;

/* * GestionCliente.java  * Creado el  14-mar-2018, 20:08:36  
 * @autor Vicente Martínez Juan * Contacta conmigo en torrent636588336@gmail.com*/
public class GestionCliente {

    static Scanner tec = new Scanner(System.in);
    /*Declaro------------------- = Creo-----------*/
    static ArrayList<Cliente> vectorClie = new ArrayList();
    static int indiceClie = 0; //clientes almacenados

    public static void insertar(Cliente v) {

        vectorClie.add(v);
        System.out.println(v.toString());
    }

    public static Cliente validarme(Cliente c) throws Exception {

        if (vectorClie.indexOf(c) == -1) {
            throw new Exception("Acceso denegado. Pulse intro para continuar");
        } else {
            System.out.println("Acceso permitido");
            return (vectorClie.get(vectorClie.indexOf(c)));
        }
    }

    public static void consultarSaldo(Cliente usuario) {

        Cuenta c = null;

        try {
            Iterator it = usuario.cuenta.iterator();
            if (!it.hasNext()) {
                System.out.println("No hay saldo");
            } else {
                while (it.hasNext()) {
                    c = (Cuenta) it.next();
                    System.out.println(c.getsaldo());
                }
            }
        } catch (Exception e) {
            System.out.println("No hay movimientos en su cuenta");
        }

    }

    public static void movimientos(Cliente usuario) {
        Cuenta c = null;
        try {
            Iterator it = usuario.cuenta.iterator();
            if (!it.hasNext()) {
                System.out.println("No hay movimientos");
            } else {
                while (it.hasNext()) {
                    c = (Cuenta) it.next();
                    System.out.println(c.printMovimientos());
                }
            }
        } catch (Exception e) {
            System.out.println("No hay movimientos en su cuenta");
        }
    }


public static void transferir(Cliente usuario) {
        int i = 0, indexMiCta;
        int indexCtaDestino;
        float importe = 0.0f;
        Cliente cliente = null;

        int nCliente; //indicar el núm de cliente al que transferir
        boolean clieDestino = false; //¿existe cliente destino?
        boolean clie;
        //MOSTRAR MIS CUENTAS---------------------------------------------------
        Cliente.mostrarMisCtas(usuario);
        System.out.print("\nElija una de sus cuentas 0|1|2|3...");
        indexMiCta = tec.nextInt();
        System.out.print("Indique importe ");
        importe = tec.nextFloat();

        //MOSTRAR CLIENTES---------------------------------------------------
        clie = cliente.mostrarClientes(usuario, vectorClie);
        if (clie) {
            System.out.print("Elegir nº cliente ");
            nCliente = tec.nextInt();

            //MOSTRAR LAS CUENTAS QUE NO SON MIAS-----------------------------------
            clieDestino = cliente.mostrarOtrasCtas(nCliente, vectorClie);
            if (clieDestino == true) { //si hemos encontrado cuentas de destino.                        
                System.out.println("Elija la cuenta de destino ");
                indexCtaDestino = tec.nextInt(); //Elijo la cuenta de destino a la que quiero transferir dinero

                //REALIZO LA TRANSFERENCIA------------------------------------------
                boolean salir = false;
                do {
                    try {
                            salir = true;
                            if (usuario.cuenta.get(indexMiCta).transferencia(vectorClie.get(nCliente).cuenta.get(indexCtaDestino), importe)) {
                                System.out.println("Transferencia realizada con éxito");
                            } else {
                                System.out.println("No ha sido posible realizar la transferencia");
                            }

                    } catch (NullPointerException e) {
                        System.out.println("NullPointerException en la transferencia");
                    }

                } while (salir != true);
            } else {
                System.out.println("No existen cuentas de destino");
            }
        } else {
            System.out.println("¡No existen clientes para realizar la transferencia!");
        }

    }

    public static void escribirArchivo(){
        
    }


}
