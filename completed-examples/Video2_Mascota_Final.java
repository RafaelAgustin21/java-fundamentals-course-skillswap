// Código final de la Lección 8
class Mascota {
    // Ponemos 'private' para proteger el dato como en una caja fuerte
    private String nombre; 

    public Mascota(String nombreInicial) {
        nombre = nombreInicial;
    }

    // Getter (La ventanilla para leer el dato)
    public String getNombre() {
        return nombre;
    }

    // Setter (La ventanilla para modificar con reglas)
    public void setNombre(String nuevoNombre) {
        if (nuevoNombre.equals("")) {
            System.out.println("¡Error! Una mascota debe tener nombre.");
        } else {
            nombre = nuevoNombre;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota miPerro = new Mascota("Zeus");
        
        // miPerro.nombre = "";  <-- ¡Esto ya no se puede hacer!
        
        miPerro.setNombre("Max"); // Forma correcta de cambiarlo
        System.out.println("Mi perro ahora se llama: " + miPerro.getNombre());
    }
}
