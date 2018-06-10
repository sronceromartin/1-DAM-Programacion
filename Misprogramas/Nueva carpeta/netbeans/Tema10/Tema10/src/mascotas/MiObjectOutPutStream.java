/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotas;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author ASIR 7L
 */
public class MiObjectOutPutStream extends  ObjectOutputStream{
    /** Constructor que recibe OutputStream */
 public MiObjectOutPutStream(OutputStream out) throws IOException
 {
        super(out);
 }
 /** Constructor sin parámetros */
 protected MiObjectOutPutStream() throws IOException, SecurityException
 {
        super();
 }
@Override
 /** Redefinición del método de escribir la cabecera para que no haga nada. */
 protected void writeStreamHeader() throws IOException
 {
 }
}

