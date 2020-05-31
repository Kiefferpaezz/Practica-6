

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Kieffer
 */

/**
 * 
 * En esta clase vamos a editar nuestra matriz con las dimensiones dadas.
 */
public class Laberinto {   
    private int fila=0;
    private int columna=0;
    private final int numeroFilas=14;
    private final int numeroColumnas=13;
    private int anchoBloque=40;
    private final int altoBloque=40;         
      
    
 /**
  * En este metodo en donde vamos a configurar los graficos de la matriz,
  * tambien daremos la dimension.
  *  
  */   
 public void paint(Graphics grafico){
     int [][]laberinto=obtieneLaberinto();
     if(juego.solucion){
         laberinto=solucionLaberinto();
     }
     
     for(fila=0;fila<numeroFilas;fila++){
     for(columna=0;columna<numeroColumnas;columna++){
         if(laberinto[fila][columna]==1){
         grafico.setColor(Color.green);
         grafico.fillRect(columna*40,fila*40,anchoBloque,altoBloque);
         grafico.setColor(Color.black);
         grafico.drawRect(columna*40,fila*40,anchoBloque,altoBloque);
           }
         } 
       }
        grafico.drawString("Inicio", 5, 62);        
        grafico.drawString("Fin",520,520);
        
    }
 
 /**
  * En este metodo vamos a pintar la matriz inicial.
  * 
  */ 
 public int [][] obtieneLaberinto(){
 int laberinto[][]= {{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                     { 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1},
                     { 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1},
                     { 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1},
                     { 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1},
                     { 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1},
                     { 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1},
                     { 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1},
                     { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1},
                     { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1}, 
                     { 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1},
                     { 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1},
                     { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 2},
                     { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,},
                    };
            return laberinto;           
     }
 
/**
 * En este metodo mostramos la matriz solucion.
 *  
 */
 public int [][] solucionLaberinto (){
  int laberintoSolucion [][]= {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                              { 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                              { 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0},
                              { 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0},
                              { 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0},
                              { 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0},
                              { 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0},
                              { 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0},
                              { 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0},
                              { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0}, 
                              { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0},
                              { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                              { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1},
                              { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                              };
            return laberintoSolucion;      
   
 
 } 
} 



