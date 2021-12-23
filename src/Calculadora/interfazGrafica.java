package Calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author guija
 */
public class interfazGrafica extends JFrame{
//    private JPanel panelJLabel;
//    private JPanel panelJTextField;
    private JPanel panelJButton;
    private JPanel componentesNorte;
    private JPanel componentesSur;
    private JPanel componenteEste;
    private JTextField caja1 = new JTextField();
    //private JTextField caja2 = new JTextField();
    private JButton botonOFF = new JButton();
    private JButton botonON = new JButton();
    private JButton bSuma = new JButton();
    private JButton bResta = new JButton();
    private JButton bMultiplicacion = new JButton();
    private JButton bDivision = new JButton();
    private JButton bLimpiar = new JButton();
    private JButton bSalir = new JButton();
    private JButton bIgual = new JButton();
    private JLabel etiqueta1 = new JLabel();
    private double num1=0.0, num2=0.0, resultado=0.0;
    private char op;
    
    public interfazGrafica(){
        incializarComponentes();
    }
    private void incializarComponentes(){
        this.setTitle("CASIO 3000");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        //this.componentesNorte = new JPanel(new GridLayout(1,2));
        this.panelJButton = new JPanel(new GridLayout(2,2));
        this.componentesNorte = new JPanel(new GridLayout(1,1));
        this.componentesSur = new JPanel(new GridLayout(2,2));
        this.componenteEste = new JPanel(new GridLayout(1,1));

        operacionesJButton();
        componentesNorte();
        componentesSur();
        componenteEste();
        encenderApagar();
        //operaciones();
        OperacionesCalculadora escuchador = new OperacionesCalculadora(this);
        bSuma.addActionListener(escuchador);
        bResta.addActionListener(escuchador);
        bMultiplicacion.addActionListener(escuchador);
        bDivision.addActionListener(escuchador);
        bIgual.addActionListener(escuchador);
        
    }
    public void componentesNorte(){
        Color mySoftGreen = new Color(213, 245, 227);
    // primer renglón de la parte norte
        caja1.setEditable(false); // *****
        caja1.setBackground(mySoftGreen);
        caja1.setFont(new Font("calibri light", Font.BOLD, 40));
        caja1.setForeground(Color.BLACK);
        this.componentesNorte.add(caja1);        
        add(this.componentesNorte, BorderLayout.PAGE_START);       
        // escuchador para que no deje ingresar letras y más de un punto
        EscuchadorTextField escuchador1 = new EscuchadorTextField();
        escuchador1.num(getCaja1());
    }
    
    public void operacionesJButton(){
        
        bSuma.setText("+");
        bSuma.setFont(new Font("calibri light", Font.BOLD, 60));
        bSuma.setBackground(Color.WHITE);
        bSuma.setEnabled(false);        
        this.panelJButton.add(bSuma);               
        bResta.setText("-");
        bResta.setFont(new Font("calibri light", Font.BOLD, 60));
        bResta.setBackground(Color.GRAY);
        bResta.setEnabled(false);        
        this.panelJButton.add(bResta);       
        bMultiplicacion.setText("x");
        bMultiplicacion.setFont(new Font("calibri light", Font.BOLD, 60));
        bMultiplicacion.setBackground(Color.GRAY);
        bMultiplicacion.setEnabled(false);        
        this.panelJButton.add(bMultiplicacion);        
        bDivision.setText("/");
        bDivision.setFont(new Font("calibri light", Font.BOLD, 50));
        bDivision.setBackground(Color.WHITE);
        bDivision.setEnabled(false);        
        this.panelJButton.add(bDivision);        
        add(this.panelJButton, BorderLayout.CENTER);
    }
    
    public void componentesSur(){
        // botón limpiar
        bLimpiar.setText("C");
        bLimpiar.setBackground(Color.DARK_GRAY);
        bLimpiar.setFont(new Font("calibri light", Font.BOLD, 15));
        bLimpiar.setForeground(Color.WHITE);
        bLimpiar.setEnabled(false);
        this.componentesSur.add(bLimpiar);
        // botón salir
        bSalir.setText("Salir");
        bSalir.setBackground(Color.DARK_GRAY);
        bSalir.setFont(new Font("calibri light", Font.BOLD, 15));
        bSalir.setForeground(Color.WHITE);
        this.componentesSur.add(bSalir);        
        EscuchadorLimpiar escuchador2 = new EscuchadorLimpiar();
        escuchador2.limpiarCajaTexto(bLimpiar, caja1);             
        EscuchadorButtonSalida escuchador3 = new EscuchadorButtonSalida();
        escuchador3.salir(bSalir);        
        // botón encender
        botonON.setText("ENCENDER");
        botonON.setBackground(Color.WHITE);
        botonON.setFont(new Font("calibri light", Font.BOLD, 15));
        botonON.setForeground(Color.BLACK);
        this.componentesSur.add(botonON);     
        // botón apagar
        botonOFF.setText("APAGAR");
        botonOFF.setBackground(Color.WHITE);
        botonOFF.setFont(new Font("calibri light", Font.BOLD, 15));
        botonOFF.setForeground(Color.BLACK);
        botonOFF.setEnabled(false);
        this.componentesSur.add(botonOFF);
        add(this.componentesSur, BorderLayout.SOUTH);
    }
    public void componenteEste(){
        Color myGreen = new Color(88, 214, 141);
// botón igual
        bIgual.setText("=");
        bIgual.setForeground(Color.BLACK);
        bIgual.setFont(new Font("calibri light", Font.BOLD, 40));
        bIgual.setBackground(myGreen);
        bIgual.setEnabled(false);
        this.componenteEste.add(bIgual);    
        add(this.componenteEste, BorderLayout.EAST);
    }
    public void encenderApagar(){
        EscuchadorONOFF escuchador4 = new EscuchadorONOFF();
        escuchador4.accionONOF(getCaja1(), botonON, botonOFF, 
                bSuma, bResta, bMultiplicacion, bDivision, 
                bIgual, bLimpiar, bSalir);
    }
    public JButton getbSuma() {
        return bSuma;
    }
    public void setbSuma(JButton bSuma) {
        this.bSuma = bSuma;
    }
    public JButton getbResta() {
        return bResta;
    }
    public void setbResta(JButton bResta) {
        this.bResta = bResta;
    }
    public JButton getbMultiplicacion() {
        return bMultiplicacion;
    }
    public void setbMultiplicacion(JButton bMultiplicacion) {
        this.bMultiplicacion = bMultiplicacion;
    }
    public JButton getbDivision() {
        return bDivision;
    }
    public void setbDivision(JButton bDivision) {
        this.bDivision = bDivision;
    }
    public JButton getbIgual() {
        return bIgual;
    }
    public void setbIgual(JButton bIgual) {
        this.bIgual = bIgual;
    }
    public JTextField getCaja1() {
        return caja1;
    }
    public void setCaja1(JTextField caja1) {
        this.caja1 = caja1;
    }
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public char getOp() {
        return op;
    }
    public void setOp(char op) {
        this.op = op;
    }
    
    
    
}
