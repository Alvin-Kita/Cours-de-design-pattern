package composite.miitaire.mauvais;

import java.util.List;

public class Regiment {
    private List<Soldat> soldats;

    public Regiment(List<Soldat> soldats) {
        this.soldats = soldats;
    }

    public void deplacer(int x, int y) {
        for (Soldat soldat : soldats) {
            soldat.deplacer(x, y);
        }

    }
}
