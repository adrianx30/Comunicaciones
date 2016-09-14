/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorr;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author adrian.jimenez
 */
public class Int_Servidor {
    
    JTextArea tserv2;
    
    
    public void Int_Servidor(){
        JFrame a=new JFrame("Servidor Preguntón!");
        a.setLayout(null);
        a.setSize(280,280);
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        
        
        JLabel serv=new JLabel("Servidor Preguntón!");
        serv.setVisible(true);
        serv.setBounds(45,30, 200, 30);
        a.add(serv);
        
        JTextArea tserv=new JTextArea();
        tserv.setBounds(30,70, 150,150);
        tserv.setVisible(true);
        tserv.enable(true);
        tserv2=tserv;
        a.add(tserv);

    }
    
    public void Inicializar(){
    
    
    Servidorr in=new Servidorr();
    tserv2.setText("Esperando.............");
    in.Iniciar();
    tserv2.setText("Conexion Exitosa");
    
    
    
    
    
    }
    
    
}
