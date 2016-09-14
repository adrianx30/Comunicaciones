package servidorr;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * Created by adrian.jimenez
 */
public class Servidorr {
    ServerSocket server;
    Socket socket;
    int puerto=5561;
    DataOutputStream salida;
    DataInputStream entradas;
    BufferedReader entrada;
    ObjectOutputStream out;
    boolean estado;
    int i;

    public void Iniciar()
    {
        String suma ="";
        estado=true;
        i=0;
            System.out.println(" c");
        try{
            
            server=new ServerSocket(puerto);
            
            while(estado=true){
                i=i+1;
            
            socket=new Socket();
            socket=server.accept();
            String ip=socket.getInetAddress().toString();
            System.out.println(ip);
            
            suma=suma+" \nEscuchando......";
            
            
            System.out.println("Escuchado puerto"+puerto);
            System.out.println("en espera......");
            
            DataInputStream in = new DataInputStream(socket.getInputStream());
            String d=in.readUTF();
            if(d.equals("Peticion")){
                  
            Preguntas b=new Preguntas();
            Random rnd=new Random();
            int numPreg= (int)(rnd.nextDouble() * 12 + 0);
            String k[]=b.buscarPreg(numPreg);
        
            out=new ObjectOutputStream(socket.getOutputStream());
            out.writeObject(k);
            }
            else{
            out=new ObjectOutputStream(socket.getOutputStream());
            
            
            }
            }
            socket.close();
            
            try{
                System.out.println("a");
            
            
            }catch(Exception e){};
           

                        
        }catch(Exception e){

            System.out.println("e");
        };
        }
    



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Int_Servidor serv=new Int_Servidor();
        serv.Int_Servidor();
        serv.Inicializar();
    }
    
}