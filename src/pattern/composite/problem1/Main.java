package pattern.composite.problem1;

public class Main {

    public static void main(String[] args) {

        Song cancion = new Song("Viva la Vida");

        Playlist rock = new Playlist("Rock");
        rock.agregar(new Song("Hotel California"));
        rock.agregar(new Song("Dream On"));

        Object elemento1 = cancion;
        Object elemento2 = rock;

        // Trabajando con una canción
        if (elemento1 instanceof Song) {
            ((Song) elemento1).reproducir();

        } else if (elemento1 instanceof Playlist) {
            ((Playlist) elemento1).reproducir();
        }

        // Trabajando con una playlist
        if (elemento2 instanceof Song) {
            ((Song) elemento2).reproducir();

        } else if (elemento2 instanceof Playlist) {
            ((Playlist) elemento2).reproducir();
        }
    }
}