package ex5;

public class PetiteCaisse extends Caisse {
    /**
     * Constructeur d'une petite caisse
     */
    public PetiteCaisse()
    {
        super();
    }

    /**
     * Ajoute item si son poids est strictement inférieur à 5
     * @param item Item à ajouter
     */
    @Override
    public void addItem(Item item)
    {
        if (item.getPoids() < 5)
            this.items.add(item);
    }
}
