package Clases;

import java.util.Locale;
import javax.swing.JFrame;

/**
 * @author Diego Romero
 * @company Ventana
 * @Email 10778820@ieselgrao.org
 */
public class Ventana extends JFrame {       //Extendemos JFrame

    private final int Ancho = 800, Alto = 500;      //Estrablecemos el ancho y el alto de la ventana de juego
    private Tablero Lamina;
    private Hilo hilo;

    //Iniciamos el metodo ventana
    public Ventana() {
        setTitle("Pong");           //Insertamos titulo

        setSize(Ancho, Alto);  //Situamos los tamaños deseados anteriores

        setLocationRelativeTo(null);    //Introducimos la ventana en una posición, en concreto null (centro)

        setResizable(true);    //Metodo para impedir que podamos modificar el tamaño. En este caso, como si quiero, pongo true, aunq false hará que no se pueda de la ventana

        Lamina = new Tablero();  //Creamos Lamina

        add(Lamina);        //Añadimos la lamina

        hilo = new Hilo(Lamina);        //Iniciamos movimiento de pelota
        hilo.start();
    }

}
