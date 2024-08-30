package composite.recette;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe représentant une recette
 */
public class Recette implements Element {
    private final Map<Ingredient, Double> ingredients = new HashMap<>();
    private final Map<Recette, Double> sousRecettes = new HashMap<>();

    /**
     * Ajoute un ingrédient à la recette
     * @param quantite la quantité de l'ingrédient
     * @param ingredient l'ingrédient à ajouter
     */
    public void add(double quantite, Ingredient ingredient) {
        ingredients.put(ingredient, quantite);
    }

    /**
     * Ajoute une sous recette à la recette
     * @param quantite la quantité de la sous recette
     * @param recette la sous recette à ajouter
     */
    public void addSousRecette(double quantite, Recette recette) {
        sousRecettes.put(recette, quantite);
    }

    /**
     * @return les ingrédients de la recette
     */
    public Map<Ingredient, Double> getIngredients() {
        return ingredients;
    }

    /**
     * @return les sous recettes de la recette
     */
    public Map<Recette, Double> getSousRecettes() {
        return sousRecettes;
    }

    /**
     * Héritée de l'interface Element, calcule le prix de la recette
     * @return le prix de la recette
     */
    @Override
    public double getPrix() {
        double prixTotal = 0;
        // Parcours de la boucle directement depuis la Map pour améliorer la performance (Sonart Lint Java S2864 issue)
        for (Map.Entry<Ingredient, Double> entry : ingredients.entrySet()) {
            Ingredient ingredient = entry.getKey();
            Double quantite = entry.getValue();
            // Ajout du prix de l'ingrédient * la quantité utilisée dans la recette
            prixTotal += ingredient.getPrix() * quantite;
        }

        for (Map.Entry<Recette, Double> entry : sousRecettes.entrySet()) {
            Recette sousRecette = entry.getKey();
            Double quantite = entry.getValue();
            // Ajout du prix de la sous recette * la quantité utilisée dans la recette
            prixTotal += sousRecette.getPrix() * quantite;
        }

        return prixTotal;
    }
}