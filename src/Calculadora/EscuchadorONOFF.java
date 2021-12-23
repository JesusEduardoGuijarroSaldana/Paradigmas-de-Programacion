package Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EscuchadorONOFF {
        public void accionONOF(JTextField caja, JButton on, JButton off,
                JButton mas, JButton menos, JButton mult, JButton div, 
                JButton equal, JButton c, JButton salir){
            on.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e1) {
                if(e1.getSource() == on){
                    on.setEnabled(false);
                    off.setEnabled(true);
                    mas.setEnabled(true);
                    menos.setEnabled(true);
                    mult.setEnabled(true);
                    div.setEnabled(true);
                    equal.setEnabled(true);
                    c.setEnabled(true);
                    //a.setVisible(true);
                    
                    caja.setEditable(true);
                }
            }
            });
            off.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e2){
                if(e2.getSource() == off){
                    off.setEnabled(false);
                    on.setEnabled(true);
                    mas.setEnabled(false);
                    menos.setEnabled(false);
                    mult.setEnabled(false);
                    div.setEnabled(false);
                    equal.setEnabled(false);
                    c.setEnabled(false);
                    //a.setVisible(false);
                    
                    caja.setEditable(false);
                }
            }
            });
        }
}
                   