package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    /**
     * Liste de toutes les caisses de l'inventaire
     */
    private List<Caisse> caisses;

    /**
     * Constructeur de l'inventaire
     * Construit et ajoute une petite, moyenne et grande caisse
     */
    public Inventaire() {
        caisses = new ArrayList<Caisse>();
        caisses.add(new PetiteCaisse());
        caisses.add(new CaisseMoyenne());
        caisses.add(new GrandeCaisse());
    }

    /**
     * Ajoute un item
     * @param item item à ajouter
     */
    public void addItem(Item item) {
        caisses.forEach(caisse -> {
            caisse.addItem(item);
        });
    }

    /**
     * @return le nombre totale d'items dans toutes les caisses
     */
    public int taille() {
        int taille = 0;
        for (Caisse caisse : caisses) {
            taille += caisse.getItems().size();
        }
        return taille;
    }
}
