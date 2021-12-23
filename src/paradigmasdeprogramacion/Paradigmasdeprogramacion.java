
package paradigmasdeprogramacion;
import objetos.Alumno;
import objetos.Docente;
import objetos.Persona;
/*
 * @author guija
 */
public class Paradigmasdeprogramacion {

    public static void main(String[] args) {
        
        Persona humano = new Persona("Julio", "10/03/1932", 899);
        humano.setEdad(89);
       //un objeto del tipo Persona, siendo la clase Padre se le modifica 
       //la edad por medio de un método de la misma clase.  
        humano.mostrarDatos();
        
        Alumno upiiz = new Alumno("Jose", "21/10/2002",18, "guijarro@"); 
        
        upiiz.setNombre("Jesus"); 
        upiiz.setEdad(30);
       //un objeto del tipo Alumno, siendo clase hija de Persona se le modifica 
       //la edad por medio de un método heredado de Persona
        upiiz.mostrarDatos();
        upiiz.tomarClases();
        
        Docente upiizDocente = new Docente("Pedro","09/05/1980",46,"prof@",
                "Ciencias");
        upiizDocente.setEdad(41);
    //un objeto del tipo Docente, siendo clase hija de Persona se le modifica 
    //la edad por medio de un método heredado de Persona
        upiizDocente.mostrarDatos();
        
    }   
}
