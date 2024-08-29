package factorymethod.rapport.bon;

public class ServiceText extends Service {
    @Override
    Rapport creerRapport() {
        return new RappportText();
    }
}
