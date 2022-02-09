package Clases;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author Diego Romero
 * @company Tablero
 * @Email 10778820@ieselgrao.org
 */
public class Tablero extends JPanel {
    ball bola = new ball(0,0);

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
    }

    public void actualizar() {
        bola.mover(getBounds());

    }

}
