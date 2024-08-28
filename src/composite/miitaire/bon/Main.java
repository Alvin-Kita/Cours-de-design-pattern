package composite.miitaire.bon;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Militaire soldat0 = new Soldat();
        soldat0.deplacer(1, 0);

        Soldat soldat1 = new Soldat();
        Soldat soldat2 = new Soldat();
        Soldat soldat3 = new Soldat();

        Militaire regiment = new GroupeMilitaire(List.of(soldat1, soldat2, soldat3));
        regiment.deplacer(1, 0);

        Militaire soldat4 = new Soldat();
        Militaire regiment2 = new GroupeMilitaire(List.of(soldat4));
        regiment2.deplacer(1, 0);

        Militaire escadron = new GroupeMilitaire(List.of(regiment, regiment2));
        escadron.deplacer(1, 0);

    }
}
