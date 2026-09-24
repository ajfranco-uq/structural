package pattern.composite.problem2;

public class Cancion extends ElementoMusical {

    public Cancion(String nombre) {
        super(nombre, TipoElemento.CANCION);
    }

    public void reproducir() {
        System.out.println("Reproduciendo canción: " + nombre);
    }
}