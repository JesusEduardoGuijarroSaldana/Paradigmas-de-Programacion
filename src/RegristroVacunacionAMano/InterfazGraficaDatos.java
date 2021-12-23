/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegristroVacunacionAMano;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author guija
 */
public class InterfazGraficaDatos{
    private JFrame frame = new JFrame();
    private Font tituloFuente = new Font("Amasis MT Pro Medium", Font.BOLD, 20);
    private Font normalFuente = new Font("Amasis MT Pro Medium", Font.BOLD, 15);
    private Font sinBoldFont = new Font("Amasis MT Pro Medium", Font.PLAIN, 15);
    
    public InterfazGraficaDatos(){
        inicializarComponentes();
    }
    public void inicializarComponentes(){
        frame.setTitle("Nuevo registro");                
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.yellow);
        frame.setLocationRelativeTo(null);        
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        primerPanel();
        segundoPanel();
        tercerPanel();
        cuartoPanel();
        quintoPanel();
        sextoPanel();
        septimoPanel();
        octavoPanel();
    }
    
    public void primerPanel(){
        JPanel panelNombres = new JPanel();
        panelNombres.setBackground(Color.gray);
        panelNombres.setBounds(25, 25, 440, 90); // x, y, ancho, alto
        frame.add(panelNombres);
        
        JLabel etTituloDatosPers = new JLabel("Ingrese sus datos personales");
        etTituloDatosPers.setFont(tituloFuente);
        etTituloDatosPers.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel etNombre = new JLabel("  Nombre(s):");
        etNombre.setFont(sinBoldFont);
        etNombre.setHorizontalAlignment(SwingConstants.LEFT);
        JTextField nombreTF = new JTextField();
        panelNombres.setLayout(new GridLayout(3,1));
        panelNombres.add(etTituloDatosPers);
        panelNombres.add(etNombre);
        panelNombres.add(nombreTF);
    }
    public void segundoPanel(){
        JPanel panelApellidos = new JPanel();
        panelApellidos.setBackground(Color.gray);
        panelApellidos.setBounds(25, 115, 440, 60); // x, y, ancho, alto
        frame.add(panelApellidos);
        
        JLabel etApPaterno = new JLabel("   Apellido Paterno:");
        etApPaterno.setFont(sinBoldFont);
        JLabel etApMaterno = new JLabel("   Apellido Materno:");
        etApMaterno.setFont(sinBoldFont);
        JTextField apPaternoTF = new JTextField();        
        JTextField apMaternoTF = new JTextField();
        
        panelApellidos.setLayout(new GridLayout(2,2));
        panelApellidos.add(etApPaterno);
        panelApellidos.add(etApMaterno);
        panelApellidos.add(apPaternoTF);        
        panelApellidos.add(apMaternoTF);
        
    }
    public void tercerPanel(){
        JPanel panelCurp = new JPanel();
        panelCurp.setBackground(Color.gray);
        panelCurp.setBounds(25, 175, 440, 60);
        frame.add(panelCurp);
        
        JLabel etCURP = new JLabel("CURP:");
        etCURP.setFont(sinBoldFont);        
        etCURP.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField tfCurp = new JTextField();
        
        panelCurp.setLayout(new GridLayout(2,1));
        panelCurp.add(etCURP);
        panelCurp.add(tfCurp);        
    }
    public void cuartoPanel(){
        JPanel panelFechaEntidad = new JPanel();
        panelFechaEntidad.setBackground(Color.gray);
        panelFechaEntidad.setBounds(25, 235, 440, 60);
        frame.add(panelFechaEntidad);
        
        JLabel etFechaNac = new JLabel("Fecha de Nacimiento (MES/DIA/AÑO): ");
        etFechaNac.setFont(sinBoldFont);
        JLabel etEntidadNac = new JLabel("Entidad de nacimiento: ");
        etEntidadNac.setFont(sinBoldFont);
        JTextField tfFechNac = new JTextField();        
        String [] estados = {"Aguascalientes","Baja California","Campeche","Durango"};
        JComboBox listaEntidadNac = new JComboBox(estados);
                
        panelFechaEntidad.setLayout(new GridLayout(2,2));
        panelFechaEntidad.add(etFechaNac);
        panelFechaEntidad.add(etEntidadNac);
        panelFechaEntidad.add(tfFechNac);
        panelFechaEntidad.add(listaEntidadNac);                
    }
    public void quintoPanel(){
        JPanel panelSexo = new JPanel();
        panelSexo.setBackground(Color.gray);
        panelSexo.setBounds(25, 295, 440, 35);
        frame.add(panelSexo);
        
        JLabel etSexo = new JLabel("    Sexo:   ");
        etSexo.setFont(sinBoldFont);
        JRadioButton rOpMasculino = new JRadioButton("Masculino");
        JRadioButton rOpFemenino = new JRadioButton("Femenino");
        JRadioButton rOp = new JRadioButton("Prefiero no especificar");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rOpMasculino);
        grupo.add(rOpFemenino);
        grupo.add(rOp);
        
        panelSexo.add(etSexo);
        panelSexo.add(rOpMasculino);
        panelSexo.add(rOpFemenino);
        panelSexo.add(rOp);                
    }
    public void sextoPanel(){
        JPanel panelLugarVac = new JPanel();
        panelLugarVac.setBackground(Color.gray);
        panelLugarVac.setBounds(25, 350, 440, 30);
        frame.add(panelLugarVac);
        
        JLabel etTitulo = new JLabel("Lugar de vacunación y datos de localización");
        etTitulo.setFont(tituloFuente);
        etTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        
        panelLugarVac.setLayout(new GridLayout(1,1));
        panelLugarVac.add(etTitulo);
        
    }
    public void septimoPanel(){
        JPanel panelLugar = new JPanel();
        panelLugar.setBackground(Color.gray);
        panelLugar.setBounds(25, 380, 440, 120);
        frame.add(panelLugar);
        /*----------------------------------------------------------*/
        JLabel etEntidad = new JLabel("Entidad");
        etEntidad.setFont(sinBoldFont);
        etEntidad.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel etMunicio = new JLabel("Municipio");
        etMunicio.setHorizontalAlignment(SwingConstants.CENTER);
        etMunicio.setFont(sinBoldFont);
        JLabel etCP = new JLabel("Código Postal");
        etCP.setHorizontalAlignment(SwingConstants.CENTER);
        etCP.setFont(sinBoldFont);
        
        String [] estados = {"Aguascalientes","Baja California","Campeche","Durango"};
        JComboBox listaEntidades = new JComboBox(estados);
        String [] municipios = {"Río Grande","Fresnillo","Nieves"};
        JComboBox listaMunicipios = new JComboBox(municipios);
        JTextField tfCp = new JTextField();
        /*----------------------------------------------------------*/
        JLabel etTel1 = new JLabel("Teléfono (1)");
        etTel1.setFont(sinBoldFont);
        etTel1.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel etTel2 = new JLabel("Teléfono (2)");
        etTel2.setFont(sinBoldFont);
        etTel2.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel etCorreo = new JLabel("Correo electrónico");
        etCorreo.setFont(sinBoldFont);
        etCorreo.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField tfTel1 = new JTextField();
        JTextField tfTel2 = new JTextField();
        JTextField tfCorreo = new JTextField();
        /*----------------------------------------------------------*/
        panelLugar.setLayout(new GridLayout(4,3));
        
        panelLugar.add(etEntidad);
        panelLugar.add(etMunicio);
        panelLugar.add(etCP);
        panelLugar.add(listaEntidades);
        panelLugar.add(listaMunicipios);
        panelLugar.add(tfCp);
        
        panelLugar.add(etTel1);
        panelLugar.add(etTel2);
        panelLugar.add(etCorreo);
        panelLugar.add(tfTel1);
        panelLugar.add(tfTel2);
        panelLugar.add(tfCorreo);                                
    }
    
    public void octavoPanel(){
        JPanel panelBtFin = new JPanel();
        panelBtFin.setBackground(Color.white);
        panelBtFin.setBounds(25, 525, 440, 30);
        frame.add(panelBtFin);
        
        JButton btGuardar = new JButton("Guardar");
        JButton btAtras = new JButton("Atrás");
        JButton btSalir = new JButton("Salir");
        
        panelBtFin.setLayout(new GridLayout(1,3));
        panelBtFin.add(btGuardar);
        panelBtFin.add(btAtras);
        panelBtFin.add(btSalir);
        
    }
   
}
