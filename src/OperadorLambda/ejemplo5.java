package OperadorLambda;

/**
 *
 * @author guija        // EJEMPLO 5: Operaciones con arreglos, usando Lambdas
 * 
 */
public class ejemplo5{ // método reducir como el que ya tiene java
    
    static int reducir(int []numeros, Op2NumEjemplo5 operacion, int inicial){
        int acumulador = inicial;
        for(int numero: numeros){
            acumulador = operacion.aplicar(numero, acumulador);
        }
        return acumulador;
    }
    
    public static void main(String[] args) {
        int[] numeros = new int[] {1,2,3,4,5,6,7,8,9};
        int sumaTotal = reducir(numeros, (a,b) -> a + b, 0); 
                                            // 0 es el valor inicial de la suma
        System.out.println("La suma total es: "+sumaTotal);
        
        int multiTotal = reducir(numeros, (a,b) -> a * b, 1); 
                                            // 1 es el valor inicial de la mult
        System.out.println("La multiplicación total es: "+multiTotal);
    }
}
