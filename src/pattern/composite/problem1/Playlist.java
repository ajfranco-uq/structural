package pattern.composite.problem1;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private final String nombre;
    private final List<Object> elementos = new ArrayList<>();

    public Playlist(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Object elemento) {
        elementos.add(elemento);
    }

    public void reproducir() {

        System.out.println("Reproduciendo playlist: " + nombre);

        for (Object elemento : elementos) {

            // El código que utiliza estos objetos también termina necesitando conocer los tipos
            if (elemento instanceof Song) {
                ((Song) elemento).reproducir();

            } else if (elemento instanceof Playlist) {
                ((Playlist) elemento).reproducir();
            }
            //    Y si mañana agregamos:
            //
            //        Album
            //        PlaylistEspecial
            //        CarpetaMusical
            //        Coleccion
        }
    }
}
// ¿Podemos hacer que Canción y Playlist se comporten de forma uniforme, aunque una sea un elemento
// individual y la otra contenga otros elementos?