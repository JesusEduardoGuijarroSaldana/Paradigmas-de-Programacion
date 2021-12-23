/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegristroVacunacionAMano;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author guija
 */
public class InterfazGraficaInicial extends JFrame{
    private JPanel panelBienvenida;
    private JPanel panelImagen;
    private JPanel panelBotones;
    private JButton btNuevoRegistro = new JButton();
    private JButton btSalir = new JButton();
    
    public InterfazGraficaInicial(){                     
        inicializarComponentes();
        
        }
    public void inicializarComponentes(){
        this.setTitle("Inicio");
        this.setSize(500, 600);
        this.getContentPane().setBackground(Color.yellow);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        
        this.panelImagen = new JPanel(new GridLayout(1,1));
        this.panelBotones = new JPanel(new GridLayout(2,1));
        this.panelBienvenida = new JPanel(new GridLayout(1,1));
        
        imagenCentro();
        botonesSur();
        bienvenidaNorte();
        
        escuchadoresVentana1 escuchador = new escuchadoresVentana1(this);
        btSalir.addActionListener(escuchador);
        btNuevoRegistro.addActionListener(escuchador);
    }
    public void imagenCentro(){
        ImageIcon imagenVacuna = new ImageIcon("420x400vacunacion_Logo.png");
        JLabel espacioImagen = new JLabel(imagenVacuna);
        this.panelImagen.add(espacioImagen);
        add(this.panelImagen, BorderLayout.CENTER);   
    }
    public void botonesSur(){        
        getBtNuevoRegistro().setText("Nuevo Registro");
        this.panelBotones.add(getBtNuevoRegistro());
                
        getBtSalir().setText("Salir");
        this.panelBotones.add(getBtSalir());
        
        add(this.panelBotones, BorderLayout.SOUTH);
    }
    public void bienvenidaNorte(){
        JLabel etBienvenida = new JLabel();
        etBienvenida.setText("¡Bienvenido a miVacuna!");
        etBienvenida.setOpaque(true);
        etBienvenida.setBackground(Color.yellow);
        etBienvenida.setSize(500, 300);
        etBienvenida.setFont(new Font("Amasis MT Pro Medium", Font.BOLD, 30));
        etBienvenida.setHorizontalAlignment(SwingConstants.CENTER); // 0 - centro, 2 - left, 4 - right

        this.panelBienvenida.add(etBienvenida);
        
        add(this.panelBienvenida, BorderLayout.NORTH);
        }
    
    public JButton getBtNuevoRegistro() {
        return btNuevoRegistro;
    }
    public void setBtNuevoRegistro(JButton btNuevoRegistro) {
        this.btNuevoRegistro = btNuevoRegistro;
    }
    public JButton getBtSalir() {
        return btSalir;
    }
    public void setBtSalir(JButton btSalir) {
        this.btSalir = btSalir;
    }   
}
