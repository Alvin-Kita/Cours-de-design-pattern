package observator.stock;

public class Reparateur implements Observator {
    @Override
    public void notifier() {
        System.out.println("du stock est disponible!");
    }
}
