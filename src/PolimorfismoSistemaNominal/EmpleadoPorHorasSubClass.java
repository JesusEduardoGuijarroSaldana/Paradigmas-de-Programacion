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
public class EmpleadoPorHorasSubClass extends EmpleadoSuperClass{
    private double sueldo; // sueldo por hora
    private double horas;  // horas trabajadas por semana
    
    public EmpleadoPorHorasSubClass(String nombre, String ap, String nss, 
            double sueldoPorHoras, double horasTrabajadas){
        super(nombre, ap, nss);
        establecerSueldo(sueldoPorHoras);
        establecerHoras(horasTrabajadas);
        
    }
    public void establecerSueldo(double sueldoPorHoras){
        sueldo = ( sueldoPorHoras < 0.0) ? 0.0 : sueldoPorHoras;
    }
    public double obtenerSueldo(){
        return sueldo;
    }
    public void establecerHoras(double horasTrabajadas){
        horas =(( horasTrabajadas >= 0.0) && (horasTrabajadas <= 168.0)) ?
                horasTrabajadas : 0.0;
    }
    public double obtenerHoras(){
        return horas;
    }
    public double ingresos(){
        if(obtenerHoras() <= 40){
            return obtenerSueldo() * obtenerHoras();
        }else{
            return 40 * obtenerSueldo() + (obtenerHoras() - 40) * obtenerSueldo() * 1.5;
        }
    }
    public String toString(){
        return String.format("empleado por horas: %s\n%s: $%,.2f; %s: %,.2f", 
                super.toString(), "sueldo por hora", obtenerSueldo(),
                "horas trabajadas", obtenerHoras());
    }
}
