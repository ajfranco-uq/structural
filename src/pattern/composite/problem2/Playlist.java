package pattern.composite.problem2;

import java.util.ArrayList;
import java.util.List;

public class Playlist extends ElementoMusical {

    private List<ElementoMusical> elementos = new ArrayList<>();

    public Playlist(String nombre) {
        super(nombre, TipoElemento.PLAYLIST);
    }

    public void agregar(ElementoMusical elemento) {
        elementos.add(elemento);
    }

    public List<ElementoMusical> getElementos() {
        return elementos;
    }

    public void reproducir() {

        System.out.println("Reproduciendo playlist: " + nombre);

        for (ElementoMusical elemento : elementos) {

            if (elemento.getTipo() == TipoElemento.CANCION) {
                ((Cancion) elemento).reproducir();

            } else if (elemento.getTipo() == TipoElemento.PLAYLIST) {
                ((Playlist) elemento).reproducir();
            }
        }
    }
}