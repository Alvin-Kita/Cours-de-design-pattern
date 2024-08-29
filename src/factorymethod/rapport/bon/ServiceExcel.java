package factorymethod.rapport.bon;

public class ServiceExcel extends Service {
    @Override
    Rapport creerRapport() {
        return new RappportExcel();
    }
}
