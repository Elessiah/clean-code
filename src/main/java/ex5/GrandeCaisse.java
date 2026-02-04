package ex5;

public class GrandeCaisse extends Caisse {
    /**
     * Constructeur d'un grande objet
     */
    public GrandeCaisse()
    {
        super();
    }

    /**
     * Ajoute item si son poids est supérieur ou égale à 20
     * @param item Item à ajouter
     */
    @Override
    public void addItem(Item item)
    {
        if (item.getPoids() >= 20)
            this.items.add(item);
    }
}