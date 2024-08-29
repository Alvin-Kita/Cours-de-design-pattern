package visitor;

public class Poste implements Lieu {
    public String getHoraires() {
        return null;
    }

    @Override
    public void accept(LieuVisitor visitor) {
        visitor.visitPoste(this);
    }

}
