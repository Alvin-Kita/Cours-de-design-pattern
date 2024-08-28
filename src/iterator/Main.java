package iterator;

public class Main {

    public static void main(String[] args) {
        MonArrayList monArrayList = new MonArrayList();
        monArrayList.add("A");
        monArrayList.add("B");
        monArrayList.add("C");
        monArrayList.add("D");
        monArrayList.add("E");
        monArrayList.add("F");
        monArrayList.add("G");
        monArrayList.add("H");
        monArrayList.add("I");
        monArrayList.add("J");
        monArrayList.add("K");// 10ieme element
        monArrayList.add("L");// 11ieme element

        System.out.println(monArrayList.size());
        System.out.println(monArrayList.get(11));
        for (int i = 0; i < monArrayList.size(); i++) {
            System.out.println(monArrayList.get(i));
        }

        Triplet triplet = new Triplet("alex", "baptiste", "chris");
        System.out.println(triplet.getA());
        System.out.println(triplet.getB());
        System.out.println(triplet.getC());

        Matrice matrice = new Matrice();
        matrice.add(3, 3, "coucou");
        for (int x = 0; x < matrice.getX(); x++) {
            for (int y = 0; y < matrice.getY(); x++) {
                String valeur = matrice.getValeur(x, y);
                if (valeur != null) {
                    System.out.println(valeur);
                }
            }
        }

        MonIterator monIterator = monArrayList.iterator();
        monIterator = triplet.iterator();

        while (monIterator.hasNext()) {
            String valeur = monIterator.next();
            System.out.println(valeur);
        }
    }
}
