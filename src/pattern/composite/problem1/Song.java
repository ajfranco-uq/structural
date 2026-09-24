package pattern.composite.problem1;

public class Song {

    private String titulo;

    public Song(String titulo) {
        this.titulo = titulo;
    }

    public void reproducir() {
        System.out.println("Reproduciendo: " + titulo);
    }
}