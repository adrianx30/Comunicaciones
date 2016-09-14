/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacion_socket;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author adrian.jimenez
 */
public class Interfaz_Preguntas implements ActionListener{
    
   JFrame a1;
   JLabel rlbienv;
   JButton rbt1;
   JButton rbt2;
   JButton rbt3;
   JButton rbt4;
   String[] h;
   JButton rsig;
   String ip;
   int puerto;
   int ganadas;
   int perdidas;
   
   
   
   
   public void Interfaz_Preguntas(int puerto1,String ip1,int pregg,int pregnw){
    
     puerto=puerto1;
     ip=ip1;
     ganadas=pregg;
     perdidas=pregnw;
       
       
    JFrame a=new JFrame("Preguntón!");
    a.setLayout(null);
    a.setSize(800,330);
    a.setLocationRelativeTo(null);
    a.setVisible(true);
    a.setBackground(Color.GREEN);
    
   
    a1=a;
    
    
    JLabel lbienv=new JLabel("Bienvenidos");
    lbienv.setBounds(320, 40, 300, 30);
    lbienv.setVisible(true);
    rlbienv=lbienv;
    a.add(lbienv);
    
    
    JButton bt1=new JButton();
    bt1.setVisible(true);
    bt1.setBounds(40, 110, 330, 40);
    bt1.addActionListener(this);
  
    rbt1=bt1;
    
    a.add(bt1);
    
     JButton bt2=new JButton();
    bt2.setVisible(true);
    bt2.setBounds(390, 110, 330, 40);
    bt2.addActionListener(this);
    rbt2=bt2;
    a.add(bt2);
    
     JButton bt3=new JButton();
    bt3.setVisible(true);
    bt3.setBounds(40, 160, 330, 40);
    bt3.addActionListener(this);
    rbt3=bt3;
    a.add(bt3);
    
     JButton bt4=new JButton();
    bt4.setVisible(true);
    bt4.setBounds(390, 160, 330, 40);
    bt4.addActionListener(this);
    rbt4=bt4;
    a.add(bt4);
    
    
    JButton sig=new JButton("Continuar");
    sig.setVisible(true);
    sig.setBounds(280, 230, 200, 30);
    sig.addActionListener(this);
    sig.setBackground(Color.yellow);
    rsig=sig;
    a.add(sig);
    
    
    
    
    
   }
   
   
   public void AsignarPreg(String[] a1){
       //System.out.println(a1[0]);

      h=a1;
      
      rlbienv.setText(a1[0]);
       
       Random rnd=new Random(); 
       int general= (int)(rnd.nextDouble() * 4 + 0);
       
       if(general==0){
            rbt1.setText(a1[1]);
            rbt2.setText(a1[2]);
            rbt3.setText(a1[3]);
            rbt4.setText(a1[4]);
        }

        if(general==1){
            rbt1.setText(a1[2]);
            rbt2.setText(a1[1]);
            rbt3.setText(a1[3]);
            rbt4.setText(a1[4]);
        }

        if(general==2){
            rbt1.setText(a1[3]);
            rbt2.setText(a1[5]);
            rbt3.setText(a1[1]);
            rbt4.setText(a1[2]);
        }

        if(general==3){
            rbt1.setText(a1[3]);
            rbt2.setText(a1[4]);
            rbt3.setText(a1[5]);
            rbt4.setText(a1[1]);

        }
      
       
       
              
   
   
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rbt1)
        {
            rbt2.setEnabled(false);
            rbt3.setEnabled(false);
            rbt4.setEnabled(false);
            
            if(rbt1.getText().equals(h[1])){
                rbt1.setBackground(Color.green);
                ganadas=ganadas+1;
            }
            else{
            rbt1.setBackground(Color.red);
            perdidas=perdidas+1;
            }
  
        }
         if(e.getSource()==rbt2)
             
             
             
        {
            rbt1.setEnabled(false);
            rbt3.setEnabled(false);
            rbt4.setEnabled(false);
            
            if(rbt2.getText().equals(h[1])){
            rbt2.setBackground(Color.green);
            ganadas=ganadas+1;
            
            }
            
            else{
            rbt2.setBackground(Color.red);
            perdidas=perdidas+1;
            }
  
        }
         
         if(e.getSource()==rbt3)
        {
            rbt2.setEnabled(false);
            rbt1.setEnabled(false);
            rbt4.setEnabled(false);
                
            if(rbt3.getText().equals(h[1])){
            rbt3.setBackground(Color.green);
            ganadas=ganadas+1;
            }
            else{
            rbt3.setBackground(Color.red);
            perdidas=perdidas+1;
            }
  
        }
          if(e.getSource()==rbt4)
        {
            
            rbt2.setEnabled(false);
            rbt3.setEnabled(false);
            rbt1.setEnabled(false);
            
            if(rbt4.getText().equals(h[1])){
            rbt4.setBackground(Color.green);
            ganadas=ganadas+1;
            }
            else{
            rbt4.setBackground(Color.red);
            perdidas=perdidas+1;
            }
  
        }
        if(e.getSource()==rsig){
      
            
            a1.setVisible(false);
            
           int_puntaje2 u=new int_puntaje2(ip,puerto,ganadas,perdidas);          
           u.llenar(ganadas, perdidas);
            
            
        
        }
          
        
        
        
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
