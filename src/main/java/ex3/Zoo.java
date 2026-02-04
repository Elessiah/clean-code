package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String nom;
    private List<Animal> animals;

    /**
     * Constructeur de l'objet Zoo
     * @param nom Nom du zoo
     */
    public Zoo(String nom) {
        this.nom = nom;
        animals = new ArrayList<>();
    }

    /**
     * Ajoute un animal au Zoo
     * @param nom Nom de l'animal
     * @param type Type de l'animal
     * @param comportement Comportement de l'animal
     */
    public void addAnimal(String nom, String type, String comportement) {
        animals.add(new Animal(nom, type, comportement));
    }

    /**
     * Affiche la liste des animaux avec leurs noms, types et comportements
     */
    public void afficherListeAnimaux() {
        animals.forEach(animal -> {
            System.out.println(animal.getNom() + " " + animal.getType() + " " + animal.getComportement());
        });
    }

    /**
     * @return le nombre d'animaux du zoo
     */
    public int taille() {
        return animals.size();
    }

    /**
     * Getter for nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
