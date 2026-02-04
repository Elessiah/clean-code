package ex3;

import ex3.animal.Comportement;
import ex3.animal.Type;

public class ZooApplication {

    public static void main(String[] args) {
        Zoo zoo = new Zoo("Thoiry");

        zoo.addAnimal("Gazelle", Type.MAMMIFERE, Comportement.HERBIVORE);
        zoo.addAnimal("Zèbre", Type.MAMMIFERE, Comportement.HERBIVORE);
        zoo.addAnimal("Lion", Type.MAMMIFERE, Comportement.HERBIVORE);
        zoo.addAnimal("Panthère", Type.MAMMIFERE, Comportement.CARNIVORE);
        zoo.addAnimal("Requin blanc", Type.POISSON, Comportement.HERBIVORE);
        zoo.addAnimal("Truite dorée", Type.POISSON, Comportement.HERBIVORE);
        zoo.addAnimal("Boa constrictor", Type.SERPENT, Comportement.CARNIVORE);
        zoo.addAnimal("Python", Type.SERPENT, Comportement.CARNIVORE);

        zoo.afficherListeAnimaux();
    }

}
