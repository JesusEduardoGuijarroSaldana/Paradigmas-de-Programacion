/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casting;

/**
 *
 * @author guija
 */
public class NumsPrimitivos {
    public static void main (String[] args){
        byte numeroByte=6;
        int numeroEntero=7;
        long numeroLong=8;
        double numeroDouble=2.5;
        
        //numeroDouble=numeroLong=numeroEntero=numeroByte;
        //numeroDouble=numeroLong+numeroEntero;
        //numeroByte=numeroEntero; //incompatible types
        numeroByte=(byte) numeroEntero; // origen más grande que el destino
        
        System.out.println(numeroByte);
    }
    
}
