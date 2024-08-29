package visitor;

public interface LieuVisitor {
    void visitMairie(Mairie mairie);

    void visitRestaurant(Restaurant restaurant);

    void visitMusee(Musee musee);

    void visitPoste(Poste poste);
}
