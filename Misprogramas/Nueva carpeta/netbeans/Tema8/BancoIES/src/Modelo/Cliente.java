package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Objects;

/* * Clientes.java  * Creado el  06-mar-2018, 8:28:36  
 * @autor Vicente Martínez Juan * Contacta conmigo en torrent636588336@gmail.com*/
public class Cliente {

    private String nombre = "Administrador";
    private String apellidos = "Admin";
    private String dni = "0000"; //nos validamos con dni y password
    private String password = "000AAaa";
    private String domicilio = "Ies Abastos"; //tipo via, nombre vía, núm, pta, codPostal, localidad, Pais
    private String telefMovil = "636588336";
    private Date fechaNcto;
    public ArrayList<Cuenta> cuenta = new ArrayList();

    public Cliente() {
    }

    public Cliente(String dni, String password) { //lo utilizamos para el metodo acceso
        this.dni = dni;
        this.password = password;
    }

    public Cliente(String nombre, String apellidos, String dni, String domicilio, String telefMovil, String password, int opCuenta) {  //genero dos cuentas diferentes para el cliente
        this.nombre = nombre;
        this.password = password;
        this.dni = dni;
        if (opCuenta == 1) //puedo generar dos cuentas diferentes para el cliente
        {
            cuenta.add(new cCorriente());
        }
        if (opCuenta == 2) {
            cuenta.add(new cJoven());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.dni);
        hash = 41 * hash + Objects.hashCode(this.password);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }


    public static void mostrarMisCtas(Cliente usuario) {
        int i = 0, j = 0;
        Cuenta c;
        System.out.println("----MIS CUENTAS----");

        try {
            Iterator it = usuario.cuenta.iterator();
            while (it.hasNext()) {
                c = (Cuenta) it.next(); //c apunta a una cuenta hija                       
                System.out.println("Cuenta " + j + ".- " + c.printDatosCuentaBase());
                j++;
            }
        } catch (Exception e) {
            System.out.println("Cuentas Error NullPointerException");
        }
    }

    public static boolean mostrarClientes(Cliente usuario, ArrayList<Cliente> vectorClie) {
        int i = 0;
        boolean existen = false;
        System.out.print("\nCuentas de otros clientes\n ");

        for (Cliente c : vectorClie) {
            if (!c.equals(usuario)) {
                System.out.println("Cliente: " + vectorClie.indexOf(c) + " " + c.printDatosBase());
                existen=true;
            }
        }
        i++;
        return existen;
    }

    public static boolean mostrarOtrasCtas(int nCliente, ArrayList<Cliente> vectorClie) {
        int i = 0, j = 0;
        Cuenta c;
        Cliente cli;
        System.out.println("----SUS CUENTAS----");

        try {
            cli = vectorClie.get(nCliente);
            Iterator it = cli.cuenta.iterator();
            while (it.hasNext()) {
                c = (Cuenta) it.next(); //c apunta a una cuenta hija                       
                System.out.println("Cuenta " + j + ".- " + c.printDatosCuentaBase());
                j++;
            }
        } catch (Exception e) {
            System.out.println("Cuentas Error NullPointerException");
        }
        if(j!=0)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "\n---DATOS CLIENTE---\n" + nombre + " " + apellidos
                + "\nDNI " + " " + dni
                + "\nDomicilio " + domicilio
                + "\nPassword " + password;
    }

    public String printDatosBase() {
        return "Datos cliente "
                + nombre + " " + apellidos;
    }
}
