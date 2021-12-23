
package Calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author guija
 */
public class OperacionesCalculadora implements ActionListener{
    interfazGrafica calc;
    public OperacionesCalculadora(interfazGrafica calc){
        this.calc = calc;
    }
   
        @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == this.calc.getbSuma()){
            calc.setNum1(Double.parseDouble(calc.getCaja1().getText())); 
            calc.setOp('+');
            calc.getCaja1().setText(null);
        }
        if(ae.getSource() == this.calc.getbResta()){
            calc.setNum1(Double.parseDouble(calc.getCaja1().getText())); 
            calc.setOp('-');
            calc.getCaja1().setText(null);
        }
        if(ae.getSource() == this.calc.getbMultiplicacion()){
            calc.setNum1(Double.parseDouble(calc.getCaja1().getText())); 
            calc.setOp('*');
            calc.getCaja1().setText(null);  
        }
        if(ae.getSource() == this.calc.getbDivision()){
            calc.setNum1(Double.parseDouble(calc.getCaja1().getText())); 
            calc.setOp('/');
            calc.getCaja1().setText(null); 
        }
        if(ae.getSource() == this.calc.getbIgual()){
            calc.setNum2(Double.parseDouble(calc.getCaja1().getText()));
            
            switch(calc.getOp()){
                case '+':{
                    calc.setResultado(calc.getNum1()+calc.getNum2());
                    break;
                }
                case '-':{
                    calc.setResultado(calc.getNum1()-calc.getNum2());
                    break;
                }
                case '*':{
                    calc.setResultado(calc.getNum1()*calc.getNum2());
                    break;
                }
                case '/':{
                    calc.setResultado(calc.getNum1()/calc.getNum2());
                    break;
                }                
            }
            calc.getCaja1().setText(String.valueOf(calc.getResultado()));
            calc.setNum1(calc.getResultado());
            // por si queremos seguir haciemdo + operaciones
        }
    }  
}
