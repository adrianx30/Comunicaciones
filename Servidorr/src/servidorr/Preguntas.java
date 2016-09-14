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
     
     preg[0][0]="En que semestre se encuentra actualmente?";
     preg[0][1]="Eso no se pregunta compa :v";
     preg[0][2]="Entre 1 y 3";
     preg[0][3]="Entre 4 y 6";
     preg[0][4]="Entre 7 y 9";
     preg[0][5]="10 o más";
     preg[0][6]="no";
     
     preg[1][0]="El sistema electoral para determinar las personas que ocuparan cargos publicos:";
     preg[1][1]="Sufragio";
     preg[1][2]="Adagio";
     preg[1][3]="Naufragio";
     preg[1][4]="Prestigio";
     preg[1][5]="Corrupción";
     preg[1][6]="no";
     
     preg[2][0]="Una persona famelica está:";
     preg[2][1]="Hambrienta";
     preg[2][2]="Irritable";
     preg[2][3]="Furiosa";
     preg[2][4]="Asustada";
     preg[2][5]="Fea";
     preg[2][6]="no";
     
     preg[3][0]="El albinismo se presenta por la carencia de:";
     preg[3][1]="Pigmentación";
     preg[3][2]="Calcio";
     preg[3][3]="Vitamina A";
     preg[3][4]="Oxígeno";
     preg[3][5]="Sexo";
     preg[3][6]="no";
     
     
     preg[4][0]="Cual de estos instrumentos mide la densidad de los aceites?";
     preg[4][1]="Oleometro";
     preg[4][2]="Dinamometro";
     preg[4][3]="Micrometro";
     preg[4][4]="Holometro";
     preg[4][5]="Termometro";
     preg[4][6]="no";
     
     preg[5][0]="Quien dirigió la película "El Padrino" en 1972?";
     preg[5][1]="Francis Ford Copolla";
     preg[5][2]="Roman Polanski";
     preg[5][3]="Franco Zeffirelli";
     preg[5][4]="Federico Fellini";
     preg[5][5]="Son Goku";
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
  
     preg[12][0]="Quien fue el maestro de Platon?";
     preg[12][1]="Socrates";
     preg[12][2]="Homero";
     preg[12][3]="Pitagoras";
     preg[12[4]="Aristoteles";
     preg[12][5]="Descartes";
     preg[12][6]="no";

     preg[13][0]="Tecnica que describe y representa detalladamente la superficie de un terreno:";
     preg[13][1]="Topografía";
     preg[13][2]="Serigrafía";
     preg[13][3]="Epigrafía";
     preg[13][4]="Holografía";
     preg[13][5]="Pornografía";
     preg[13][6]="no";
     
     preg[14][0]="Uno de los libros de J. K. Rowling es Harry Potter y:";
     preg[14][1]="El prisionero de Azkaban";
     preg[14][2]="El arca perdida";
     preg[14][3]="La magia negra";
     preg[14][4]="Su varita";
     preg[14][5]="Las neas del popular";
     preg[14][6]="no";
     
     preg[15][0]="En la mitología griega, Eros es considerado el dios del:";
     preg[15][1]="Amor";
     preg[15][2]="Odio";
     preg[15][3]="Miedo";
     preg[15][4]="Trabajo";
     preg[15][5]="Comunicaciones 2";
     preg[15][6]="no";
     
     preg[16][0]="Que elemento químico es representado por el símbolo "P"?";
     preg[16][1]="Fosforo";
     preg[16][2]="Bromo";
     preg[16][3]="Boro";
     preg[16][4]="Rubidio";
     preg[16][5]="Platano";
     preg[16][6]="no";
     
     
     preg[17][0]="Tim Burton dirigió la película";
     preg[17][1]="El gran pez";
     preg[17][2]="Inteligencia Artificial";
     preg[17][3]="Hombres de Negro";
     preg[17][4]="Juegos Macabros";
     preg[17][5]="Tortugas Ninja";
     preg[17][6]="no";
     
     preg[18][0]="Qué nota le pondría a este trabajo?";
     preg[18][1]="Cinco";
     preg[18][2]="Esta no es";
     preg[18][3]="Esta menos";
     preg[18][4]="Esta no es";
     preg[18][5]="Esta tampoco";
     preg[18][6]="no";     
     
     preg[19][0]="Los pollitos dicen..";
     preg[19][1]="Pio pio";
     preg[19][2]="La buena socio";
     preg[19][3]="Severa loca";
     preg[19][4]="Venga que no es pa eso";
     preg[19][5]="Gotta catch'em all!";
     preg[19][6]="no";
    
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
