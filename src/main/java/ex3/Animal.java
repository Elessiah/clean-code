package ex3;

public class Animal {
    /**
     * Nom de l'animal
     */
    private String nom;

    /**
     * Type de l'animal
     */
    private String type;

    /**
     * Comportement de l'animal
     */
    private String comportement;

    /**
     * Constructeur de l'animal
     * @param nom Nom de l'animal
     * @param type Type de l'animal
     * @param comportement Comportement de l'animal
     */
    public Animal(String nom,
                  String type,
                  String comportement)
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
    public String getType() {
        return type;
    }

    /**
     * Redéfinie le type de l'animal
     * @param type nouveau type à appliquer
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return le comportement de l'animal
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Redéfinie le comportement de l'animal
     * @param comportement Nouveau comportement à appliquer
     */
    public void setComportement(String comportement) {
        this.comportement = comportement;
    }
}
