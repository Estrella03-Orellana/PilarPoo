package src;
public class Masajista extends DatosPersona{
private String titulacion;
private int aniosExperiencia;

public Masajista() {
}

 public Masajista(int id, String nombre, String apellido, int edad,
            String titulacion, int aniosExperiencia) {
        super(id,nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia= aniosExperiencia;
    }

 public String getTitulacion() {
    return titulacion;
 }

 public void setTitulacion(String titulacion) {
    this.titulacion = titulacion;
 }

 public int getAniosExperiencia() {
    return aniosExperiencia;
 }

 public void setAniosExperiencia(int aniosExperiencia) {
    this.aniosExperiencia = aniosExperiencia;
 }

    // Métodos específicos de Masajista
    public void darMasaje() {
        System.out.println("Dando un masaje");
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrándose hacer un masaje");
    }

    @Override
    public void viajar() {
        System.out.println("Viajando para dar un masaje");
    }

}
