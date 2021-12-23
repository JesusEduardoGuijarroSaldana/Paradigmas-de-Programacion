/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author guija
 */
public class Ventana extends JFrame{
    public JPanel panel;
    public Ventana(){
        this.setTitle("Prueba Botones"); // titulo ventana
        this.setSize(500, 500); //ancho y largo
        //this.setLocation(550, 200); // coordenadas de la ventana
        this.setLocationRelativeTo(null);
        //this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        inicializarComponentes();
        crearBotones();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // hay más opciones de cerrado
    }
    private void inicializarComponentes(){
        panel = new JPanel();
        panel.setLayout(null); // quitamos el formato por defecto 
        this.getContentPane().add(panel);
        panel.setBackground(Color.LIGHT_GRAY);
    }
    private void crearBotones(){
        JButton boton1 = new JButton("A");
        boton1.setBounds(120,100,100,40);
        boton1.setFocusable(false);
        boton1.setBackground(Color.WHITE);
        boton1.setForeground(Color.BLACK);
        boton1.setFont(new Font("calibri light", Font.BOLD, 20));
        boton1.setBorder(BorderFactory.createEtchedBorder());
        panel.add(boton1);
        
        JButton boton2 = new JButton("B");
        boton2.setBounds(265,100,100,40);
        boton2.setFocusable(false);
        boton2.setBackground(Color.WHITE);
        boton2.setForeground(Color.BLACK);
        boton2.setFont(new Font("calibri light", Font.BOLD, 20));
        boton2.setBorder(BorderFactory.createEtchedBorder());
        panel.add(boton2);
        
        JLabel etiqueta1 = new JLabel("Haz seleccionado el botón A");
        etiqueta1.setBounds(165, 250, 250, 30);
        etiqueta1.setVisible(false);
        panel.add(etiqueta1);
        
        JLabel etiqueta2 = new JLabel("Haz seleccionado el botón B");
        etiqueta2.setBounds(165, 250, 250, 30);
        etiqueta2.setVisible(false);
        panel.add(etiqueta2);
        
        // actionlistener para los botones, ActionListener es una Interface 
        ActionListener chismoso = new ActionListener(){ //clase anonima implementando actionPerformed
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ae.getSource()==boton1){
                    etiqueta1.setVisible(true);
                    boton2.setEnabled(false);
                }else{
                    etiqueta2.setVisible(true);
                    boton1.setEnabled(false);
                }            
            }
        };
        
        boton1.addActionListener(chismoso); // se le tiene que pasar un objeto del 
                                      // tipo actionlistener
        boton2.addActionListener(chismoso);
    }
}
