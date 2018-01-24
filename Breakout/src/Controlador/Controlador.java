/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.PanelInicial1;
import java.awt.event.KeyEvent;
import java.awt.KeyEventDispatcher;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class Controlador extends JFrame implements KeyListener {

    private PanelInicial1 panel;

    public Controlador(PanelInicial1 panel) {
        this.panel = panel;
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //To change body of generated methods, choose Tools | Templates.
    }

}
