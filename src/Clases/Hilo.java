package Clases;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego Romero
 * @company Hilo
 * @Email 10778820@ieselgrao.org
 */
public class Hilo extends Thread {          //Clase usada para aplicaciones multitarea (la usamos por tener varios objetos en movimiento

    Tablero Lamina;

    public Hilo(Tablero Lamina) {
        this.Lamina = Lamina;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1);       //Velocidad de la pelota
            } catch (InterruptedException ex) {     //¿?¿?¿?¿?
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
            Lamina.repaint();
        }
    }

}
