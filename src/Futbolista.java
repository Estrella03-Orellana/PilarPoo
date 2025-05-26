package src;

public class Futbolista extends DatosPersona {
    private String idFederacion;

    public Futbolista() {
    }

    public Futbolista(int id, String nombre, String apellido, int edad,
            String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    // Métodos específicos de Futbolista
    public void dirigirPartido() {
        System.out.println("Dirigiendo un partido de fútbol");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Dirigiendo un entrenando para mejorar habilidades");
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrándose en el partido de fútbol");
    }

    @Override
    public void viajar() {
        System.out.println("Viajando para jugar un partido de fútbol");
    }

}
