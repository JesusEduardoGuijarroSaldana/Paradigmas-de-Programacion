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
public class MainClass {
    public static void main(String[] args) {
        EmpleadoAsalariadoSubClass empleadoAsalariado =
        new EmpleadoAsalariadoSubClass( "John", "Smith", "111-11-1111", 800.00 );
        EmpleadoPorHorasSubClass empleadoPorHoras =
        new EmpleadoPorHorasSubClass( "Karen", "Price", "222-22-2222", 16.75, 40 );
        EmpleadoPorComisionSubClass empleadoPorComision =
        new EmpleadoPorComisionSubClass(
        "Sue", "Jones", "333-33-3333", 10000, .06 );
        EmpleadoBaseMasComisionSubClass empleadoBaseMasComision =
        new EmpleadoBaseMasComisionSubClass(
        "Bob", "Lewis", "444-44-4444", 5000, .04, 300 );

        System.out.println( "Empleados procesados por separado:\n" );
        System.out.printf( "%s\n%s: $%,.2f\n\n",
        empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos() );
        System.out.printf( "%s\n%s: $%,.2f\n\n",
        empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos() );
        System.out.printf( "%s\n%s: $%,.2f\n\n",
        empleadoPorComision, "ingresos", empleadoPorComision.ingresos() );
        System.out.printf( "%s\n%s: $%,.2f\n\n",
        empleadoBaseMasComision,
        "ingresos", empleadoBaseMasComision.ingresos() );
        EmpleadoSuperClass empleados[] = new EmpleadoSuperClass[4];
        
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;
        
        System.out.println( "Empleados procesados en forma polimorfica:\n" );
        
        // procesa en forma genérica a cada elemento en el arreglo de empleados
        for ( EmpleadoSuperClass empleadoActual : empleados ){                        
            System.out.println( empleadoActual ); // invoca a toString

        // determina si el elemento es un EmpleadoBaseMasComision
                if (empleadoActual instanceof EmpleadoBaseMasComisionSubClass){                    
        // conversión descendente de la referencia de Empleado
        // a una referencia de EmpleadoBaseMasComision
                    EmpleadoBaseMasComisionSubClass empleado =
                    (EmpleadoBaseMasComisionSubClass) empleadoActual;

            double salarioBaseAnterior = empleado.obtenerSalarioBase();
            empleado.establecerSalarioBase( 1.10 * salarioBaseAnterior );
            System.out.printf(
            "el nuevo salario base con 10%% de aumento es : $%,.2f\n",
            empleado.obtenerSalarioBase());
                } 
                System.out.printf(
                "ingresos $%,.2f\n\n", empleadoActual.ingresos());
        } 

        // obtiene el nombre del tipo de cada objeto en el arreglo de empleados
        for ( int j = 0; j < empleados.length; j++ )
            System.out.printf( "El empleado %d es un %s\n", j,
            empleados[j].getClass().getName() );
    } 
} 

  
