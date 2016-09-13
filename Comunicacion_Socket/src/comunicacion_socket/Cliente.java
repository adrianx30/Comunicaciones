/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacion_socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 *
 * @author adrian.jimenez
 */
public class Cliente {
    
    Socket cliente;
    int puerto;
    String ip;
    PrintStream salida;
    BufferedReader entrada,teclado;
    DataOutputStream salida2;
    ObjectInputStream dIn;
    
    public Cliente(int a,String ipp){
    
    puerto=a;
    ip=ipp;
    }
    
    public String[] Iniciar() {
        String[] b3=new String[7];
        try {
      
            cliente = new Socket(ip,puerto);
            
          
            salida2=new DataOutputStream(cliente.getOutputStream());
            salida2.writeUTF("Peticion");
         
            
            dIn=new ObjectInputStream(cliente.getInputStream());
            b3=(String[])dIn.readObject();
           
            
            entrada.close();
            cliente.close();
            salida.close();
            
        } catch (Exception e) {
        }
        ;
        
        return b3;
        
    }
    
}
