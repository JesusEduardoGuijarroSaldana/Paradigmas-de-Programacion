/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gato;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author guija
 */
public class GatoEscuchador implements ActionListener{
    private Gato gato;
    public GatoEscuchador(Gato gato){
    this.gato = gato;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        CrearBotones boton = (CrearBotones) e.getSource();
        boolean ganador = this.gato.agregarJugada(boton.getR(), boton.getC());
        // verificar primero el turno
        int turno = this.gato.getMovimientos()[this.gato.getJugada()];
        if(turno == 1){
            boton.setText("X");
            boton.setFont(new Font("calibri light", Font.BOLD, 60));
            //boton.setForeground(Color.RED);
        
        }else{
            boton.setText("O");
            boton.setFont(new Font("calibri light", Font.BOLD, 60));
            boton.setForeground(Color.BLUE);
        }
        boton.setEnabled(false);
        if (ganador){
            JOptionPane.showMessageDialog(null,"Ganó "+turno);
        }

    }
    
    
}
