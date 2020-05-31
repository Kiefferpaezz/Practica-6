
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author Kieffer
 */

/**
 * En esta clase vamos a configurar los botones del movimiento del personaje,
 * también le mostramos al usuario que ya gano.
 * 
 */
public class Personaje {
    Laberinto lab=new Laberinto();
    private int x=40;
    private int y=40;
    private final int ancho=40;
    private final int alto=40;
    private final int movimiento=40;
    
    
    
  public void paint(Graphics grafico){
  grafico.setColor(Color.red);
  grafico.fillOval(x, y, ancho,alto);
  grafico.setColor(Color.black);
  grafico.drawOval(x, y, ancho, alto);
  
  } 
  
  public void teclaPresionada(KeyEvent evento){
  int[][]laberinto=lab.obtieneLaberinto();
  if(evento.getKeyCode()==37){//ZQUIERDA
    if(laberinto[y/40][(x/40)-1]!=1){
            x=x-movimiento;
    }
  
  }
  
  if(evento.getKeyCode()==39){//DERECHA
      if(laberinto[y/40][(x/40)+1]!=1){
            x=x+movimiento;
    }
      
  }
  if(evento.getKeyCode()==40){//ABAJO
      if(laberinto[(y/40)+1][x/40]!=1){
            y=y+movimiento;
    }
      
  }
  if(evento.getKeyCode()==38){//ARRIBA
     if(laberinto[(y/40)-1][x/40]!=1){
      y=y-movimiento;
  }
     
  }
  if(laberinto[(y/40)][x/40]==2){
      
      JOptionPane.showMessageDialog(null, "Ganaste campeón");
  }
  
 }
  
}