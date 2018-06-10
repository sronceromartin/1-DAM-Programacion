/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenraya;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
public class TresEnRaya extends JFrame {
   private JButton reset;
   private TextField caja;
   private static JButton botones[][]=new JButton[3][3];
   private JPanel panel1;
   private JPanel panel2;
   private Turno t =Turno.jugadorO;// lo inicializo a jugadorO pq es el primero en tirar
   
   
   public TresEnRaya(){
       super();
       configurarTresEnRaya();
       inicializarComponentes();
   
   }
   
   private void configurarTresEnRaya(){
        this.setTitle("Tres en raya");
        this.setSize(410, 510);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(new BorderLayout()); 
        this.setResizable(true);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // con esto hago que cu
   
   }
   
   private void inicializarComponentes(){
       panel1=new JPanel();
       panel2=new JPanel();
       reset=new JButton("Reset");
       caja=new TextField();
       
      
       
       
       // definimos el primer panel
       this.add(panel1,BorderLayout.CENTER);
       panel1.setLayout(new GridLayout(3,3));
       for(int i=0;i<botones.length;i++){
          for(int j=0;j<botones[0].length;j++){
               //los creo
               JButton b=new JButton();
               //los meto en el array
               botones[i][j]=b;
               //los meto en el panel
               panel1.add(b);
              
               b.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent ae) {
                        BActionPerformed(ae);
                    }
                });
           }
       
       }
       
       this.add(panel2,BorderLayout.EAST);
       panel2.setLayout(new  BorderLayout());
       panel2.add(caja,BorderLayout.NORTH);
       panel2.add(reset,BorderLayout.CENTER);
       this.pack();
       empezar();
       
       reset.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent ae) {
                        ResetActionPerformed(ae);
                    }
                });
       
   
   }
   
   private void BActionPerformed(ActionEvent e){
       //dicha casilla tendrá este valor, hacemos un casting pq e.getSource devuelve un objeto
      if(t==Turno.jugadorO){
          ((JButton)e.getSource()).setText("O");
               
      }else{
          ((JButton)e.getSource()).setText("X");
      
      }
       
       //aqui comprobaremos si la partida se ha terminado si no ha terminado cambiaremos el turno
        if(ComprobarGanador() == true)
        {
            if (t==Turno.jugadorO)
            {
                caja.setText("Ha ganado el jugador O.");
            }
            else
            {
                caja.setText("Ha ganado el jugador X.");
            }
        }
        else if(ComprobarEmpate() == true)
        {
            caja.setText("Han quedado empate.");
        }
        else
        {
            cambiarTurno();
        }   
   }
   private void ResetActionPerformed(ActionEvent e){
       empezar();
   
   }
   
   private boolean ComprobarGanador()
   {
       String caracter;
       if (t==Turno.jugadorO)
       {
           caracter = "O";
       }       
       else
       {
           caracter = "X";
       }
       
       for(int i = 0; i < botones.length; i++)
       {
            // 3 Horizontales
           if(caracter ==  botones[i][0].getText()
            && caracter == botones[i][1].getText() 
            && caracter == botones[i][2].getText())
           {
               return true;
           }
           
            // 3 vereticales
           if(caracter ==  botones[0][i].getText()
            && caracter == botones[1][i].getText() 
            && caracter == botones[2][i].getText())
           {
               return true;
           }
       }

              
       //diagonales
       
        if(caracter ==  botones[0][0].getText()
         && caracter == botones[1][1].getText()
         && caracter == botones[2][2].getText())
        {
            return true;
        }
       
        if(caracter ==  botones[0][2].getText()
         && caracter == botones[1][1].getText() 
         && caracter == botones[2][0].getText())
        {
            return true;
        }
       
       return false;
   }
   
   private boolean ComprobarEmpate()
   {
        for(int i=0;i<botones.length;i++){
           for(int j=0;j<botones[0].length;j++){
                JButton b = botones[i][j];
                if (b.getText() == "")
                {
                    return false;
                }
           }
       }
       
       return true;
   }
   
   private void empezar(){
       //limpio los botones y la caja de texto
       for(int i=0;i<botones.length;i++){
           for(int j=0;j<botones[0].length;j++){
                JButton b = botones[i][j];
                b.setText("");
           
           }
       }
       
       t=Turno.jugadorO;
       caja.setText("Le toca a O");
   }
   
   private void cambiarTurno(){
       if(t==Turno.jugadorO){
           t=Turno.jugadorX;
           caja.setText("Le toca a X");
       }else{
           t=Turno.jugadorO;
           caja.setText("Le toca a O");
       }
   
   }
   
    public static void main(String[] args) {
        TresEnRaya t=new  TresEnRaya();
        t.setVisible(true);
    }
   
}
