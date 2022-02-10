package Clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author Diego Romero
 * @company Tablero
 * @Email 10778820@ieselgrao.org
 */
public class Tablero extends JPanel {

    ball bola = new ball(0, 0);
    Barras r1 = new Barras(10, 200);
    Barras r2 = new Barras(784 - 10 - Barras.Ancho, 200);
    //-10-10 para el espacio entre el borde, y la propia raqueta

    public Tablero() {
        setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g) {       //metodo de tipo Graphics, que nos permite dibujar cualquier figura
        super.paintComponent(g);                              //Ejecutamos el metodo paintComponent de la clase padre (por ello el super)
        Graphics2D g2 = (Graphics2D) g;                  //Hacemos esto para trabajar con la clase graphics 2D, hija de Graphics (tiene más funcionalidades) pasamos el 3D a 2D
        g2.setColor(Color.red);                     //Ponemos color
        dibujar(g2);       //Creamos rectangulo (rectangle2D) double (donde ponemos posiciones (0,0) y el tamaño (20,20)
        actualizar();
    }

    public void dibujar(Graphics2D g) {
        g.fill(bola.getBall());
        g.fill(r1.getBarra());
        g.fill(r2.getBarra());
        System.out.println("x: "+getBounds().getMaxX());
        System.out.println("y: "+getBounds().getMaxY());

    }

    public void actualizar() {
        bola.mover(getBounds());

    }

    
    //Opcional a la clase hilo
    public void iterarJuego() {
        while (true) {
            try {
                repaint();
                Thread.sleep(6);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
