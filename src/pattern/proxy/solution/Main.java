package pattern.proxy.solution;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== USUARIO AUTENTICADO ===");

        ServicioPelicula servicioAutenticado = new ServicioPeliculaProxy(true);

        servicioAutenticado.obtenerInformacion();


        System.out.println("\n=== USUARIO NO AUTENTICADO ===");

        ServicioPelicula servicioNoAutenticado = new ServicioPeliculaProxy(false);

        servicioNoAutenticado.obtenerInformacion();
    }
}