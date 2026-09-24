package pattern.composite.problem2;

public class Main {

    public static void main(String[] args) {

        Cancion cancion1 = new Cancion("Viva la Vida");
        Cancion cancion2 = new Cancion("Hotel California");
        Cancion cancion3 = new Cancion("Dream On");

        Playlist rock = new Playlist("Rock");
        rock.agregar(cancion2);
        rock.agregar(cancion3);

        Playlist favoritas = new Playlist("Mis Favoritas");
        favoritas.agregar(cancion1);
        favoritas.agregar(rock);

        // primer elemento
        favoritas.reproducir();

        // El cliente debe preguntar qué tipo de elemento es cada uno de los elementos contenidos
        if (favoritas.getElementos().get(0).getTipo() == TipoElemento.CANCION) {

            ((Cancion) favoritas.getElementos().get(0)).reproducir();

        } else if (favoritas.getElementos().get(1).getTipo() == TipoElemento.PLAYLIST) {

            ((Playlist) favoritas.getElementos().get(1)).reproducir();
        }
         // así sucesivamente para cada elemento -> podemos usar un ciclo
        // pero siempre debe preguntar que tipo es
    }
}

// ¿Podemos evitar que el cliente tenga que conocer si está trabajando con una Canción o una Playlist?