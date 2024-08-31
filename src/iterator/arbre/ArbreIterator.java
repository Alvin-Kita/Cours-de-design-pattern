package iterator.arbre;

public class ArbreIterator implements Iterator {

    Arbre current;

    public ArbreIterator(Arbre origine) {
        this.current = origine;
    }

    @Override
    public boolean hasMore() {
        return current != null;
    }

    /**
     * Parcours Depth-First.
     * On part de la racine et on va le plus à gauche possible.
     * Si on ne peut plus aller à gauche, on va à droite.
     * Si on ne peut plus descendre dans l'arbre, on remonte jusqu'à trouver une branche droite non visitée.
     */
    @Override
    public Arbre getNext() {

        // On part la gauche si on n'y est pas déjà allé.
        if (current.getSousArbreGauche() != null && !current.getSousArbreGauche().isVisited()) {
            current = current.getSousArbreGauche();
        }

        // S'il n'y a pas de branche à gauche ou qu'on y est déjà allé, on part à droite.
        else if (current.getSousArbreDroit() != null && !current.getSousArbreDroit().isVisited()) {
            current = current.getSousArbreDroit();

        // S'il n'y a pas de branche à gauche ou à droite ou qu'on y est déjà allé, on remonte jusqu'à tomber sur une branche droite non visitée.
        } else {
            while (current.getSousArbreDroit() == null || current.getSousArbreDroit().isVisited()) {
                current = current.getParent();
            }
            current = current.getSousArbreDroit();
        }
        current.setVisited();

        return current;
    }
}
