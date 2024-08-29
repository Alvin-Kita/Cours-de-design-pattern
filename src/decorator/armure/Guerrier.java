package decorator.armure;

public class Guerrier implements Personnage {

    private int pointVie = 100;

    public void encaisserDegat(int degat) {
        pointVie = pointVie - degat;
        if (pointVie <= 0) {
            System.out.println("Il est mort !");
        }
    }

    @Override
    public int getPointVie() {
        return pointVie;
    }

}
