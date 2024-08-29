package factorymethod.rapport.bon;

public class Main {

    public static void main(String[] args) {
        Service service = new ServiceExcel();
        service.envoyerRapport();
    }
}
