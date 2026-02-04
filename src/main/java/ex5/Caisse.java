package ex5;

import java.util.ArrayList;
import java.util.List;

public abstract class Caisse {
    protected List<Item> items;

    /**
     * Constructeur
     *
     */
    public Caisse() {
        this.items = new ArrayList<>();
    }

    /**
     * Getter pour l'attribut items
     *
     * @return the items
     */
    public List<Item> getItems() {
        List<Item> copy = new ArrayList<>(items);
        return copy;
    }

    /**
     * Méthode abstraite des caisses pour pouvoir ajouter un item
     * @param item item à ajouter
     */
    public abstract void addItem(Item item);
}
