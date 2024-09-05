package iterator.arbre;

public interface Iterator {
    // Vérifier qu'il y a des element à parcourir sur l'arbre actuel
    boolean hasMore();

    // Récupérer le point suivant
    Arbre getNext(Arbre arbre);

}
