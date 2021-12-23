package OperadorLambda;
/**
 *
 * @author guija
 */
public class ejemplo1{
    public static void main(String[] args) {
        int n1=30;
        int n2=20;
        
        operacionEjemplo1 suma=(num1, num2)->{
            double resultado = num1+num2;
            System.out.println("La suma es: "+resultado);
        };
        suma.op(n1, n2);
        
        operacionEjemplo1 resta=(num1, num2)->{
            double resultado = num1-num2;
            System.out.println("La resta es: "+resultado);
        };
        resta.op(n1, n2);
        
        operacionEjemplo1 mult = (num1, num2)->{
            double resultado = num1 * num2;
            System.out.println("La multiplicación es: "+resultado);
        };
        mult.op(n1, n2);                
    }    
}
