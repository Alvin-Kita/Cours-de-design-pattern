package iterator;

public class TripletIerator implements MonIterator {
    private Triplet triplet;
    private int position;

    public TripletIerator(Triplet triplet) {
        this.triplet = triplet;
    }

    @Override
    public boolean hasNext() {
        return position < 3;
    }

    @Override
    public String next() {
        String valeur = switch (position) {
            case 0 -> triplet.getA();
            case 1 -> triplet.getB();
            case 2 -> triplet.getC();
            default -> throw new IllegalStateException("Unexpected value: " + position);
        };
        position++;
        return valeur;
    }
}
