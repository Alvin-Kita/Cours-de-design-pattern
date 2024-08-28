package composite.miitaire.mauvais;

import java.util.List;

public class Escadron {
    private List<Regiment> regiments;

    public Escadron(List<Regiment> regiments) {
        this.regiments = regiments;
    }

    public void deplacer(int x, int y) {
        for (Regiment regiments : regiments) {
            regiments.deplacer(x, y);
        }

    }
}
