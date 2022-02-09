package Clases;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Diego Romero
 * @company ball
 * @Email 10778820@ieselgrao.org
 */
public class ball {

    private int x;
    private int y;
    private int dx = 1, dy = 1;
    private int Ancho = 15, Alto = 15;

    public ball(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle2D getBall() {      //Devolvemos la pelota (metodo Rectangle2D)
        return new Rectangle2D.Double(x, y, Ancho, Alto);
    }

    public void mover(Rectangle Limites) {          //Dirigimos la pelota, bordes y si pasa del medio se mueve al contrario (por el -)
        x += dx;
        y += dy;
        if (x > Limites.getMaxX()) {
            dx = -dx;
        }
        if (y > Limites.getMaxY()) {
            dy = -dy;
        }
        if (x<0){
            dx = -dx;
        }
        if (y <0){
            dy =-dy;
        }
    }
}
