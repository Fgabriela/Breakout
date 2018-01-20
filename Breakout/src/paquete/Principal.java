
package paquete;

import Controlador.Controlador;
import Controlador.CorreJuego;
import Controlador.Panel;

import Vista.Juego;
import Vista.PanelInicial1;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class Principal {

    public static void main(String[] args) 
    {
        Panel pI=new Panel();
        Juego j=new Juego(pI);
        j.setTitle("BreakOut");
        j.setSize(800, 500);
        
        CorreJuego cj=new CorreJuego("BrakeOut",pI);
        cj.start();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        
    }
    
}
