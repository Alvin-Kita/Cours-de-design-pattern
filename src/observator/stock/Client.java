package observator.stock;

public class Client implements Observator {
    @Override
    public void notifier() {
        System.out.println("du stock est disponible!");
    }
}
