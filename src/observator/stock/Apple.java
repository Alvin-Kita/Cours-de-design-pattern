package observator.stock;

import java.util.ArrayList;
import java.util.List;

public class Apple implements Observable {
    private boolean stockDisponible = false;
    private List<Observator> observators = new ArrayList<>();

    public void majStock(boolean stockDisponible) {
        this.stockDisponible = stockDisponible;
        notifierAll();
    }

    @Override
    public void subscribe(Observator observator) {
        observators.add(observator);
    }

    @Override
    public void notifierAll() {
        for (Observator observator : observators) {
            observator.notifier();
        }
    }
}
