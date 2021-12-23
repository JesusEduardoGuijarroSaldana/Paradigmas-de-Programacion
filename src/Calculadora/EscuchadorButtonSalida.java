package Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
/**
 *
 * @author guija
 */
public class EscuchadorButtonSalida {
    public void salir(JButton a){
        a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == a){
                    System.exit(0);
                }            
            }
        });
    }
}
