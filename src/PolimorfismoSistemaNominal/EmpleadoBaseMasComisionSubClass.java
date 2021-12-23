/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolimorfismoSistemaNominal;

/**     Subclase concreta indirecta EmpleadoBaseMasComision
 *
 * @author guija
 */
public class EmpleadoBaseMasComisionSubClass extends EmpleadoPorComisionSubClass{
    private double salarioBase;
    
    public EmpleadoBaseMasComisionSubClass( String nombre, String ap, 
            String nss, double ventas, double tarifa, double salario){
        super(nombre, ap, nss, ventas, tarifa);
        establecerSalarioBase(salario);
    
    }
    public void establecerSalarioBase(double salario){
        salarioBase = (salario < 0.0) ? 0.0 : salario;
    }
    public double obtenerSalarioBase(){
        return salarioBase;
    }
    public double ingresos(){
        return obtenerSalarioBase() + super.ingresos();
    }
    public String toString(){
        return String.format("%s %s; %s: $%,.2f", 
                "con salario base", super.toString(),
                "salario base", obtenerSalarioBase());
    }
}
