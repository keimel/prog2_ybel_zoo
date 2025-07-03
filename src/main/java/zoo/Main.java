package zoo;

import zoo.fishes.Fish;
import zoo.mammals.cats.Cat;
import zoo.mammals.cats.Tiger;
import zoo.mammals.primates.Tarsier;
import zoo.mammals.rodents.Capybara;
import zoo.reptiles.Cobra;

public class Main {
    public static void main(String args[]) {
    //Habitat
        Habitat<Animal> h1, h2;
        h1 = new Habitat<>("Sand");
        h1.add(new Cobra()); h1.add(new Tiger());
        h2 = new Habitat<>("Tropisch");
        h2.add(new Tarsier()); h2.add(new Capybara());
    //Zoo
        Zoo<Habitat> z1 = new Zoo<>();
        z1.build(h1); z1.build(h2); z1.build(new Habitat<>("Meer"));
    //Aquarium
        Aquarium a1 = new Aquarium();
        Habitat<Fish> f1, f2, f3;
        f1 = new Habitat<>("Deepsea");
        f2 = new Habitat<>("Fresh Water");
        f3 = new Habitat<>("Arctic");
        a1.build(f1); a1.build(f2); a1.build(f3);
        a1.visitAllHabitats();
    }
}
