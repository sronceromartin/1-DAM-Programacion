package Consola;



import Modelo.Cliente;
import Modelo.Cuenta;
import Controlador.GestionCliente;
import Controlador.GestionProducto;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Date;

//para el calculo de las fechas en productos
import java.util.Calendar;
import java.util.GregorianCalendar;
import Modelo.Producto;

/**
 *
 * 
 */
public class BancoApp {

    static Scanner tec = new Scanner(System.in);
    static String dni;
    static String password;
    static Cliente usuario; //USUARIO GENERAL
    static Cliente newUser; //Usuario que se registra

    public static void main(String[] args) {
        int opcInicio;
        boolean salir;
        Date date = new Date(); // Instantiate a Date object 
        System.out.println(date.toString()); // display time and date using toString()

        /**
         * Leer el binario de clientes y cargar los datos al ArrayList
         */
        GestionCliente.cargarBinario();
        //---------------------CONECTAMOS CON LA CAPA CONTROLADOR-------------------
        do {
            opcInicio = menuInicial(); //Llamo al Menu de Inicio..................
            switch (opcInicio) {
                case 1: //acceso
                    System.out.println("Bienvenido al Banco IES");
                    do {
                        try {
                            salir = true;
                            usuario = GestionCliente.validarme(acceso());
                        } catch (Exception e) {
                            System.out.print(e.getMessage());
                            salir = false;
                        }
                    } while (salir != true);
                    menu2();
                    break;
                    
                case 2: //registrase
                    newUser=GestionCliente.insertar(registrase()); //datos del cliente
                    GestionCliente.guardarFichero(); 
                    break;
                    
                case 3: //salir
                    GestionCliente.guardarFichero();
            }
        } while (opcInicio != 3);

    }

    //---------------------MENU INICIAL-----------------------------------------
    /**
     * acceso, registrarse, salir
     */
    static int menuInicial() {
        int opMenu = 0;
        boolean salir;
        do {
            try {
                System.out.println("1 Acceso\n2 Registrarse\n3 Salir");
                opMenu = tec.nextInt();
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("Debe indicar un número");
                tec.nextLine();
                salir = false;
            }
        } while (salir != true);
        return opMenu;
    }

    //-------------------------METODO DE ACCESO---------------------------------
    static Cliente acceso() {
        tec.nextLine();
        System.out.print("Indique el dni ");
        dni = tec.nextLine();
        System.out.print("Indique el password ");
        password = tec.nextLine();
        return new Cliente(dni, password);
    }

    //------------------------METODO PARA REGISTRARSE---------------------------
    static Cliente registrase() {
        String nombre;
        String apellidos;
        String dni;
        String password;
        boolean validarPassw;
        String domicilio; //tipo via, nombreVia, num, pta, codPostal, poblacion
        String telefMovil;

        //Recogemos datos del cliente-------------------------------------------        
        tec.nextLine(); //vaciamos el buffer        
        System.out.print("Nombre ");
        nombre = tec.nextLine();
        //System.out.print("Apellidos "); apellidos=tec.nextLine();
        System.out.print("DNI ");
        dni = tec.nextLine();
        /*System.out.print("Domicilio "); domicilio=tec.nextLine();
        System.out.print("Telefono "); telefMovil=tec.nextLine();*/

        //Recogemos el password-------------------------------------------------
        do {
            System.out.println("Password: debe tener al menos 2 mayúsculas, \n"
                    + "al menos 2 minúsculas "
                    + "y al menos 3 números ");
            password = tec.nextLine();
            validarPassw = esFuerte(password);
            if (validarPassw != true) {
                System.out.println("La contraseña no es suficientemente fuerte");
            }
        } while (validarPassw != true);
        int opCuenta = 1; //por defecto

        do {
            System.out.println("Debe elegir el tipo de Cuenta a generar\n"
                    + "1. Cuenta Corriente\n"
                    + "2. Cuenta Joven");
            try {
                opCuenta = tec.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Debe indicar un núm.");
                tec.nextLine();
            }
        } while (opCuenta != 1 && opCuenta != 2);

        return new Cliente(nombre, "", dni, "", "", password, opCuenta);

    }

    //----------------------METODO FORTALEZA DEL PASSWORD-----------------------
    static boolean esFuerte(String p) { // ¿es suficientemente fuerte la contraseña?
        int nums = 0, mins = 0, mays = 0;
        //Vamos caracter a caracter y comprobamos que tipo de caracter es
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) >= 97 && p.charAt(i) <= 122) {
                mins += 1; //cuento minúsculas    
            } else if (p.charAt(i) >= 65 && p.charAt(i) <= 90) {
                mays += 1; //cuento mayúsculas      
            } else {
                nums += 1; //cuento números
            }
        }
        return nums >= 3 && mins >= 2 && mays >= 2; //características de la contraseña
    }

    //------------------------SEGUNDO MENU--------------------------------------
    /**
     * Saldo, productos contratados, contratrar productos, transferencia, movimientos
     */
    static void menu2() {
        int opc = 5;
        boolean salir;
        do {
            do {
                salir = true;
                System.out.println("1 Consultar saldo y productos contratados"
                        + "\n2 Contratar Productos"
                        + "\n3 Transferencia"
                        + "\n4 Ver últimos movimientos"
                        + "\n5 Volver atrás");
                try {
                    opc = tec.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("No es un entero");
                    tec.nextLine();
                    salir = false; // en caso de error, vuelve a repetir este menu
                }
            } while (salir != true);

            switch (opc) {
                case 1: //consultar saldo

                    GestionCliente.consultarSaldo(usuario);
                    GestionProducto.consultarProductos(usuario);
                    break;
                case 2: //Contratar productos
                    menu3();
                    break;
                case 3: //Transferencia                    
                    GestionCliente.transferir(usuario);
                    break;
                case 4: //Ver últimos movimientos
                    GestionCliente.movimientos(usuario);
                    break;
            }
        } while (opc > 0 && opc < 5);
    }

    //-------------------------TERCER MENU------------------------------
    /**
     * Contratar tarjetas, plan de pensiones
     */
    static void menu3() {
        int opc = 5;
        boolean salir;
        do {
            System.out.println("----CONTRATAR PRODUCTOS-----");
            do {
                salir = true;
                System.out.println("1 Contratar Tarjetas "
                        + "\n2 Contratar Hipotecas: ¡No disponible!"
                        + "\n3 Contratar Fondos de Inversión ¡No disponible!"
                        + "\n4 Contratar Plan de Pensiones"
                        + "\n5 Volver atrás");
                try {
                    opc = tec.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("No es un entero");
                    tec.nextLine();
                    salir = false; // en caso de error, vuelve a repetir este menu
                }
            } while (salir != true);

            switch (opc) {
                case 1: //Contratar Tarjetas
                    int diaAct,
                     mesAct,
                     anyoAct,
                     anyoFut;
                    String fechaActual,
                     fechaCaducidad;
                    int opcT;
                    //Fechas de contratación y Finalización---------------------
                    Calendar fechaAct = new GregorianCalendar();
                    diaAct = fechaAct.get(GregorianCalendar.DAY_OF_MONTH);
                    mesAct = fechaAct.get(GregorianCalendar.MONTH) + 1;//es debido a que el mes empieza por 0
                    anyoAct = fechaAct.get(GregorianCalendar.YEAR);

                    anyoFut = anyoAct + 1;
                    fechaActual = String.valueOf(diaAct);
                    fechaActual = fechaActual.concat("/") + String.valueOf(mesAct);
                    fechaActual = fechaActual.concat("/") + String.valueOf(anyoAct);
                    fechaCaducidad = fechaActual.replaceAll(String.valueOf(anyoAct), String.valueOf(anyoFut));
                    //Tarjtas a contratar---------------------------------------
                    System.out.println("¿Qué tarjeta desea contratar?"
                            + "\n1.- Tarjeta de Débito"
                            + "\n2.- Tarjeta de Crédito");
                    try {
                        opcT = tec.nextInt();
                        if (opcT == 1) { // 1 o 2 es el digito del tipo de tarjeta que quiere
                            GestionProducto.contratarProducto(fechaActual, fechaCaducidad, dni, opcT, 0, 0.0, usuario);
                        } else if (opcT == 2) {
                            GestionProducto.contratarProducto(fechaActual, fechaCaducidad, dni, opcT, 0, 0.0, usuario);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2: //Contratar Hipotecas
                    /*carlos y pedro*/
                    break;
                case 3: //Fondos de Inversión                   
                    /*Jose*/
                    break;
                case 4: //Plan de Pensiones
                    /*sibyla*/
                    System.out.println("¿Qué producto desea contratar?" + "\n1.- Plan de pensiones fijo" + "\n2.- Plan de pensiones variable ");
                    int diaA,
                     mesA,
                     anyoA,
                     anyoF,
                     aRestantes,
                     edadActual;
                    final int EJUBILA = 67;
                    String fechaA,
                     fechaCad;
                    double cMensual;

                    int op = tec.nextInt();

                    System.out.println("Introduce tu edad");
                    edadActual = tec.nextInt();
                    aRestantes = EJUBILA - edadActual;

                    Calendar fechaHoy = new GregorianCalendar();
                    diaA = fechaHoy.get(GregorianCalendar.DAY_OF_MONTH);
                    mesA = fechaHoy.get(GregorianCalendar.MONTH) + 1;//es debido a que el mes empieza por 0
                    anyoA = fechaHoy.get(GregorianCalendar.YEAR);

                    anyoF = anyoA + aRestantes;
                    fechaA = String.valueOf(diaA);
                    fechaA = fechaA.concat("/") + String.valueOf(mesA);
                    fechaA = fechaA.concat("/") + String.valueOf(anyoA);
                    fechaCad = fechaA.replaceAll(String.valueOf(anyoA), String.valueOf(anyoF));

                    //---------------------------------------------------------------
                    System.out.println("Introduce la cuota mensual: ");
                    cMensual = tec.nextDouble();
                    //---------------------------------------------------------------
                    try {
                        if (op == 1) {
                            GestionProducto.contratarProducto(fechaA, fechaCad, dni, 3, edadActual, cMensual, usuario);
                        } else if (op == 2) {
                            GestionProducto.contratarProducto(fechaA, fechaCad, dni, 4, edadActual, cMensual, usuario);
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("");

                    }
                    break;
            }
        } while (opc > 0 && opc < 5);
    }
}
