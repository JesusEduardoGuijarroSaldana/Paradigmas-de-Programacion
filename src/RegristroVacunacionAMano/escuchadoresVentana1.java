/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegristroVacunacionAMano;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author guija
 */
public class escuchadoresVentana1 implements ActionListener{
    InterfazGraficaInicial frame1;
    public escuchadoresVentana1(InterfazGraficaInicial frame1){
        this.frame1 = frame1;
    }
    InterfazGraficaDatos frame2;
    public escuchadoresVentana1(InterfazGraficaDatos frame2){
        this.frame2 = frame2;
    }
            
   
    @Override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == this.frame1.getBtSalir()){            
            System.exit(0);
        }
//        if(ae.getSource() == this.frame1.getBtNuevoRegistro()){
//            frame2.getFrame().setVisible(true);            
//        }
    }
}