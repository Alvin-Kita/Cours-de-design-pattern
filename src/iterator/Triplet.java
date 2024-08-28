package iterator;

public class Triplet implements MonIterable {
    private String a;
    private String b;
    private String c;

    public Triplet(String a, String b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    @Override
    public TripletIerator iterator() {
        return new TripletIerator(this);
    }
}
