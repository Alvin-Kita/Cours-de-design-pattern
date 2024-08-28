package composite.miitaire.bon;

import java.util.List;

public class GroupeMilitaire implements Militaire{
    private List<Militaire> militaires;

    public GroupeMilitaire(List<Militaire> militaires) {
        this.militaires = militaires;
    }

    public void deplacer(int x, int y) {
        for (Militaire militaires : militaires) {
            militaires.deplacer(x, y);
        }

    }
}
