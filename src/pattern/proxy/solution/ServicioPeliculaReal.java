package pattern.proxy.solution;

public class ServicioPeliculaReal implements ServicioPelicula {

    @Override
    public void obtenerInformacion() {

        System.out.println("Consultando información de la película...");
        System.out.println("Conectando con el servidor...");
        System.out.println("Información obtenida correctamente.");
    }
}