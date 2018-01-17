/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import modelo.Base;
import modelo.Ladrillo;
import modelo.Pelota;

/**
 *
 * @author USER
 */
public class PanelInicial1 extends JPanel
{
    private Base base;
    private Ladrillo ladrillo;
    private Pelota pelota;  
    private int x1;
    private int x2;
    private int x3;
    private int x4;

    private int y1;
    private int y2;
    private int y3;
    private int y4;

    private int alto1;
    private int alto2;
    private int alto3;  
    private int ancho1;
    private int ancho2;
    private int ancho3;


    public PanelInicial1() 
    {
        this.setBackground(Color.cyan);
    }
   
     @Override
    protected void paintComponent(Graphics grphcs) 
    {
        super.paintComponent(grphcs);
        x1=350;
        y1=420;
        alto1=90;
        ancho1=18;
        
        x2=400;
        y2=400;
        alto2=20;
        ancho2=20;
        
        x3=0;
        y3=0;
        alto3=150;
        ancho3=9;
        int contX=150;
        int contY=0;
        
        Base b=new Base(x1,y1,alto1,ancho1);
        b.paintComponent(grphcs);
        base=b;
        
        Pelota p=new Pelota(x2,y2,alto2,ancho2);
        p.paintComponent(grphcs);
        pelota=p;
        
       
        for(int i=0;i<6;i++)
        {
            contY=100;
            for(int j=0;j<5;j++)
            {
                Ladrillo l=new Ladrillo(contX,contY,70,15);
                l.paintComponent(grphcs);
                contY=contY+18;
            }
            contX=contX+75;
            
        
        }
        
        
       
    }
    
      
  
    
}
