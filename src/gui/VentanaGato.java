/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author guija
 */
public class VentanaGato extends JFrame{
    public JPanel panel;
    public VentanaGato(){
        this.setTitle("Prueba Botones"); // titulo ventana
        this.setSize(500, 500); //ancho y largo
        this.setLocationRelativeTo(null);
        
        
        inicializarComponentes();
        crearBotones();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // hay más opciones de cerrado
        
        
    }
    private void inicializarComponentes(){
        panel = new JPanel();
        panel.setLayout(null); // quitamos el formato por defecto 
        this.getContentPane().add(panel);
        panel.setBackground(Color.LIGHT_GRAY);
        GridLayout grid = new GridLayout(3,3);
        panel.setLayout(grid);
 
    }
    public void crearBotones(){
        
        JButton boton1 = new JButton("1");
        boton1.setFocusable(false);
        boton1.setBackground(Color.WHITE);
        boton1.setForeground(Color.BLACK);
        boton1.setFont(new Font("calibri light", Font.BOLD, 20));
        boton1.setBorder(BorderFactory.createEtchedBorder());
        panel.add(boton1);
        
        JButton boton2 = new JButton("2");
        boton2.setFocusable(false);
        boton2.setBackground(Color.WHITE);
        boton2.setForeground(Color.BLACK);
        boton2.setFont(new Font("calibri light", Font.BOLD, 20));
        boton2.setBorder(BorderFactory.createEtchedBorder());
        panel.add(boton2);
        
        JButton boton3 = new JButton("3");
        boton3.setFocusable(false);
        boton3.setBackground(Color.WHITE);
        boton3.setForeground(Color.BLACK);
        boton3.setFont(new Font("calibri light", Font.BOLD, 20));
        boton3.setBorder(BorderFactory.createEtchedBorder());
        panel.add(boton3);
        
        JButton boton4 = new JButton("4");
        boton4.setFocusable(false);
        boton4.setBackground(Color.WHITE);
        boton4.setForeground(Color.BLACK);
        boton4.setFont(new Font("calibri light", Font.BOLD, 20));
        boton4.setBorder(BorderFactory.createEtchedBorder());
        panel.add(boton4);
        
        JButton boton5 = new JButton("5");
        boton5.setFocusable(false);
        boton5.setBackground(Color.WHITE);
        boton5.setForeground(Color.BLACK);
        boton5.setFont(new Font("calibri light", Font.BOLD, 20));
        boton5.setBorder(BorderFactory.createEtchedBorder());
        panel.add(boton5);
        
        JButton boton6 = new JButton("6");
        boton6.setFocusable(false);
        boton6.setBackground(Color.WHITE);
        boton6.setForeground(Color.BLACK);
        boton6.setFont(new Font("calibri light", Font.BOLD, 20));
        boton6.setBorder(BorderFactory.createEtchedBorder());
        panel.add(boton6);
        
        JButton boton7 = new JButton("7");
        boton7.setFocusable(false);
        boton7.setBackground(Color.WHITE);
        boton7.setForeground(Color.BLACK);
        boton7.setFont(new Font("calibri light", Font.BOLD, 20));
        boton7.setBorder(BorderFactory.createEtchedBorder());
        panel.add(boton7);
        
        JButton boton8 = new JButton("8");
        boton8.setFocusable(false);
        boton8.setBackground(Color.WHITE);
        boton8.setForeground(Color.BLACK);
        boton8.setFont(new Font("calibri light", Font.BOLD, 20));
        boton8.setBorder(BorderFactory.createEtchedBorder());
        panel.add(boton8);
        
        JButton boton9 = new JButton("9");
        boton9.setFocusable(false);
        boton9.setBackground(Color.WHITE);
        boton9.setForeground(Color.BLACK);
        boton9.setFont(new Font("calibri light", Font.BOLD, 20));
        boton9.setBorder(BorderFactory.createEtchedBorder());
        panel.add(boton9);
    }
    
}
