/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botones;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
/**
 *
 * @author ASIR 7L
 */
public class Botonera extends JFrame implements ActionListener{
    private JTextField resultado;
    private JButton refrescar;
    private JButton suma;
    //creo 10 botones
    private JButton boton0;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7;
    private JButton boton8;
    private JButton boton9;
    //creamos una lista de tipo JButton que contendrá todos los botones
    private static LinkedList<JButton> botones=new LinkedList <JButton>();
    private JPanel panel;//utilizamos el panel 
      
    public Botonera(){
        super();
        configurarBotonera();
        inicializarComponentes();
    }
    private void configurarBotonera(){
        this.setTitle("Calculadora aleatoria");
        this.setSize(410, 510);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // con esto hago que cuando se cierre la ventana se cierre tmb el programa y salga build succes
        
    }
    private void inicializarComponentes(){
        resultado=new JTextField();
        refrescar=new JButton();
        panel=new JPanel();
        panel.setLayout(new GridLayout(3,3));
        suma=new JButton();
        suma.setText("+");
        //añadimos los botones a la linkedlist y los inicializamos
        boton0 = new JButton();
        botones.add(boton0);
        boton1=new JButton();
        botones.add(boton1);
        boton2=new JButton();
        botones.add(boton2);
        boton3=new JButton();
        botones.add(boton3);
        boton4=new JButton();
        botones.add(boton4);
        boton5=new JButton();
        botones.add(boton5);
        boton6=new JButton();
        botones.add(boton6);
        boton7=new JButton(); 
        botones.add(boton7);
        boton8=new JButton();
        botones.add(boton8);
        boton9=new JButton(); 
        botones.add(boton9);
        resultado.setBounds(50, 50,210 ,40);
        resultado.setText("");
        refrescar.setBounds(50,100, 210, 40);
        refrescar.setText("Refrescar");
        boton1.setBounds(50,150,70,50);
        boton2.setBounds(120,150,70,50);
        boton3.setBounds(190,150,70,50);
        boton4.setBounds(50,200,70,50);
        boton5.setBounds(120,200,70,50);
        boton6.setBounds(190,200,70,50);
        boton7.setBounds(50,250,70,50);
        boton8.setBounds(120,250,70,50);
        boton9.setBounds(190,250,70,50);
        boton0.setBounds(50,300,210,50);
        suma.setBounds(50,350,210,50);
        // adicionamos los componentes a la ventana
        this.add(resultado);
        this.add(refrescar);
        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4);
        this.add(boton5);
        this.add(boton6);
        this.add(boton7);
        this.add(boton8);
        this.add(boton9);
        this.add(boton0);
        this.add(suma);
        //hacemos que el botón tenga una acción
        refrescar.addActionListener(new java.awt.event.ActionListener() {//lo que tiene dentro del paréntesis es el oyente
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    refrescarActionPerformed(evt);
            }

        });
        
        boton1.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){// evt da información del evento(el boton que lo ha hecho, si hay excepciones etc)
                botonActionPerformed(evt);//pongo botonActionPerformed en lugar de boton1ActionPerformed pq he hecho una función para todos los botones
            }
        });

        boton2.addActionListener(new java.awt.event.ActionListener() {//lo que tiene dentro del paréntesis es el oyente
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonActionPerformed(evt);
            }

        });
        boton3.addActionListener(new java.awt.event.ActionListener() {//lo que tiene dentro del paréntesis es el oyente
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonActionPerformed(evt);
            }

        });
        boton4.addActionListener(new java.awt.event.ActionListener() {//lo que tiene dentro del paréntesis es el oyente
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonActionPerformed(evt);
            }

        });
        boton5.addActionListener(new java.awt.event.ActionListener() {//lo que tiene dentro del paréntesis es el oyente
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonActionPerformed(evt);
            }

        });
        boton6.addActionListener(new java.awt.event.ActionListener() {//lo que tiene dentro del paréntesis es el oyente
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonActionPerformed(evt);
            }

        });
        boton7.addActionListener(new java.awt.event.ActionListener() {//lo que tiene dentro del paréntesis es el oyente
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonActionPerformed(evt);
            }

        });
        boton8.addActionListener(new java.awt.event.ActionListener() {//lo que tiene dentro del paréntesis es el oyente
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonActionPerformed(evt);
            }

        });
        boton9.addActionListener(new java.awt.event.ActionListener() {//lo que tiene dentro del paréntesis es el oyente
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonActionPerformed(evt);
            }

        });
        boton0.addActionListener(new java.awt.event.ActionListener() {//lo que tiene dentro del paréntesis es el oyente
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonActionPerformed(evt);
            }

        });
      
        //suma.addActionListener(new java.awt.event.ActionListener() {//lo que tiene dentro del paréntesis es el oyente
          //  public void actionPerformed(java.awt.event.ActionEvent evt) {
          //          sumaActionPerformed(evt);
            //}

        //});
                
    }
   
    @Override
    public void actionPerformed(ActionEvent evt) {
        //hacemos que el botón tenga una acción, se asocia 
        refrescar.addActionListener(this);
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        boton4.addActionListener(this);
        boton5.addActionListener(this);
        boton6.addActionListener(this);
        boton7.addActionListener(this);
        boton8.addActionListener(this);
        boton9.addActionListener(this);
        boton0.addActionListener(this);
        suma.addActionListener(this);
    }
    
     
    private void refrescarActionPerformed(ActionEvent e){
        resultado.setText("");
          
    }
    private void botonActionPerformed(ActionEvent e){
        // para obtener el valor del botón que he pulsado voy a e que sería el evt, despúes llamo a Source con un get pq es protected y tengo que hacer un downCasting de Object que es lo que devuelve a JButton
        String valorAnterior = resultado.getText();
        String valorNuevo = ((JButton)e.getSource()).getText();
        resultado.setText(valorAnterior.concat(valorNuevo));
    }
    /*private  void sumarActionPerformed(ActionEvent e){
        int num1;
        int num2;
        int resultado;
        Botonera boton=new Botonera();
        for(int i=0;i<botones.size();i++){
            num1= botones(i).getText();
        
        }*/
        
    
    public static void main(String[] args) {
        //tengo que crear un objeto de tipo Botonera y hacerlo visible
        Botonera bot = new Botonera();
        bot.setVisible(true);
        LinkedList<Integer> numeros = new LinkedList<Integer>();
        //añadimos los números a la linkedList
        for (int j = 0; j < 10; j++) {
            numeros.add(j);
        }
        int pos;
        for (int i = 0; i < botones.size(); i++) {
            JButton b = botones.get(i);//guardamos en esta variable los botones
            pos = (int) (Math.random() * numeros.size() - 1);
            String texto = numeros.get(pos).toString();// transformamos los números en strings para que se pongan en los botones, utilizamos el get para poder acceder a la linkedList
            numeros.remove(pos);
            b.setText(texto);// con esto hacemos que el boton tenga texto
        }
    }

}
