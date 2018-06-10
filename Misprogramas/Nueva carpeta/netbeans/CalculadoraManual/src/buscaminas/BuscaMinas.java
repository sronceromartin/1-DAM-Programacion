/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import static buscaminas.BuscaMinas.x;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Siby
 */
public class BuscaMinas extends JFrame{
    static  JButton botones[][]=new JButton[3][3];
    static int x;
    static int y;
    static boolean exploto = false;
    private TextField result;
    private JButton reset;
    private JPanel p1;
    private JPanel p2;
    
    
    public BuscaMinas(){
        super();
        configurarBuscaMinas();
        inicializarComponentes();
    
    }
    
    private void configurarBuscaMinas(){
        this.setTitle("Busca Minas");
        this.setSize(250,350);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    private void inicializarComponentes(){
        PonerBomba();// cuando se inicializa el programa se pone la bomba        
        p1=new JPanel();
        p2=new JPanel();
        result=new TextField();
        reset=new JButton("Reset");
        //añado los dos paneles a la ventana        
        this.add(p1);
        
        //añado el gridLayout al panel 1
        p1.setLayout(new GridLayout(3,3));
        
        for(int i=0;i<botones.length;i++){
            for(int j=0;j<botones[0].length;j++){
                //creo los botones
                JButton b=new JButton("O");
                b.setSize(200, 200);
                //metemos b en el array
                botones[i][j]=b;
                //los añado al panel
                p1.add(b);
                //declaro la acción para que se vaya produciendo de cada uno
                b.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent ae) {
                        BActionPerformed(ae);
                    }
                });
            }    
        }
        
        //añadimos las cosas a p2
        this.add(p2); 
        p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
        p2.add(result);
        p2.add(reset);
        
        //para que la ventana se adapte a los componentes
        this.pack();
        
        reset.addActionListener(new java.awt.event.ActionListener (){
            public void actionPerformed(java.awt.event.ActionEvent e){
                ResetActionPerformed(e);

            }

        });

            
        
    }
    private static void PonerBomba(){
        x=(int)(Math.random()*botones.length);//primero debe hacerse la multiplicacion y después el casting
        y=(int)(Math.random()*botones.length);
       
        
    }
    
    private void BActionPerformed(ActionEvent ae){
        
        JButton b=botones[x][y];
        if(exploto==false){
            result.setText("Continue");
        }    
        //direccioin de memoria del boton pulsado que es ae*/ == /*direccion de memoria del boton que tiene la bomba que es b*/)
        if(ae.getSource()==b){
            exploto=true;
            result.setText("BOOM");
        }
                    
                
                
            
    }
    
    private void ResetActionPerformed(ActionEvent e){
        
        //cada vez que se pulse la bomba cambia de sitio
        PonerBomba();
        //esto hace que la caja de texto se limpie cuando lo pulse
        result.setText("");
        exploto=false;
    
            
        
    }        
    
    public static void main(String[] args) {
        BuscaMinas bm=new BuscaMinas();
        bm.setVisible(true);
    }
    
}

