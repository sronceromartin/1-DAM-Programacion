/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Clase Ventana
 * Muestra la estructuta que deberia tener una Ventana en Java con la libreria
 * Swing, contiene una etiqueta, un caja de texto y un boton, que tiene la
 * accion de mostrar el texto en la caja por una ventana de mensaje.
 */
public class Ventana extends JFrame implements ActionListener {
    private JButton botonS;
    private JButton botonR;
    private JLabel Resultado;
    private JTextField caja;
    private JTextField caja2;
    /*private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7;
    private JButton boton8;
    private JButton boton9; 
    private JButton boton0;*/
    //private JButton boton;
    
    //private JButton botonR;
    //private JButton botonM;
    //private JButton botonD;
    //private JButton botonI;
   
    //private JButton boton[];
    
    public Ventana() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }
    private void configurarVentana() {
        this.setTitle("Mi super calculadora");                   // colocamos titulo a la ventana
        this.setSize(410, 310);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }
    private void inicializarComponentes() {
        // creamos los componentes
        Resultado = new JLabel();
        botonS = new JButton();
        botonR=new JButton();
        caja=new JTextField();
        caja2=new JTextField();
        /*for(int i=0;i<10;i++){
            boton[i]=new JButton(i+ "");//concatenamos la i con comillas para que me lo considere como una cadena de texto y no me de fallo, también se podría utilizar boton[i]=new JButton(String.valueOf(i); 
        
        }*/
        
        //botonR = new JButton();
       // botonD = new JButton();
        //botonM = new JButton();
        //botonI = new JButton();
        // configuramos los componentes
        Resultado.setBounds(250, 50, 100, 25);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        caja.setBounds(50, 100, 100, 25); 
        caja2.setBounds(50,150,100,25);
        botonS.setBounds(250, 150, 100, 20);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        botonS.setText("+");
        botonR.setBounds(250,200,100,20);
        botonR.setText("-");
        // adicionamos los componentes a la ventana
        this.add(caja);
        this.add(caja2);
        this.add(Resultado);
        this.add(botonS);
        this.add(botonR);
        //hacemos que el botón tenga una acción
        botonS.addActionListener(new java.awt.event.ActionListener() {//lo que tiene dentro del paréntesis es el oyente
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonSActionPerformed(evt);
            }

            
        });//creamos una clase anónima para que esté dentro de la clase ventana y poder acceder a los atributos de la ventana y además creamos y declaramos un objeto a la vez
        
        botonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonRActionPerformed(evt);
            }
        });    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //hacemos que el botón tenga una acción
        botonS.addActionListener(this);
        botonR.addActionListener(this);
    }
    
    private void botonRActionPerformed(ActionEvent e){
        double numUno = (Double.parseDouble(caja.getText()));
        double numDos = (Double.parseDouble(caja2.getText()));
        // Realizar la suma
        double resultadoResta = numUno - numDos;
        // Indicar el resultado en la etiqueta
        Resultado.setText("" + resultadoResta);

    }
    private void botonSActionPerformed(ActionEvent evt) {
                   // TODO add your handling code here:
         //Convertir los textos de los JTextEdit en números.
        double numUno = (Double.parseDouble(caja.getText()));
        double numDos = (Double.parseDouble(caja2.getText()));
        // Realizar la suma
        double resultadoSuma = numUno + numDos;
        // Indicar el resultado en la etiqueta
        Resultado.setText("" + resultadoSuma); 
    }
    
    public static void main(String[] args) {
        Ventana V = new Ventana();      // creamos una ventana
        V.setVisible(true);             // hacemos visible la ventana creada
    }    
}
