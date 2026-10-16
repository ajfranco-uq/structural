package pattern.composite.solution;

public class Main {

    public static void main(String[] args) {

        Song song1 = new Song("De Música Ligera");
        Song song2 = new Song("Hotel California");
        Song song3 = new Song("Dream On");

        Song song4 = new Song("AXASDF");

        Playlist rock = new Playlist("Rock");
        rock.add(song2);
        rock.add(song3);

        Playlist pop = new Playlist("Pop");
        pop.add(song4);

        Playlist favorites = new Playlist("My Favorites");
        favorites.add(song1);
        favorites.add(rock);
        favorites.add(pop);

        favorites.play();
        // El cliente trabaja con la abstracción común y no necesita distinguir entre un objeto individual y una composición de objetos.
    }
}

// Salida en consola
// Playing playlist: My Favorites
// Playing song: De Música Ligera
// Playing playlist: Rock
// Playing song: Hotel California
// Playing song: Dream On

// Playing playlist: Pop
// Playing song: AXASDF




