/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolimorfismoSistemaNominal;

/**
 *
 * @author guija
 */
public abstract class EmpleadoSuperClass {
    private String primerNombre;
    private String apPaterno;
    private String NSS;
    
    public EmpleadoSuperClass(String nombre, String ap, String nss){
        primerNombre = nombre;
        apPaterno = ap;
        NSS = nss;               
    }
    public void establecerPrimerNombre(String nombre){   
        primerNombre = nombre;
    }
    public String obtenerPrimerNombre(){
        return primerNombre;
    }
    public void establecerApPaterno(String apellido){
        apPaterno = apellido;
    }
    public String obtenerApPaterno(){
        return apPaterno;
    }
    public void establecerNSS(String nss){
        NSS = nss;
    }
    public String obtenerNSS(){
        return NSS;
    }
    public String toString(){
        return String.format("%s %s\nnumero de seguro social: %s", 
                obtenerPrimerNombre(), obtenerApPaterno(), obtenerNSS());
    }
    public abstract double ingresos();
}
