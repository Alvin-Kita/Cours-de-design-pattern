package decorator.armure;

public class BouclierDecorator extends PersonnageDecorator {

    public BouclierDecorator(Personnage personnage) {
        super(personnage);
    }

    @Override
    public void encaisserDegat(int degat) {
        super.encaisserDegat(degat - 2);
    }
}
