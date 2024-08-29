package decorator.armure;

public abstract class PersonnageDecorator implements Personnage {

    private Personnage personnage;

    public PersonnageDecorator(Personnage personnage) {
        this.personnage = personnage;
    }

    @Override
    public void encaisserDegat(int degat) {
        personnage.encaisserDegat(degat);
    }

    @Override
    public int getPointVie() {
        return personnage.getPointVie();
    }
}
