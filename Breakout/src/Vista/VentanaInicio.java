
package Vista;

import Controlador.EventoVentanaInicio;
import Controlador.GestionDato;
import java.awt.*;
import javax.swing.*;

public class VentanaInicio extends JFrame {
    
    private JLabel im, ima, imag, imgFondo;
    private JButton boton;
    private JPanel panelPrincipal;
    private GestionDato gD;

    public VentanaInicio(String title,GestionDato gD) throws HeadlessException {
        super(title);
        this.setSize(700, 500);
        this.setLocation(30, 1);
        this.setDefaultCloseOperation(3);
        this.gD=gD;
        this.iniciaComponentes();
    }
    
    public void iniciaComponentes(){
        
        this.boton = new JButton("Jugar");
        
        LayoutManager disenioPrincipal = new BorderLayout();
        this.panelPrincipal = new JPanel(disenioPrincipal);
        Color color = new Color(14,20,45);
        this.panelPrincipal.setBackground(color);
        
        this.im = new JLabel(new ImageIcon(getClass().getResource("net.png")));
        this.im.setBounds(10,20,330,150);
        this.getContentPane().add(im);
        
        this.ima =new JLabel(new ImageIcon(getClass().getResource("netbeans.jpg")));
        this.ima.setBounds(350,10,250,250);
        this.getContentPane().add(this.ima);
        
        this.imag = new JLabel(new ImageIcon(getClass().getResource("breakout.png")));
        this.imag.setBounds(10,250,500,250);
        this.getContentPane().add(this.imag);
        
        
        this.boton.setBounds(500, 350, 100, 50);
        this.getContentPane().add(this.boton);
        
        this.boton.addActionListener(new EventoVentanaInicio(this));
        
        this.add(this.panelPrincipal);
        
        
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public void setPanelPrincipal(JPanel panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }
    
}

