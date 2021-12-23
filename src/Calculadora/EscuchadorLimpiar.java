package Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
/**
 *
 * @author guija
 */
public class EscuchadorLimpiar{
    public void limpiarCajaTexto(JButton a, JTextField b){
        a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == a){
                    b.setText(null);
                }            
            }
        });
    }
}
