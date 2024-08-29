package observator.stock;


public interface Observable {
    void subscribe(Observator observator);

    void notifierAll();
}
