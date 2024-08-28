package iterator;

public class MonArrayList implements MonIterable {

    private String[] array = new String[10];
    private int size = 0;

    public void add(String a) {
        if (size == array.length) {
            this.array = createNewArrayTailler();
        }
        array[size] = a;
        size++;
    }

    private String[] createNewArrayTailler() {
        String[] array2 = new String[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        return array2;
    }

    public int size() {
        return size;
    }

    public String get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[i];
    }

    @Override
    public MonIterator iterator() {
        return new MonArrayListIterator(this);
    }
}
