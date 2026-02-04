package ex1;

import java.util.Date;

public class Entreprise {

    /**
     * Valeur maximale de capital de l'entreprise
     */
    public static final int capitalMax = 3000000;

    /**
     * Identifiant Siret de l'entreprise
     */
    public int siret;

    /**
     * Nom de l'entreprise
     */
    public String nom;

    /**
     * Adresse de l'entreprise
     */
    public String adresse;

    /**
     * Date de création de l'entreprise
     */
    public Date dateCreation;

    /**
     * Affiche le statut de l'entreprise
     * @deprecated ne fait rien
     */
    public void afficherStatut() {

    }

}
