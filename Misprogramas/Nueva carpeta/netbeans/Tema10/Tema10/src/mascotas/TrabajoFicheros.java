/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import mascotas.Mascota;

/**
 *
 * @author ASIR 7L
 */
public class TrabajoFicheros {

    static ArrayList<Persona> p = new ArrayList();
    //Operaciones con ficheros, podrían estar en otra clase

    public static void guardar(Persona p) {
        FileOutputStream fos;
        ObjectOutputStream filtro = null;
        try {
            File f = new File("pru.dat");

            if (f.exists()) { //Si el fichero existe
                fos = new FileOutputStream(f, true); //se abre para añadir
                filtro = new MiObjectOutputStream(fos); //utilizo el filtro que no añade cabecera
            } else { //si no existe
                fos = new FileOutputStream(f); //se crea
                filtro = new ObjectOutputStream(fos); //se utiliza el filtro original,el que escribe cabecera
            }
            filtro.writeObject(p);
        } catch (Exception e) {
            System.out.println("error");
        } finally {
            try {
                if (filtro != null) {
                    filtro.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar");
            }
        }
    }

    public static void listar() {
        File f = new File("pru.dat");
        if (f.exists() && f.isFile()) { //tiene sentido si pedimos el nombre del fichero por teclado
            try {
                FileInputStream fis = new FileInputStream(f);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Persona p = (Persona) ois.readObject();
                while (p != null) {
                    System.out.println(p);
                    p = (Persona) ois.readObject();
                }
            } catch (Exception e) {
                System.out.println("error");
            }
        }
    }

    public static void guardar_lista(ArrayList<Persona> l, File f) {
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(f);
            oos = new ObjectOutputStream(fos);

            for (Persona p : l) {
                oos.writeObject(p);
            }
        } catch (Exception e) {

        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (Exception e) {

            }
        }
    }

    public static void cargar_lista(ArrayList<Persona> l, File f) {
        ObjectInputStream ois = null;
        if (f.exists() && f.isFile()) { //comprobamos si existe el fichero para que no  nos de un error
            try {
                FileInputStream fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                Object aux = ois.readObject();
                while (aux != null) {
                    if (aux instanceof Persona) {
                        l.add((Persona) aux);//añado al arrayList el objeto que tengo en la variable auxiliar
                    }
                    aux = ois.readObject();

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());

            } finally {
                try {
                    if (ois != null) {
                        ois.close();
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}