package iterator.arbre;

public class Arbre {
    private String valeur;
    private Arbre sousArbreGauche;
    private Arbre sousArbreDroit;
    private Arbre parent; // Ajout d'un parent pour pouvoir revenir en arrière
    private boolean visited = false;

    public void setSousArbres(Arbre sousArbreGauche, Arbre sousArbreDroit) {
        this.sousArbreGauche = sousArbreGauche;
        this.sousArbreDroit = sousArbreDroit;

        // Ajout du parent pour les sous-arbres
        sousArbreGauche.parent = this;
        sousArbreDroit.parent = this;
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
        sousArbreGauche.parent = this;
        this.sousArbreGauche = sousArbreGauche; // Ajout du parent pour le sous-arbre gauche
    }

    public Arbre getSousArbreDroit() {
        return sousArbreDroit;
    }

    public void setSousArbreDroit(Arbre sousArbreDroit) {
        sousArbreDroit.parent = this;
        this.sousArbreDroit = sousArbreDroit; // Ajout du parent pour le sous-arbre droit
    }

    /**
     * Ajout de cette méthode pour pouvoir accéder au parent de l'arbre
     * @return le parent de l'arbre
     */
    public Arbre getParent() {
        return this.parent;
    }

    /**
     * Ajout de cette méthode pour pouvoir modifier l'état visité de l'arbre
     */
    public void setVisited() {
        this.visited = true;
    }

    /**
     * Ajout de cette méthode pour pouvoir accéder à l'état visité de l'arbre
     * @return l'état visité de l'arbre
     */
    public boolean isVisited() {
        return this.visited;
    }
}
