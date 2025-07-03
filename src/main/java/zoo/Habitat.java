package zoo;

import java.util.HashSet;

public class Habitat<A extends Animal> {
    private HashSet<A> habitat;
    private String name;

    public Habitat(String name) {
        habitat = new HashSet<>();
        this.name = name;
    }

    public void add(A animal) {
        habitat.add(animal);
    }

    public void remove(A animal) {
        habitat.remove(animal);
    }

    public String getName() {
        return name;
    }
}
