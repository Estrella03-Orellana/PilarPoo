import src.Futbolista;

public class Main {
    public static void main(String[] args) {
        Futbolista futbolista = new Futbolista("Lionel", "Messi", 34, "12345");
        
        // Mostrar información del futbolista
        System.out.println("Nombre: " + futbolista.getNombre());
        System.out.println("Apellido: " + futbolista.getApellido());
        System.out.println("Edad: " + futbolista.getEdad());
        System.out.println("ID Federación: " + futbolista.getIdFederacion());
        
        // Llamar a los métodos específicos
        futbolista.concentrarse();
        futbolista.viajar();
        futbolista.dirigirPartido();
        futbolista.dirigirEntrenamiento();
    }

}
