package zoo;

import java.util.LinkedHashSet;

public class Zoo<H extends Habitat> {
    private LinkedHashSet<H> zoo = new LinkedHashSet<>();

    public void build(H habitat) {
        zoo.add(habitat);
    }

    public void abandon(H habitat) {
        zoo.remove(habitat);
    }

    public void visitAllHabitats() {
        zoo.forEach(thingy -> System.out.println(thingy.getName()));
    }
}
