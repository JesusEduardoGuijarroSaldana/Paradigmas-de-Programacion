package PolimorfismoSistemaNominal;

/**
 *
 * @author guija
 */
public class EmpleadoPorComisionSubClass extends EmpleadoSuperClass{
    private double ventasBrutas;
    private double tarifaComision;
    
    public EmpleadoPorComisionSubClass(String nombre, String ap, String nss,
            double ventas, double tarifa){
        super(nombre, ap, nss);
        establecerVentasBrutas(ventas);
        establecerTarifaComision(tarifa);
    }
    public void establecerTarifaComision(double tarifa){
        tarifaComision = (tarifa > 0.0 && tarifa < 1.0) ? tarifa : 0.0;
    }
    public double obtenerTarifaComision(){
        return tarifaComision;
    }
    public void establecerVentasBrutas(double ventas){
        ventasBrutas = (ventas < 0.0) ? 0.0 : ventas;
    }
    public double obtenerVentasBrutas(){
        return ventasBrutas;
    }
    public double ingresos(){
        return obtenerTarifaComision() * obtenerVentasBrutas();
    }
    public String toString(){
        return String.format("%s: %s\n%s: $%, .2f; %s: %.2f", 
                "empleado por comisión", super.toString(), 
                "ventas brutas", obtenerVentasBrutas(),
                "tarifa de comisión", obtenerTarifaComision());
    }
}
