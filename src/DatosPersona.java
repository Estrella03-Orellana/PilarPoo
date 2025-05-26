package src;
public abstract class DatosPersona {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    public DatosPersona() {
    }

    public DatosPersona(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Métodos
    public void concentrarse() {
        System.out.println("Concentrándose en ...");
    }

    public void viajar() {
        System.out.println("Viajando");
    }
}
