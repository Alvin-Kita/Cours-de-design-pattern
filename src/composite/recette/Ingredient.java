package composite.recette;

/**
 * Classe représentant un ingrédient d'une recette
 */
public class Ingredient implements Element {
    private final double prix;
    // L'unité de mesure de l'ingrédient n'est pas utilisée dans le code tel quel
    private final String unite;

    /**
     * Constructeur
     * @param prix le prix de l'ingrédient
     * @param unite l'unité de mesure de l'ingrédient
     */
    public Ingredient(double prix, String unite) {
        this.prix = prix;
        this.unite = unite;
    }

    /**
     * Héritée de l'interface Element, calcule le prix de l'ingrédient
     * @return le prix de l'ingrédient
     */
    public double getPrix() {
        return prix;
    }
}