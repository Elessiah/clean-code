package ex2;

public class LivretA extends CompteBancaire {
    /**
     * tauxRemuneration : taux de rémunération dans le cas d'un livret A
     */
    protected double tauxRemuneration;

    public LivretA(double solde, double tauxRemuneration) {
        super(solde, 0);
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Applique la rémunération annuelle
     */
    public void appliquerRemuAnnuelle() {
        this.solde = solde + solde * tauxRemuneration / 100;
    }


    /**
     * Getter for tauxRemuneration
     *
     * @return the tauxRemuneration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }


    /**
     * Setter
     *
     * @param tauxRemuneration the tauxRemuneration to set
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    /**
     * Override du setter de decouvert pour bloquer sa valeur à l'initial défini dans le constructeur
     * @param decouvert the decouvert to set
     */
    @Override
    public void setDecouvert(double decouvert) {
        if (decouvert != 0) {
            throw new RuntimeException("Un livret A ne peut pas avoir de découvert");
        }
    }

}
