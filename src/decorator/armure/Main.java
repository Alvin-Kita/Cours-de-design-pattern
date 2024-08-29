package decorator.armure;

public class Main {
    public static void main(String[] args) {
        Personnage personnage = new Guerrier();
        personnage = new BouclierDecorator(personnage);
        personnage = new ArmureDecorator(personnage);

        personnage.encaisserDegat(10);
        System.out.println(personnage.getPointVie());
        personnage.encaisserDegat(10);
        System.out.println(personnage.getPointVie());
        personnage.encaisserDegat(10);
        System.out.println(personnage.getPointVie());

        //96
        //92
        //88
    }
}
