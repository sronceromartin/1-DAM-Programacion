/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu2;

import conPanel.Operacion;
import static conPanel.Ventana.operador1;
import static conPanel.Ventana.operador2;
import static conPanel.Ventana.operando;
import java.awt.BorderLayout;
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
public class VentanaCalcu2 extends JFrame{
    
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private static ArrayList <JButton>botones=new ArrayList<JButton>();
    private JButton suma;
    private JButton resta;
    private JButton mult;
    private JButton div;
    private JButton igual;
    private JButton refrescar;
    private TextField texto;
    public static int operador1;
    public static int operador2;
    public static Operacion operando;
    
    public VentanaCalcu2(){
        super();
        configurarVentanaCalcu2();
        inicializarComponentes();
    
    }
    
    private void configurarVentanaCalcu2(){
        this.setTitle("Cacluladora manual extendida");
        this.setSize(250,350);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    private void inicializarComponentes(){
        panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        suma=new JButton("+");
        resta=new JButton("-");
        mult=new JButton("*");
        div=new JButton("/");
        igual=new JButton("=");
        refrescar=new JButton("Refrescar");
        texto=new TextField();
        
        this.add(panel1,BorderLayout.NORTH);
        panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));
        panel1.add(texto);
        panel1.add(refrescar);
        
        //añadimos el panel 2 a la ventana
        this.add(panel2,BorderLayout.CENTER);
        panel2.setLayout(new GridLayout(3,3));
        //se crean los botones
        for(int i=0;i<10;i++){
            botones.add(new JButton());
        }
        //los meto en el panel
        for(JButton j:botones){
            panel2.add(j);
            j.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent ae) {
                    JActionPerformed(ae);
                }
            });
        }
        
        
        this.add(panel3,BorderLayout.SOUTH);
        panel3.setLayout(new GridLayout(2,3));
        panel3.add(mult);
        panel3.add(div);
        panel3.add(suma);
        panel3.add(resta);
        panel3.add(igual);
        
            igual.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent ae) {
                            IgualActionPerformed(ae);
                           
                        }
            });
            
            refrescar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent ae) {
                            RefrescarActionPerformed(ae);
                        }
            });
            
            suma.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent ae) {
                            SActionPerformed(ae);
                        }
            });
            
            resta.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent ae) {
                            RActionPerformed(ae);
                        }
            });
            mult.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent ae) {
                            MActionPerformed(ae);
                        }
            });
            div.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent ae) {
                           DiviActionPerformed(ae);
                        }
            });
            
            
        
    
    }
    
    
    private void JActionPerformed(ActionEvent e){
        String valori=texto.getText();
        String valorf=((JButton)e.getSource()).getText();
        texto.setText(valori.concat(valorf));
    
    }
       private void IgualActionPerformed(ActionEvent a){
        operador2 = Integer.parseInt(texto.getText());
                switch(operando)
                {
                    case Suma:
                        int res = operador1 + operador2;
                        texto.setText(Integer.toString(res));
                        break;
                    case Resta:
                        int res2 = operador1 - operador2;
                        texto.setText(Integer.toString(res2));
                        break;
                    case Multiplicacion:
                        int res3=operador1*operador2;
                        texto.setText(Integer.toString(res3));
                        break;
                    case Division:
                        double operador1d = (double)operador1;
                        double operador2d=(double)operador2;
                        double res4=operador1d/operador2d;
                        texto.setText(Double.toString(res4));
                }
    
    }
    
    private void RefrescarActionPerformed(ActionEvent e){
        texto.setText("");
    }
    private void SActionPerformed(ActionEvent i){
        operador1=Integer.parseInt(texto.getText());
        texto.setText("");
        operando = Operacion.Suma;
    
    }
    private void RActionPerformed(ActionEvent e){
        operador1=Integer.parseInt(texto.getText());
        texto.setText("");
        operando = Operacion.Resta;
    
    }
    
    private void MActionPerformed(ActionEvent e){
        operador1=Integer.parseInt(texto.getText());
        texto.setText("");
        operando = Operacion.Multiplicacion;
    
    }
    
    private void DiviActionPerformed(ActionEvent a){
        operador1= Integer.parseInt(texto.getText());
        texto.setText("");
        operando = Operacion.Division;
    }

    
    public static void main(String[] args) {
        VentanaCalcu2 c=new VentanaCalcu2();
        c.setVisible(true);
        ArrayList <Integer> numeros=new ArrayList <Integer>();
        // recorremos el arrayList de números para añadirle los números del 1 al 9
        for(int i=0;i<10;i++){
            numeros.add(i);
        }
        int pos;
        //añadimos los números al array de JButton
        for(int j=0;j<botones.size();j++){// van del 0 al último elemento del arrayL
            JButton b= botones.get(j); //con esto guardamos los valores del arrayL en una variable de tipo boton
            pos=(int)(Math.random()*numeros.size()-1); //lo multim¡plicamos por el número de elementos que hay
            String texto = numeros.get(pos).toString();// transformamos los números en strings para que se pongan en los botones, utilizamos el get para poder acceder a la linkedList
            numeros.remove(pos);
            b.setText(texto);// con esto hacemos que el boton tenga texto
        }
        
        
    }
    
}
