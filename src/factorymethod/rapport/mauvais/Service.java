package factorymethod.rapport.mauvais;

public class Service {

    private String typeRapport = "excel";

    public void envoyerRapport() {
        if (typeRapport.equals("excel")) {
            RappportExcel rapport = generateRapportExcel();
            envoyerDocument(rapport);
        } else {
            RappportText rapport = generateRapportText();
            envoyerDocument(rapport);
        }
    }

    private void envoyerDocument(RappportExcel rapport) {

    }

    private void envoyerDocument(RappportText rapport) {

    }

    private RappportText generateRapportText() {
        return new RappportText();
    }

    private RappportExcel generateRapportExcel() {
        return new RappportExcel();
    }
}
