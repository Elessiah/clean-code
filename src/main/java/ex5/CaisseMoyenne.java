package ex5;

public class CaisseMoyenne extends Caisse {
    /**
     * Constructeur d'un moyen objet
     */
    public CaisseMoyenne()
    {
        super();
    }

    /**
     * Ajoute item si son poids est compris entre 5(inclus) et 20(exclu)
     * @param item Item à ajouter
     */
    @Override
    public void addItem(Item item)
    {
        if (item.getPoids() >= 5 && item.getPoids() < 20)
            this.items.add(item);
    }
}
