package pattern.composite.solution;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements MusicalElement {

    private String name;
    private List<MusicalElement> elements = new ArrayList<>(); // Esta es la parte fundamental del patrón

    public Playlist(String name) {
        this.name = name;
    }

    public void add(MusicalElement element) {
        elements.add(element);
    }

    @Override
    public void play() {

        System.out.println("Playing playlist: " + name);

        for (MusicalElement element : elements) {
            element.play();
        }
    }
}