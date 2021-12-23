package OperadorLambda;
import java.util.ArrayList;

/**
 *
 * @author guija
 */
public class ejemplo3{ // listado de números usando filtros con lambdas
    public static void main(String[] args) {
        ArrayList<Integer> listEdades = new ArrayList<>();
        listEdades.add(10);
        listEdades.add(20);
        listEdades.add(30);
        listEdades.add(40);
        listEdades.add(50);
        listEdades.add(60);
        listEdades.add(70);
        
        listEdades.stream().filter(edad -> edad >=35 && edad < 65).forEach
        (list -> System.out.println("Edades:"+list));
        
    }                
}
