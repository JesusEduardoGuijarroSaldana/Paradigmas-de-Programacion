package PolimorfismoSistemaNominal;

/**
 *
 * @author guija
 */
public class EmpleadoAsalariadoSubClass extends EmpleadoSuperClass{
    private double salarioSemanal;
    
    public EmpleadoAsalariadoSubClass(String nombre, String ap, String nss,
            double salario){
        super(nombre, ap, nss);
        establecerSalarioSemanal(salario);
        
    }
    public void establecerSalarioSemanal(double salario){
        salarioSemanal = salario < 0.0 ? 0.0 : salario;
    }
    public double obtenerSalarioSemanal(){
        return salarioSemanal;
    }
    public double ingresos(){
        return obtenerSalarioSemanal();
    }
    public String toString(){
        return String.format("empleado asalariado: %s\n%s: $%,.2f", 
                super.toString(), "salario semanal", obtenerSalarioSemanal());
    }
}
