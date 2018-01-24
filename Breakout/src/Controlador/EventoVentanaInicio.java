
package Controlador;

import Vista.Juego;
import Vista.VentanaInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Participante;

public class EventoVentanaInicio implements ActionListener{
    private VentanaInicio ventana;
    private GestionDato gD;

    public EventoVentanaInicio(VentanaInicio ventana) {
        this.ventana = ventana;
    }

    public VentanaInicio getVentana() {
        return ventana;
    }

    public void setVentana(VentanaInicio ventana) {
        this.ventana = ventana;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        /*String nombre = JOptionPane.showInputDialog("Nombre: ");
        int id = (int) Math.random()*10;
        Participante p = new Participante();
        p.setId(id);
        p.setNombre(nombre);
        gD.insertar(p);*/
        
        Panel pI=new Panel();
        Juego j=new Juego(pI);
        j.setTitle("BreakOut");
        j.setSize(800, 500);
        
        CorreJuego cj=new CorreJuego("BrakeOut",pI);
        cj.start();
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        
        if(e.getSource().equals(this.ventana.getBoton())){
            
            VentanaInicio vP = new VentanaInicio("BREAKOUT",gD);
            vP.setVisible(false);
        }
        
    }
}
