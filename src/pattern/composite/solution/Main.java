package pattern.composite.solution;

public class Main {

    public static void main(String[] args) {

        Song song1 = new Song("De Música Ligera");
        Song song2 = new Song("Hotel California");
        Song song3 = new Song("Dream On");

        Playlist rock = new Playlist("Rock");
        rock.add(song2);
        rock.add(song3);

        Playlist favorites = new Playlist("My Favorites");
        favorites.add(song1);
        favorites.add(rock);

        favorites.play();
        // El cliente trabaja con la abstracción común y no necesita distinguir entre un objeto individual y una composición de objetos.
    }
}