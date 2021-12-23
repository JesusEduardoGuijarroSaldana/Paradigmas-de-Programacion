/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gato;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author guija
 */
public class GatoInterfazGrafica extends JFrame{
    private JPanel panelBotones;
    private JPanel panelEtiquetas;
    private JPanel panelBotonCerrar;
    
    public GatoInterfazGrafica(){
        inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        setTitle("Juego: gato y ratón");
        setSize(400,400);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        this.panelBotones = new JPanel(new GridLayout(3,3));
        this.panelBotonCerrar = new JPanel(new GridLayout(1,1));
        
        Botones();

    }
    private void Botones(){
    // inscatnciamos los botones y agregamos
        CrearBotones b1 = new CrearBotones(0,0);
        b1.setBackground(Color.WHITE);
        b1.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.white));
        this.panelBotones.add(b1);
        
        CrearBotones b2 = new CrearBotones(0,1);
        b2.setBackground(Color.WHITE);
        //b2.setBorder(BorderFactory.createBevelBorder(0, Color.BLACK, Color.white));
        this.panelBotones.add(b2);
        
        //b2.setText("a");
        
        CrearBotones b3 = new CrearBotones(0,2);
        b3.setBackground(Color.WHITE);
        this.panelBotones.add(b3);
        
        CrearBotones b4 = new CrearBotones(1,0);
        b4.setBackground(Color.WHITE);
        this.panelBotones.add(b4);
        
        CrearBotones b5 = new CrearBotones(1,1);
        b5.setBackground(Color.WHITE);
        b5.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK));
        this.panelBotones.add(b5);
        
        CrearBotones b6 = new CrearBotones(1,2);
        b6.setBackground(Color.WHITE);
        this.panelBotones.add(b6);
        
        CrearBotones b7 = new CrearBotones(2,0);
        b7.setBackground(Color.WHITE);
        this.panelBotones.add(b7);
        
        CrearBotones b8 = new CrearBotones(2,1);
        b8.setBackground(Color.WHITE);
        this.panelBotones.add(b8);
        
        CrearBotones b9 = new CrearBotones(2,2);
        b9.setBackground(Color.WHITE);
        b9.setBorder(BorderFactory.createBevelBorder(1, Color.white, Color.BLACK));
        this.panelBotones.add(b9);
        
        //Botón para salir
        JButton botonSalir = new JButton("Salir");
        panelBotonCerrar.add(botonSalir);
        botonSalir.setBackground(Color.WHITE);
        add(this.panelBotonCerrar,BorderLayout.SOUTH);
        ActionListener escuchadorSalir = new ActionListener(){ //clase anonima implementando actionPerformed
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ae.getSource()==botonSalir){
                    dispose();
                }            
            }
        };
        botonSalir.addActionListener(escuchadorSalir);
        
        
        // agregar el panel al frame
        add(this.panelBotones,BorderLayout.CENTER);

        Gato gato = new Gato();
        GatoEscuchador escuchadorBotones = new GatoEscuchador(gato);
        b1.addActionListener(escuchadorBotones);
        b2.addActionListener(escuchadorBotones);
        b3.addActionListener(escuchadorBotones);
        b4.addActionListener(escuchadorBotones);
        b5.addActionListener(escuchadorBotones);
        b6.addActionListener(escuchadorBotones);
        b7.addActionListener(escuchadorBotones);
        b8.addActionListener(escuchadorBotones);
        b9.addActionListener(escuchadorBotones);
        
    }
}
