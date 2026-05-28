
class Mascota {
    String nombre;
    int edad;

    public Mascota(String nombreInicial, int edadInicial) {
        nombre = nombreInicial;
        edad = edadInicial;
    }

    public void saludar() {
        System.out.println("¡Guau! Soy " + nombre + " y tengo " + edad + " años.");
    }
}

public class Main {
    public static void main(String[] args) {
        Mascota miPerro = new Mascota("Zeus", 3);
        miPerro.saludar();
        
        // ¿Qué pasa si alguien intenta borrar el nombre aquí?
        // miPerro.nombre = "";
    }
}
