/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FicherosDeTexto;

/**
 *
 * @author Siby
 */
import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;

public class Ejercicio4Bis {

    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        FileReader fr;
        FileReader fr2;
        FileWriter fw;
        BufferedReader filtro = null;
        BufferedReader filtro2 = null;
        BufferedWriter filtro3 = null;
        String fichero1 = null;
        String fichero2 = null;
        String fichero3 = null;
        String linea, linea2 = "";
        try {
            System.out.println("Introduzca el nombre del 1ºfichero: ");
            fichero1 = lector.nextLine();
            System.out.println("Introduzca el nombre del 2º fichero: ");
            fichero2 = lector.nextLine();
            System.out.println("Introduzca el nombre del 3º fichero: ");
            fichero3 = lector.nextLine();
        } catch (InputMismatchException i) {
            System.out.println("Error al introducir los datos");
        }

        File f1 = new File(fichero1);//utilizamos esta clase para poder utilizar la función exists()
        File f = new File(fichero2);
        if (f1.exists() && f.exists()) {
            try {
                fr = new FileReader(fichero1);
                fr2 = new FileReader(fichero2);
                fw = new FileWriter(fichero3);
                filtro = new BufferedReader(fr);
                filtro2 = new BufferedReader(fr2);
                filtro3 = new BufferedWriter(fw);
                //leemos la 1ª linea del fichero1
                linea = filtro.readLine();
                while (linea != null) {
                    //leo la 1ª linea del fichero2
                    linea2 = filtro2.readLine();
                    while (linea2 != null) {
                        //escribimos las lineas en el fichero3
                        filtro3.write(linea + "-" + linea2);
                        filtro3.newLine();//para el salto de linea
                        //leemos el resto del fichero2
                        linea2 = filtro2.readLine();
                    }
                    //leemos la siguiente linea del fichero 1
                    linea=filtro.readLine();
                    
                    filtro2.mark((int)f.length()+1);
                    filtro2.reset();//con esto volvemos a la posicion inicial del fichero2 para poder seguir leyendo cuando tengamos una linea del primero
                    
                }

            } catch (IOException io) {
                System.out.println("Error de lectura");
                System.out.println(io.getMessage());

            } finally {
                try {
                    if (filtro != null) {
                        filtro.close();
                    }
                    if (filtro2 != null) {
                        filtro2.close();
                    }
                    if (filtro3 != null) {
                        filtro3.close();
                    }
                } catch (Exception e) {
                    System.out.println("Error al cerrar el fichero");
                    System.out.println(e.getMessage());

                }
            }
        } else if (f1.exists() && !f.exists()) {
            try {
                fr = new FileReader(fichero1);
                filtro = new BufferedReader(fr);
                fw = new FileWriter(fichero3);
                filtro3 = new BufferedWriter(fw);
                //leemos la 1ª linea del fichero1
                linea = filtro.readLine();
                while (linea != null) {
                    linea = filtro.readLine();
                    filtro3.write(linea);
                    filtro3.newLine();
                }

            } catch (IOException i) {
                System.out.println("Error de lectura");
                System.out.println(i.getMessage());

            } finally {
                try {
                    if (filtro != null) {
                        filtro.close();
                    }
                    if (filtro3 != null) {
                        filtro3.close();
                    }
                } catch (Exception e) {
                    System.out.println("Error al cerrar el fichero");
                    System.out.println(e.getMessage());

                }
            }
        } else if (!f1.exists() && f.exists()) {
            try {
                fr2 = new FileReader(fichero2);
                filtro2 = new BufferedReader(fr2);
                fw = new FileWriter(fichero3);
                filtro3 = new BufferedWriter(fw);
                //leemos la 1ª linea del fichero1
                linea2 = filtro2.readLine();
                while (linea2 != null) {
                    linea2 = filtro.readLine();
                    filtro3.write(linea2);
                    filtro3.newLine();
                }

            } catch (IOException i) {
                System.out.println("Error de lectura");
                System.out.println(i.getMessage());

            } finally {
                try {
                    if (filtro2 != null) {
                        filtro.close();
                    }
                    if (filtro3 != null) {
                        filtro3.close();
                    }
                } catch (Exception e) {
                    System.out.println("Error al cerrar el fichero");
                    System.out.println(e.getMessage());

                }
            }

        } else {
            System.out.println("No existen los ficheros");
        }
    }
}
