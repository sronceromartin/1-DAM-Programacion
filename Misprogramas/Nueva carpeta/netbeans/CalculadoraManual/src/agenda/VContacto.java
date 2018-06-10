/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Siby
 */
public class VContacto extends JFrame {
    private JLabel e1;
    private JLabel e2;
    //private JLabel datos;lo sustituimos por TextArea
    private TextArea datos;
    private JButton introducir;
    private JTextField Cnombre;
    private JTextField Ctelf;
    private JPanel panel;
    private JPanel panel2;
    public VContacto(){
        super();
        configurarVContacto();
        inicializarComponentes();

    }
    
    private void configurarVContacto(){
        this.setTitle("Agenda");
        this.setSize(230,330);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    
    }
    
    private void inicializarComponentes(){
        panel=new JPanel();
        panel2=new JPanel();
        e1=new JLabel("Nombre:");
        Cnombre=new JTextField(10);//si se lo pongo dentro es el número de caracteres que admite y determinará el tamaño
        e2=new JLabel("Telefono:");
        Ctelf=new JTextField(10);//si se lo pongo dentro es el número de caracteres que admite y determinará el tamaño
        //datos=new JLabel();
        datos=new TextArea(20,20);
        introducir=new JButton("Introducir");
        
        
        //añadimos el panel en su posicion
        this.add(panel,BorderLayout.NORTH);
        panel.setLayout(new FlowLayout());
        panel.add(e1);//añadimos la 1ªetiqueta al panel
        panel.add(Cnombre);//añadimos la 2ª
        panel.add(e2);//añadimos la 3ª
        panel.add(Ctelf);//añadimos la 4ª
        
        
        
        this.add(datos,BorderLayout.CENTER);
        //panel2 no tiene setLAyout
        this.add(panel2,BorderLayout.EAST);
        panel2.add(introducir);
        introducir.setSize(20,20);
        this.pack();
        introducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                introducirActionPerformed(evt);
            }
        });
    }
    private void introducirActionPerformed(ActionEvent e){
        String texto;
        String dInicial;
        
        if((!Cnombre.getText().equals(""))&&(!Ctelf.getText().equals(""))){
            texto=Cnombre.getText().concat ("(").concat(Ctelf.getText()).concat(")");
            dInicial=datos.getText();//se guarda el dato introducido
           datos.setText(dInicial.concat(texto).concat("\n"));
           Cnombre.setText("");//borro lo que hay en la caja de texto
           Ctelf.setText("");
        //}else{
            //new JDialog("Por favor introduzca un nombre y un teléfono");
            //JDialog dialog = new JDialog(new JFrame(), "hello JCGs");
            //dialog.setVisible(true);
        }
        
    }
    public static void main(String[] args) {
        VContacto a=new VContacto();
        a.setVisible(true);
        
    }

    
}
