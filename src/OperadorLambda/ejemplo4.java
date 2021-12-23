package OperadorLambda;
import java.util.ArrayList;

/**
 *
 * @author guija
 */
public class ejemplo4{ // Ejemplo usando clases, ejemplo con monedas.
    private int codigo;
    private String moneda;
    private String descripcion;
    private Float valor;

    public ejemplo4(int codigo, String moneda, String descripcion, Float valor){
        this.codigo = codigo;
        this.moneda = moneda;
        this.descripcion = descripcion;
        this.valor = valor;
    }
    
    public static void main(String[] args) {
        ArrayList<ejemplo4> list = new ArrayList<>();
        
        list.add(new ejemplo4(1, "Dolar", "Dolar Estadounidense", 20.89f));
        list.add(new ejemplo4(1, "Euro", "Moneda Europea", 23.63f));
        list.add(new ejemplo4(1, "Yen", "Yen Japonés", 0.18f));
        
        // forEach trabaja con un consumer
        list.forEach(coin -> System.out.println("Moneda: "+coin.getMoneda()+
                " -> "+coin.getDescripcion()+
                " --- Valor en pesos Mexicanos: "+coin.getValor()));        
    }
    
    public int getCodigo(){
        return codigo;
    }
    public String getMoneda(){
        return moneda;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public Float getValor(){
        return valor;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setMoneda(String moneda){
        this.moneda = moneda;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setValor(Float valor){
        this.valor = valor;
    }       
}
