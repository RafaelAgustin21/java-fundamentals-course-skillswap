// Código final de la Lección 7
class Mascota {
    String nombre;
    int edad;

    // Esto es el Constructor (nace la mascota)
    public Mascota(String nombreInicial, int edadInicial) {
        nombre = nombreInicial;
        edad = edadInicial;
    }

    // Esto es un Método (lo que puede hacer)
    public void saludar() {
        System.out.println("¡Guau! Soy " + nombre + " y tengo " + edad + " años.");
    }
}

public class Main {
    public static void main(String[] args) {
        // ¡Creamos nuestro primer objeto!
        Mascota miPerro = new Mascota("Zeus", 3);
        
        // Hacemos que haga algo
        miPerro.saludar();
    }
}
