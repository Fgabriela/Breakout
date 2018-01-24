
package Controlador;

import Vista.Juego;
import Vista.VentanaFinal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JFrame;
import modelo.Participante;

public class EventoVentanaFinal implements ActionListener {
    private VentanaFinal ventana;
    private GestionDato gD;

    public EventoVentanaFinal(VentanaFinal ventana) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.ventana.getBoton1())){
            Panel pI=new Panel();
            Juego j=new Juego(pI);
            j.setTitle("BreakOut");
            j.setSize(800, 500);
        
            CorreJuego cj=new CorreJuego("BrakeOut",pI);
            cj.start();
            j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            j.setVisible(true);
        }
        if(e.getSource().equals(this.ventana.getBoton2())){
            System.exit(WIDTH);
        }
        if(e.getSource().equals(this.ventana.getBoton3())){
            for(Participante p: gD.leer()){
            System.out.println(p.toString());
        }
        }
    }
    
}
