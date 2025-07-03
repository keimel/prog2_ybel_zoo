package zoo;

import zoo.mammals.cats.Tiger;
import zoo.mammals.primates.Tarsier;
import zoo.mammals.rodents.Capybara;
import zoo.reptiles.Cobra;

public class Main {
    public static void main(String args[]) {
        Habitat<Animal> h1, h2;
        h1 = new Habitat<>("Sand");
        h1.add(new Cobra()); h1.add(new Tiger());
        h2 = new Habitat<>("Tropisch");
        h2.add(new Tarsier()); h2.add(new Capybara());
        
    }
}
