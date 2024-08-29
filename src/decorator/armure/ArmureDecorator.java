package decorator.armure;

public class ArmureDecorator extends PersonnageDecorator {

    public ArmureDecorator(Personnage personnage) {
        super(personnage);
    }

    @Override
    public void encaisserDegat(int degat) {
        super.encaisserDegat(degat / 2);
    }

    @Override
    public int getPointVie() {
        return super.getPointVie();
    }
}
