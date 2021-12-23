
package objetos;

/*
 * @author guija
 */
public class Persona {
    //atributos
    private String nombre;
    private String fechaNacimiento;
    private int edad;
    //constructor 
    public Persona(String nombre, String fechaNacimiento, int edad){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }
    // comportamiento del objeto/ métodos 
    public void saludar(){
        System.out.println("Hola, soy una persona");
    }
    public void vivir(){
        System.out.println("Hola, estoy vivo");
    }
    public void comer(){
        System.out.println("*Come*");
    }
    
    // métodos/mecanismo para consultar 
// tipo de acceso, valor de retorno, identificador, parámetros, implementación 
    public String getNombre(){
        return nombre; // para este caso no es muy necesario agregar el .this
    }
    public String getFechaNacimiento(){
        return fechaNacimiento;
    }
    public int getEdad(){
        return edad;
    }
    // métodos/mecanismo para modificar
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void mostrarDatos(){
        System.out.println("\n\nNombre: "+nombre+
                "\n\n\tFecha de Nacimiento: "+fechaNacimiento+
                "\n\tEdad: "+edad);
    }

}
