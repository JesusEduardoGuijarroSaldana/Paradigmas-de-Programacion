
package objetos;

/**
 *
 * @author guija
 */
public class Docente extends Persona{
    // atributos propios de está clase 
    private String correoInstitucional;
    private String materia;
    //constructor (profesor)
    public Docente(String nombre, String fechaNacimiento, int edad, 
            String correoInstitucional, String materia){
        super(nombre, fechaNacimiento, edad);
        // nombre, fechaNacimiento, edad ya están inicializados en la clase 
        // padre, en este caso Persona
        // para indicar esto usamos la palabra reservada super
        this.correoInstitucional = correoInstitucional; 
        this.materia = materia;
        // queda por inicializar correoInstitucional  y materia 
    }

    // comportamiento del objeto/ métodos 
    public void impartirClases(){
        System.out.println("Hola, estoy tomando una clase");
    }
    
    // métodos/mecanismo para consultar propios de la clase
// tipo de acceso, valor de retorno, identificador, parámetros, implementación
    public String getCorreoInstitucional(){
        return correoInstitucional; 
    }
    public void setCorreoInstitucional(String correoInstitucional){
        this.correoInstitucional = correoInstitucional;
    }
    public void getMateria(String materia){
        this.materia = materia;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println("\n\nNombre: "+getNombre()+
                "\n\n\tFecha de Nacimiento: "+getFechaNacimiento()+
                "\n\tEdad: "+getEdad()+
                "\n\tCorreo institucional: "+correoInstitucional+
                "\n\tMateria: "+materia);
    }
}
