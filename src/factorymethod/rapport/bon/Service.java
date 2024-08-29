package factorymethod.rapport.bon;

public abstract class Service {

    public void envoyerRapport() {
        Rapport rapport = creerRapport();
        envoyerDocument(rapport);
    }

    private void envoyerDocument(Rapport rapport) {

    }

   abstract Rapport creerRapport();
}
