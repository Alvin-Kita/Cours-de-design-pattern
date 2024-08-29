package observator.stock;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client();
        Reparateur reparateur = new Reparateur();

        Apple apple = new Apple();
        apple.subscribe(client1);
        apple.subscribe(reparateur);

        apple.majStock(true);
    }
}
