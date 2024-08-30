package composite.recette;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Création des unités d'ingrédients
        String piece = "piece";
        String l = "litre";
        String kg = "kg";

        // Création des ingrédients
        Ingredient tomate = new Ingredient(0.3, piece);
        Ingredient oignon = new Ingredient(0.1, piece);
        Ingredient huile = new Ingredient(10, l);
        Ingredient farine = new Ingredient(2, kg);
        Ingredient sel = new Ingredient(0.5, kg);
        Ingredient eau = new Ingredient(0.1, l);
        Ingredient mozzarella = new Ingredient(3, piece);
        Ingredient boeuf = new Ingredient(20, kg);

        // Création des recettes
        Recette boulette = new Recette();
        boulette.add(0.1, boeuf);
        boulette.add(0.01, huile);

        Recette sauceTomate = new Recette();
        sauceTomate.add(3, tomate);
        sauceTomate.add(1, oignon);
        sauceTomate.add(0.1, huile);
        sauceTomate.addSousRecette(1, boulette);

        Recette pate = new Recette();
        pate.add(0.250, farine);
        pate.add(0.001, sel);
        pate.add(0.250, eau);
        pate.add(0.010, huile);

        Recette pizza = new Recette();
        pizza.addSousRecette(1, sauceTomate);
        pizza.addSousRecette(1, pate);
        pizza.add(2, mozzarella);

        /* À faire :
         * 1. Calculer le prix d'une recette de manière naïve = sans le pattern Composite
         * 2. Calculer le prix d'une recette en utilisant le pattern Composite
         */

        // 1. Calculer le prix d'une recette de manière naïve = sans le pattern Composite
        double prixTotal = calculerPrixRecette(pizza);
        System.out.println("Le prix total de la pizza (calculé sans pattern Composite) est de " + prixTotal + " euros");

        // 2. Calculer le prix d'une recette en utilisant le pattern
        System.out.println("Le prix total de la pizza (calculé avec pattern Composite) est de " + getPrixArrondi(pizza.getPrix()) + " euros");

        // J'aurais pu utiliser des logger pour afficher les messages, mais je ne pense pas que c'est attendu pour cet exercice.
    }

    /**
     * Calcule le prix total d'une recette en parcourant récursivement ses ingrédients et sous recettes
     * @param recette La recette dont on veut calculer le prix
     * @return Le prix total de la recette en euros (arrondi à 2 chiffres après la virgule)
     */
    private static double calculerPrixRecette(Recette recette) {
        double prixTotal = 0;

        // Prix des ingredients
        Set<Ingredient> tousSesIngredientsDirects = recette.getIngredients().keySet();
        for (Ingredient ingredient : tousSesIngredientsDirects) {
            Double quantite = recette.getIngredients().get(ingredient);
            // Ajout du prix de l'ingrédient  * la quantité utilisée dans la recette
            prixTotal += ingredient.getPrix() * quantite;
        }

        // Prix des sous recettes
        Set<Recette> tousSesSousRecettesDirects = recette.getSousRecettes().keySet();
        for (Recette sousRecette : tousSesSousRecettesDirects) {
            Double quantite = recette.getSousRecettes().get(sousRecette);
            double prixUnitaireDeLaSousRecette = calculerPrixRecette(sousRecette);
            // Ajout du prix de la sous recette * la quantité utilisée dans la recette
            prixTotal += prixUnitaireDeLaSousRecette * quantite;
        }

        // Arrondir le prix à 2 chiffres après la virgule au plus proche pour un retour cohérent
        return getPrixArrondi(prixTotal);
    }

    /**
     * Arrondit un prix à 2 chiffres après la virgule
     * @param prix Le prix total à arrondir
     * @return Le prix arrondi à 2 chiffres après la virgule pour un affichage en euros
     */
    private static double getPrixArrondi(double prix) {
        double prixArrondi = Math.round(prix * 100);
        return prixArrondi / 100;
    }
}