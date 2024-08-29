package iterator.arbre;

public class Arbre {
    private String valeur;
    private Arbre sousArbreGauche;
    private Arbre sousArbreDroit;

    public void setSousArbres(Arbre sousArbreGauche, Arbre sousArbreDroit) {
        this.sousArbreGauche = sousArbreGauche;
        this.sousArbreDroit = sousArbreDroit;
    }

    public Arbre(String valeur) {
        this.valeur = valeur;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public Arbre getSousArbreGauche() {
        return sousArbreGauche;
    }

    public void setSousArbreGauche(Arbre sousArbreGauche) {
        this.sousArbreGauche = sousArbreGauche;
    }

    public Arbre getSousArbreDroit() {
        return sousArbreDroit;
    }

    public void setSousArbreDroit(Arbre sousArbreDroit) {
        this.sousArbreDroit = sousArbreDroit;
    }
}
