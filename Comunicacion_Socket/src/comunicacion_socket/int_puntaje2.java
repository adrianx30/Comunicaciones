/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacion_socket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author adrian.jimenez
 */
public class int_puntaje2 implements ActionListener {
    JFrame a1;
     String ip;
    int port;
    int pregood;
    int pregBad;
    JTextField wins;
    JTextField loss;
    JButton rsig;
    
    
    public int_puntaje2(String p,int i,int u,int y){
      
        
        ip=p;
        port=i;
        pregood=u;
        pregBad=y;
    
    JFrame a=new JFrame("Puntaje");
    a.setSize(400,400);
    a.setLocationRelativeTo(null);
    a.setLayout(null);
    a.setVisible(true);
    
    a1=a;
    
    JLabel puntaje=new JLabel("Puntaje");
    puntaje.setBounds(150, 50, 100, 30);
    puntaje.setVisible(true);
    a.add(puntaje);
    
    JLabel pregood=new JLabel("Preguntas Acertadas");
    pregood.setBounds(40, 130, 220, 20);
    pregood.setVisible(true);
    a.add(pregood);
    
    JTextField pregwin=new JTextField();
    pregwin.setBounds(270, 130, 50, 20);
    pregwin.setVisible(true);
    a.add(pregwin);
    wins=pregwin;
    
    JLabel preBad=new JLabel("Preguntas Fallidas");
    preBad.setBounds(40, 200, 220, 20);
    preBad.setVisible(true);
    a.add(preBad);
    
    JTextField pregnwin=new JTextField();
    pregnwin.setBounds(270, 200, 50, 20);
    pregnwin.setVisible(true);
    a.add(pregnwin);
    loss=pregnwin;
    
    JButton sig=new JButton("Continuar");
    sig.setBounds(140, 270, 120, 30);
    sig.setVisible(true);
    a.add(sig);
    sig.addActionListener(this);
    rsig=sig;
    
    
    }
    
    public void llenar(int a,int b){
        wins.setText(a+" ");
        loss.setText(b+" ");
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==rsig){
        
        Cliente cli=new Cliente(port,ip);
        
        String[] b4=new String[7];
        b4=cli.Iniciar();
   
        Interfaz_Preguntas intit=new Interfaz_Preguntas();
        intit.Interfaz_Preguntas(port,ip,pregood,pregBad);
        intit.AsignarPreg(b4);
        
        a1.setVisible(false);
       
        
        
        }
        
        
        
       
    }
    
}
