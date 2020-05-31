import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;   
/**
 *
 * @author Kieffer
 */
/**
 * Metodo encargado de crear nuestro panel para crear la ventana del laberinto.
 * 
 */
public class juego extends JPanel{   
    Laberinto laberinto=new Laberinto();
    Personaje personaje=new Personaje();
    public static boolean solucion=false;
    public static int nivel=0;
    public juego(){
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent ke) {
                
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                personaje.teclaPresionada(ke);
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                
            }
        });
        setFocusable(true);        
        
    }
    
    @Override 
    public void paint(Graphics grafico){
      laberinto.paint(grafico);
      personaje.paint(grafico);
      }  
         

   /**
    * En nuestro main añadiremos la edicion de la ventana y tambien implementamos los metodos.
    * 
    */
   public static void main(String[] args){
   JOptionPane.showMessageDialog(null, "¿Estas listo para esta chimba de laberinto?");    
   JFrame miventana=new JFrame("Laberinto Makia");
   juego game=new juego();
   miventana.add(game);
   miventana.setSize(920,620);
   miventana.setLocation(300,200);
   miventana.setVisible(true);   
   
   miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
   
   JButton boton = new JButton("Solucion");
   boton.setFocusable(false);
   miventana.setLayout(null);
   miventana.add(boton).setBounds(700, 300, 150, 50);
   boton.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent ae) {
           if(solucion){
               solucion=false;
           }
           else{
               solucion=true;
           }
           
       }
   });
        
   while(true){
       try {
           Thread.sleep(10);
       } catch (InterruptedException ex) {
           Logger.getLogger(juego.class.getName()).log(Level.SEVERE, null, ex);
       }
       miventana.repaint();       
       
      }    
   }   
}
                        

   
   

