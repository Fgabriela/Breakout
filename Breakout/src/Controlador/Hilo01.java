/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.PanelInicial1;

/**
 *
 * @author USER
 */
public class Hilo01 extends java.lang.Thread
{
    
    private PanelInicial1 pI;
    
    public Hilo01(String string, PanelInicial1 p) {
        super(string);
        this.pI=p;
    }
    
    public
}
