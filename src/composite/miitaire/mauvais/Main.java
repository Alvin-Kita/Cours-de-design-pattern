package composite.miitaire.mauvais;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Soldat soldat0 = new Soldat();
        soldat0.deplacer(1 , 0);

        Soldat soldat1 = new Soldat();
        Soldat soldat2 = new Soldat();
        Soldat soldat3 = new Soldat();
        Regiment regiment = new Regiment(List.of(soldat1, soldat2, soldat3));
        regiment.deplacer(1 , 0);

    }
}
