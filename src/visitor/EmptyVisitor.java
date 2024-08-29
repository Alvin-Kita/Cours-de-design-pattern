package visitor;

public class EmptyVisitor implements LieuVisitor {
    @Override
    public void visitMairie(Mairie mairie) {
    }

    @Override
    public void visitRestaurant(Restaurant restaurant) {
    }

    @Override
    public void visitMusee(Musee musee) {
    }

    @Override
    public void visitPoste(Poste poste) {
    }
}
