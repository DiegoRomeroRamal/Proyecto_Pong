
package Clases;

import java.awt.geom.Rectangle2D;

/**
 *
 * @author Diego Romero 
 * @company Barras
 * @Email 10778820@ieselgrao.org
 */
public class Barras {
    public static int x , y ;
    public static final int  Ancho= 15, Alto=60;
    
    public Barras (int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public Rectangle2D getBarra(){
        return new Rectangle2D.Double(x, y, Ancho, Alto);
    }

}
