package Controlador;

import Modelo.Cliente;
import Modelo.cCorriente;
import Modelo.cJoven;
import Modelo.Cuenta;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GestionCliente {

    static Scanner tec = new Scanner(System.in);
    /*Declaro------------------- = Creo-----------*/
    static ArrayList<Cliente> vectorClie = new ArrayList();
    static int indiceClie = 0; //clientes almacenados

    /**
     * ANTES DE ACCEDER O REGISTRARSE, CARGAR BINARIO EN EL ARRAYLIST
     */
    public static void cargarBinario() {
        //DEFINIR VARIABLES DE ACCESO A FICHEROS. DECLARACION DE OBJETOS        

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        String nFichero = "clientes.dat";
        File f = new File(nFichero);
        try {
            //CONSTRUCTORES. CREAR OBJETOS DE ACCESO A FICHEROS. FLUJO DE DATOS
            if (f.exists()) {
            fis = new FileInputStream(nFichero);
            ois = new ObjectInputStream(fis);
            
                Object aux = ois.readObject();
                while (aux != null) {
                    if (aux instanceof Cliente) {
                        Cliente c = (Cliente) aux;
                        vectorClie.add(c);//lo añado al ArrayList
                        aux = ois.readObject();
                    }
                }
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage() + "...");
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                    //System.out.println("Fichero cerrado");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static Cliente insertar(Cliente v) {
        vectorClie.add(v);
        System.out.println(v.toString() + " " + v.cuenta.toString());
        return v;
    }

    /**
     * Se guarda el nuevo cliente en el fichero
     *
     * @param p cliente que se registra
     */
    public static void guardarFichero() {

        //DEFINIR VARIABLES DE ACCESO A FICHEROS. DECLARACION DE OBJETOS 
        FileOutputStream fos = null;

        MiObjectOutputStream moos = null; //en el caso de que exista el archivo
        ObjectOutputStream oos = null;    //en el caso de que no exista el archivo
        String nFichero = "clientes.dat";
        int i=0;
        File f = new File(nFichero);
        try {
            //CONSTRUCTORES. CREAR OBJETOS DE ACCESO A FICHEROS. FLUJO DE DATOS

                fos = new FileOutputStream(nFichero);
                oos = new ObjectOutputStream(fos);
                for(Cliente c : vectorClie){ 
                    //System.out.println("Escribiendo..." + c.toString());
                     oos.writeObject(c);                     
                }

        } catch (Exception e) {
            System.out.println(e.getMessage() + "...");
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                    System.out.println("Fichero cerrado");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static Cliente validarme(Cliente c) throws Exception {


        if (vectorClie.indexOf(c) == -1) {
            throw new Exception("Acceso denegado. \nPulse intro para continuar...");
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
                    System.out.println("Cuenta: " + c.getnCuenta() + " : " + c.getsaldo() + "€");
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

    static class MiObjectOutputStream extends ObjectOutputStream {

        public MiObjectOutputStream(OutputStream out) throws IOException {
            super(out);
        }

        //Constructor sin parametros
        public MiObjectOutputStream() throws IOException, SecurityException {
            super();
        }

        //Redefinicion del metodo de escribir la cabecera para que no haga nada
        @Override
        protected void writeStreamHeader() throws IOException {

        }
    }

}
