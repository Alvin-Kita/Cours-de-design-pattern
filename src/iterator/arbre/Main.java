package iterator.arbre;

public class Main {
    public static void main(String[] args) {
        Arbre a = new Arbre("A");

        Arbre b = new Arbre("B");
        Arbre c = new Arbre("C");

        Arbre d = new Arbre("D");
        Arbre e = new Arbre("E");
        Arbre f = new Arbre("F");
        Arbre g = new Arbre("G");
        Arbre h = new Arbre("H");
        Arbre i = new Arbre("I");
        Arbre j = new Arbre("J");

        a.setSousArbres(b, c);

        b.setSousArbres(d, e);
        c.setSousArbres(f, g);

        e.setSousArbreGauche(h);
        f.setSousArbreGauche(i);
        g.setSousArbreGauche(j);

        ArbreIterator arbreIterator = new ArbreIterator(a);
        while (arbreIterator.hasMore()) {
            Arbre arbre = arbreIterator.getNext();
            System.out.println(arbre.getValeur());
        }
    }
}
