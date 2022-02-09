package Principal;

import Clases.Ventana;
import javax.swing.JFrame;

/**
 *
 * @author Diego Romero 
 * @company Pong
 * @Email 10778820@ieselgrao.org
 */
public class Principal {

    public static void main(String[] args) {
        Ventana ventana = new Ventana();    //Creamos constructor de ventana
        ventana.setVisible(true);   //Ventana visible 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Si ponemos X en la ventana, la ejecución termina

    }

}
