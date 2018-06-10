/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conPanel;

import botones.Botonera;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import conPanel.Operacion;

/**
 *
 * @author ASIR 7L
 */
public class Ventana extends JFrame implements ActionListener{
    
    private JTextField resultado;
    private JButton refrescar;
    private JButton suma;
    private JButton igual;
    private static LinkedList<JButton> botones = new LinkedList <JButton>();
    private JPanel panel;//utilizamos el panel 
    ArrayList <Integer>numeros = new ArrayList();
    public static int operador1;
    public static int operador2;
    public static Operacion operando;
    
    public Ventana(){
        super();
        configurarBotonera();
        inicializarComponentes();
    }
    private void configurarBotonera(){
        this.setTitle("Calculadora aleatoria 2");
        this.setSize(410, 510);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(new BorderLayout()); 
        this.setResizable(true);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // con esto hago que cuando se cierre la ventana se cierre tmb el programa y salga build succes
    }
    
    private void inicializarComponentes(){
        resultado=new JTextField();
        refrescar=new JButton();
        refrescar.setText("Refrescar");
        panel=new JPanel();
        panel.setLayout(new GridLayout(2,5));
        suma=new JButton();
        suma.setText("+");
        igual = new JButton("=");
        
        for( int i=0;i<10;i++){
            JButton b = new JButton();
            botones.add(b);
            //añado los botones al panel
            panel.add(b);//Le añadimos los botones al panel
         
            b.addActionListener(new java.awt.event.ActionListener() {//lo que tiene dentro del paréntesis es el oyente
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    bActionPerformed(evt);
            }});
        }


        this.add(resultado,BorderLayout.NORTH);
        this.add(refrescar,BorderLayout.CENTER);
        this.add(panel,BorderLayout.EAST);
        this.add(igual, BorderLayout.WEST);
        this.add(suma,BorderLayout.SOUTH);
        this.pack();
        
        refrescar.addActionListener(new java.awt.event.ActionListener() {//lo que tiene dentro del paréntesis es el oyente
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    refrescarActionPerformed(evt);
            }

        });
        
        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                operador2 = Integer.parseInt(resultado.getText());
                switch(operando)
                {
                    case Suma:
                        int res = operador1 + operador2;
                        resultado.setText(Integer.toString(res));
                        break;
                    case Resta:
                        int res2 = operador1 - operador2;
                        resultado.setText(Integer.toString(res2));
                        break;
                }
            }
        });
        
        suma.addActionListener(new java.awt.event.ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                SumaActionPerformed(e);
            }
        });
    }
    private void bActionPerformed(ActionEvent e){
        // para obtener el valor del botón que he pulsado voy a e que sería el evt, despúes llamo a Source con un get pq es protected y tengo que hacer un downCasting de Object que es lo que devuelve a JButton
        String valorAnterior = resultado.getText();
        String valorNuevo = ((JButton)e.getSource()).getText();
        resultado.setText(valorAnterior.concat(valorNuevo));
    }
    
    private void  SumaActionPerformed(ActionEvent evt)
    {
        operador1 = Integer.parseInt(resultado.getText());
        resultado.setText("");
        operando = Operacion.Suma;
    }
    
    private void refrescarActionPerformed(ActionEvent e){
    resultado.setText("");
          
    }
        
    
    public static void main(String[] args) {
    //tengo que crear un objeto de tipo Botonera y hacerlo visible
        Ventana v = new Ventana();
        v.setVisible(true);

        for (int j = 0; j < 10; j++) {
            v.numeros.add(j);
        }

        //añadimos los números a la ArrayList
        for (int i = 0; i < botones.size(); i++) {
            JButton b = botones.get(i);//guardamos en esta variable los botones
            int pos = (int) (Math.random() * v.numeros.size());
            String texto = v.numeros.get(pos).toString();// transformamos los números en strings para que se pongan en los botones, utilizamos el get para poder acceder a la linkedList
            v.numeros.remove(pos);
            b.setText(texto);// con esto hacemos que el boton tenga texto
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
