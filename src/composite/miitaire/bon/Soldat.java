package composite.miitaire.bon;

public class Soldat implements Militaire {
    public void deplacer(int x, int y) {
        System.out.println("deplacement vers " + x + " " + y);
    }


}
