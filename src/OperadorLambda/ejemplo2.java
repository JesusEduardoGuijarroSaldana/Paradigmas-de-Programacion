package OperadorLambda;
import java.util.ArrayList;

/**
 *
 * @author guija
 */
public class ejemplo2{ // ejemplo 2. Recorrido de listas para ahorrar código.
    public static void main(String[] args) {
        //List<String> lis_colores = new ArrayList<String>();  
        ArrayList<String> listColores = new ArrayList<>();
        listColores.add("Rojo");
        listColores.add("Verde");
        listColores.add("Azul");
        listColores.add("Amarillo");
        listColores.add("Morado");
        
        listColores.forEach(list -> System.out.println("Color: "+list));
    }
}
