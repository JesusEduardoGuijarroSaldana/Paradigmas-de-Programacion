package Calculadora;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author guija
 */
public class EscuchadorTextField {
    public EscuchadorTextField(){
    }
    public void num(JTextField a){
        a.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
        // almacena la tecla que el usuario está oprimiendo
                if(!Character.isDigit(c) && c != '.'){ 
        // si no es Digit char, que haga dentro lo del if
                    e.consume(); // que no lo acepte
                }
                if(c == '.' && a.getText().contains(".")){
                    e.consume();
                }
            }
        });
    }          
}
