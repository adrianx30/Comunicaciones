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
        JFrame a=new JFrame("Servidor");
        a.setLayout(null);
        a.setSize(500, 500);
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        
        
        JLabel serv=new JLabel("Servidor");
        serv.setVisible(true);
        serv.setBounds(30,80, 200, 30);
        a.add(serv);
        
        JTextArea tserv=new JTextArea();
        tserv.setBounds(30, 120, 250, 250);
        tserv.setVisible(true);
        tserv.enable(false);
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
