package iterator;

public class MonArrayListIterator implements MonIterator {

    private final MonArrayList monArrayList;
    private int index = 0;

    public MonArrayListIterator(MonArrayList monArrayList) {
        this.monArrayList = monArrayList;
    }

    @Override
    public boolean hasNext() {
        return index < monArrayList.size();
    }

    @Override
    public String next() {
        String valeur = monArrayList.get(index);
        index++;
        return valeur;
    }
}
