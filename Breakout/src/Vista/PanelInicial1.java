/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;
import modelo.Base;
import modelo.Ladrillo;
import modelo.Pelota;

/**
 *
 * @author USER
 */
public  class PanelInicial1 extends JPanel
{
    private Ladrillo ladrilloList[];
    private Base base;
    private int[]VX=new int[6];
    private int[]VY=new int[5];
    private Pelota pelota;  
    private int x1=350;
    private int x2=320;
    private int x3;
    private int x4;
    private int y1=420;
    private int y2=380;
    private int y3;
    private int y4;
    private int alto1=110;
    private int alto2=20;
    private int alto3;  
    private int ancho1=18;
    private int ancho2=20;
    private int ancho3=9;
    private boolean band=true;
    private int valX=0;
    private int valY=0;
    private int valoresX[]=new int[1000];
    private int valoresY[]=new int[1000];
    private int cont=0;
    private KeyEvent e=null ;
    int numLadrillos;
    private boolean bandera;
    
    public PanelInicial1() 
    {
        this.setBackground(Color.BLACK);
        
    }
   
    
     @Override
    protected void paintComponent(Graphics grphcs) 
    {
        super.paintComponent(grphcs);
        band=true;
        
    }
    
    
    

    public Ladrillo[] getLadrilloList() {
        return ladrilloList;
    }

    public void setLadrilloList(Ladrillo[] ladrilloList) {
        this.ladrilloList = ladrilloList;
    }

    public int getNumLadrillos() {
        return numLadrillos;
    }

    public void setNumLadrillos(int numLadrillos) {
        this.numLadrillos = numLadrillos;
    }
    
    
    

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
    
    

    public int[] getValoresX() {
        return valoresX;
    }

    public void setValoresX(int[] valoresX) {
        this.valoresX = valoresX;
    }

    public int[] getValoresY() {
        return valoresY;
    }

    public void setValoresY(int[] valoresY) {
        this.valoresY = valoresY;
    }

    
    
    public int getValX() {
        return valX;
    }

    public void setValX(int valX) {
        this.valX = valX;
    }

    public int getValY() {
        return valY;
    }

    public void setValY(int valY) {
        this.valY = valY;
    }

    public int[] getVX() {
        return VX;
    }

    public void setVX(int[] VX) {
        this.VX = VX;
    }

    public int[] getVY() {
        return VY;
    }

    public void setVY(int[] VY) {
        this.VY = VY;
    }

    
    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getX4() {
        return x4;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getY4() {
        return y4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }

    public boolean isBand() {
        return band;
    }

    public void setBand(boolean band) {
        this.band = band;
    }

    
}
