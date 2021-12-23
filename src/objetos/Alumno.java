
package objetos;

/**
 * @author guija
 */
public class Alumno extends Persona{
    // atributos propios de está clase
    private String correoInstitucional;

    //constructor (alumno)
    public Alumno(String nombre, String fechaNacimiento, int edad, 
            String correoInstitucional){
        super(nombre, fechaNacimiento, edad);
        // nombre, fechaNacimiento, edad ya están inicializados en la clase 
        // padre, en este caso Persona
        // para indicar esto usamos la palabra reservada super
        this.correoInstitucional = correoInstitucional;
        // queda por inicializar correoInstitucional 
    }
    
    // comportamiento del objeto/ métodos 
    public void tomarClases(){
        System.out.println("\n**Hola, estoy tomando una clase**");
    }
    
    public String getCorreoInstitucional(){
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional){
        this.correoInstitucional = correoInstitucional;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("\n\nNombre: "+getNombre()+
                "\n\n\tFecha de Nacimiento: "+getFechaNacimiento()+
                "\n\tEdad: "+getEdad()+
                "\n\tCorreo institucional: "+correoInstitucional);
    }
}
