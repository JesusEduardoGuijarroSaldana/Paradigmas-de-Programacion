/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegristroVacunacionAMano;

import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author guija
 */
public class MainClass {

    private InterfazGraficaInicial frameInicial = new InterfazGraficaInicial();
//    private InterfazGraficaDatos frameDatos = new InterfazGraficaDatos();

    public static void main(String[] args) {
        try { // AluminiumLookAndFeel() se ve GOD, GraphiteLookAndFeel() no está mal,LunaLookAndFeel() old school
            UIManager.setLookAndFeel(new AluminiumLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
        }

        InterfazGraficaDatos frameDatos = new InterfazGraficaDatos();
        frameDatos.inicializarComponentes();

        MainClass run = new MainClass();
        run.panelesIniciales();

    }

    public void panelesIniciales() {
        getFrameInicial().setVisible(true);
        //frameDatos.setVisible(true);
    }
//    public void siguiente(){
//        getFrameInicial().setVisible(false);
//        getFrameDatos().setVisible(true);
//    }
//    public void atras(){
//        getFrameInicial().setVisible(true);
//        getFrameDatos().setVisible(false);
//    }

    public InterfazGraficaInicial getFrameInicial() {
        return frameInicial;
    }

    public void setFrameInicial(InterfazGraficaInicial frameInicial) {
        this.frameInicial = frameInicial;
    }
//    public InterfazGraficaDatos getFrameDatos(){
//        return frameDatos;
//    }
//    public void setFrameDatos(InterfazGraficaDatos frameDatos) {
//        this.frameDatos = frameDatos;
//    }
}
