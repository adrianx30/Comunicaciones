/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacion_socket;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author adrian.jimenez
 */
public class Interfaz_Datos {
    JFrame a;
    JLabel port;
    JLabel tip;
    JTextField ttip;
    JTextField tport;
    
    public void Interfaz_Datos(){
    ImageIcon g = new ImageIcon("gradient-wallpaper-18.jpg");
        JFrame a=new JFrame("Inicial");
        a.setContentPane(new JLabel(new ImageIcon("gradient-wallpaper-18.jpg")));
        a.setLayout(null);
        a.setSize(500, 500);
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        
        
        
        
        
        JLabel port=new JLabel("Ingrese el puerto");
        port.setVisible(true);
        port.setBounds(30, 20,200, 30);
        a.add(port);
       // rport=port;
        
        JTextField tport=new JTextField();
        tport.setVisible(true);
        tport.setBounds(30,60 ,120, 30);
       // rtport=tport;
        a.add(tport);
        
        JLabel tip=new JLabel("Ingrese la ip del Servidor");
        tip.setVisible(true);
        tip.setBounds(30, 100, 200, 30);
        a.add(tip);

        
        JTextField tp = new JTextField();
        tp.setVisible(true);
        tp.setBounds(300,300 ,120, 30);
       // rtport=tport;
        a.add(tp);
    
    }
    
}
