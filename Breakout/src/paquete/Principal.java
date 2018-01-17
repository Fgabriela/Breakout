
package paquete;

import Vista.PanelInicial1;
import javax.swing.JFrame;

public class Principal {

    public static void main(String[] args) 
    {
        JFrame ventana = new JFrame();
        ventana.setTitle("BrakeOut");
        ventana.setSize(800, 500);
        PanelInicial1 pI=new PanelInicial1();
        ventana.setContentPane(pI);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        
    }
    
}
