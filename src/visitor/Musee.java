package visitor;

public class Musee implements Lieu {
    public String getPublicVise() {
        return "enfant";
    }

    public String getHoraires() {
        return null;
    }

    @Override
    public void accept(LieuVisitor visitor) {
        visitor.visitMusee(this);
    }
}
