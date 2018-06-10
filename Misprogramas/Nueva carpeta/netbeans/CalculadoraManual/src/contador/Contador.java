/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Siby
 */
public class Contador extends JFrame{
    private JButton up;
    private JButton down;
    private TextField texto;
    private JPanel panel;
    private JPanel panel2;
    static int i=0;// la uitlizo para inicializar a 0 el cuadro de texto y para que a partir de aqui vaya aumentando o decrementando
    
    public Contador(){
        super();
        configurarContador();
        inicializarComponentes();
    }
    
    private void configurarContador(){
        this.setTitle("Contar números");
        this.setSize(430,330);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    private void inicializarComponentes(){
        up=new JButton("+");
        down=new JButton("-");
        texto=new TextField(10);
        // lo pongo aquí para que siempre haya un 0 al principio
        
        texto.setText(Integer.toString(i));// lo pongo aquí para que siempre haya un 0 al principio
        panel=new JPanel();
        panel2=new JPanel();
        
        this.add(panel,BorderLayout.CENTER);
        panel.add(texto,BorderLayout.CENTER);
        
        this.add(panel2,BorderLayout.EAST);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.add(up,BorderLayout.NORTH);
        panel2.add(down,BorderLayout.SOUTH);
        this.pack();
        
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                UpActionPerformed(evt);
            }
        });
        down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                DownActionPerformed(evt);
            }
        });

    }
    private void UpActionPerformed(ActionEvent e){
        i++;
        texto.setText(Integer.toString(i));
    
    }
    private void DownActionPerformed(ActionEvent d){
        i--;
        texto.setText(Integer.toString(i));
    
    }
    
    
    public static void main(String[] args) {
        Contador c=new Contador();
        c.setVisible(true);
    }
    
    
    
}
