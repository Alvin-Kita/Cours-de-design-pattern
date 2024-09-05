package iterator.arbre;

import java.util.ArrayList;
import java.util.List;

public class ArbreIterator {

    private final List<Arbre> arbres = new ArrayList<>();

    public ArbreIterator(Arbre arbre) {
        if (arbre != null) {
            arbres.add(arbre);
        }
    }

    public boolean hasMore() {
        return !arbres.isEmpty(); // Si la liste n'est pas vide, il reste des éléments à parcourir
    }

    public Arbre getNext() {
        if (!hasMore()) {
            return null;
        }
        Arbre current = arbres.removeFirst();

        if (current.getSousArbreGauche() != null) {
            arbres.add(current.getSousArbreGauche());
        }
        if (current.getSousArbreDroit() != null) {
            arbres.add(current.getSousArbreDroit());
        }
        return current;
    }
}