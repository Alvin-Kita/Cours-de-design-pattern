package observator.bouton;

public class Bouton {
    private Observator observator;

    public Bouton(Observator observator) {
        this.observator = observator;
    }

    public void click() {
        observator.notifier();
    }

}
