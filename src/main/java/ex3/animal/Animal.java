package ex3.animal;

public class Animal {
    /**
     * Nom de l'animal
     */
    private String nom;

    /**
     * Type de l'animal
     */
    private Type type;

    /**
     * Comportement de l'animal
     */
    private Comportement comportement;

    /**
     * Constructeur de l'animal
     * @param nom Nom de l'animal
     * @param type Type de l'animal
     * @param comportement Comportement de l'animal
     */
    public Animal(String nom,
                  Type type,
                  Comportement comportement)
    {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    /**
     * @return le nom de l'animal
     */
    public String getNom() {
        return nom;
    }

    /**
     * Redéfinie le nom de l'animal
     * @param nom nom à appliquer
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return le type de l'animal
     */
    public Type getType() {
        return type;
    }

    /**
     * @return le type string de l'animal
     */
    public String getStrType() {
        return type.getValue();
    }

    /**
     * Redéfinie le type de l'animal
     * @param type nouveau type à appliquer
     */
    public void setType(Type type) {
        this.type = type;
    }

    /**
     * @return le comportement de l'animal
     */
    public Comportement getComportement() {
        return comportement;
    }


    /**
     * @return le comportement string de l'animal
     */
    public String getStrComportement() {
        return comportement.getValue();
    }
    /**
     * Redéfinie le comportement de l'animal
     * @param comportement Nouveau comportement à appliquer
     */
    public void setComportement(Comportement comportement) {
        this.comportement = comportement;
    }
}
