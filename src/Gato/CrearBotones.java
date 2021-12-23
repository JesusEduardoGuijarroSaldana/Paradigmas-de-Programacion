/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gato;

import javax.swing.JButton;

/**
 *
 * @author guija
 */
public class CrearBotones extends JButton{
    private int r;
    private int c; 
    public CrearBotones(int r, int c){
        this.r = r;
        this.c = c;
    }
        public int getR() {
        return r;
    }

    public int getC() {
        return c;
    }
}
