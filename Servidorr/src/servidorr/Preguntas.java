/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorr;




/**
 *
 * @author adrian.jimenez
 */
public class Preguntas {
    
    public String pregunta;
    public String respuesta;
    public String opcion1;
    public String opcion2;
    public String opcion3;
    public String opcion4;
    public String estado;
     String preg2[][] = new String[20][7];
    
    public Preguntas(){
        
     String preg[][] = new String[20][7];
     
       preg[0][0]="En que año nacio Simon Bolivar?";
       preg[0][1]="1783?";
       preg[0][2]="1803?";
       preg[0][3]="1795";
       preg[0][4]="1798";
       preg[0][5]="1812";
       preg[0][6]="no";
       
       preg[1][0]="Capital de Bolivar?";
       preg[1][1]="Cartagena?";
       preg[1][2]="Popayan?";
       preg[1][3]="Yopal";
       preg[1][4]="Florencia";
       preg[1][5]="Monteria";
       preg[1][6]="no";
       
       preg[2][0]="Capital de Cordoba?";
       preg[2][1]="Monteria?";
       preg[2][2]="Sincelejo?";
       preg[2][3]="Ibague";
       preg[2][4]="Pereira";
       preg[2][5]="Leticia";
       preg[2][6]="no";
       
       preg[3][0]="Capital de Cesar?";
       preg[3][1]="Valledupar";
       preg[3][2]="Leticia";
       preg[3][3]="Popayan";
       preg[3][4]="Tunja";
       preg[3][5]="Armenia";
       preg[3][6]="no";
       
       
       preg[4][0]="Capital de Bolivia?";
       preg[4][1]="Sucre";
       preg[4][2]="Potosi?";
       preg[4][3]="La Paz";
       preg[4][4]="Tupiza";
       preg[4][5]="Carija";
       preg[4][6]="no";
       
       preg[5][0]="En que año cayo el imperio romano?";
       preg[5][1]="453";
       preg[5][2]="458";
       preg[5][3]="531";
       preg[5][4]="522";
       preg[5][5]=" 519";
       preg[5][6]="no";
       
       
       preg[6][0]="En que año murio Hitler?";
       preg[6][1]="1945";
       preg[6][2]="1942";
       preg[6][3]="1938";
       preg[6][4]="1939";
       preg[6][5]="1947";
       preg[6][6]="no";
       
       preg[7][0]="En que pais nacio Hitler?";
       preg[7][1]="Austria";
       preg[7][2]="Alemania";
       preg[7][3]="Francia";
       preg[7][4]="Turquia";
       preg[7][5]="Polonia";
       preg[7][6]="no";
       
       preg[8][0]="En que pais nacio Einstein?";
       preg[8][1]="Alemania";
       preg[8][2]="Polonia";
       preg[8][3]="Canada";
       preg[8][4]="Estados Unidos";
       preg[8][5]="Inglaterra";
       preg[8][6]="no";
       
       preg[9][0]="En que pais nacio Stepehe Hawking";
       preg[9][1]="Inglaterra";
       preg[9][2]="Estados Unidos";
       preg[9][3]="Alemania";
       preg[9][4]="Austria";
       preg[9][5]="Francia";
       preg[9][6]="no";
    
       preg[10][0]="Año de muerte de Sir Isaac Newton?";
       preg[10][1]="1727";
       preg[10][2]="1709";
       preg[10][3]="1718";
       preg[10][4]="1741";
       preg[10][5]="1703";
       preg[10][6]="no";
       
       preg[11][0]="Año de muerte de Galileo Galilei?";
       preg[11][1]="1642";
       preg[11][2]="1632";
       preg[11][3]="1635";
       preg[11][4]="1649";
       preg[11][5]=" 1641";
       preg[11][6]="no";
    
       preg[11][0]="Quien fue el maestro de Platon?";
       preg[11][1]="Socrates";
       preg[11][2]="Homero";
       preg[11][3]="Pitagoras";
       preg[11][4]="Aristoteles";
       preg[11][5]="Descartes";
       preg[11][6]="no";
    
       preg2=preg;
    }
    
   public String[] buscarPreg(int a){
      
       
       String[] b=new String[7];
       b[0]=preg2[a][0];
       b[1]=preg2[a][1];
       b[2]=preg2[a][2];
       b[3]=preg2[a][3];
       b[4]=preg2[a][4];
       b[5]=preg2[a][5];
       b[6]=preg2[a][6];
   
       return b;
   
   }
    
    
}
