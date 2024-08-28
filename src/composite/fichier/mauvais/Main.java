package composite.fichier.mauvais;

public class Main {
    public static void main(String[] args) {
        Fichier fichier1 = new Fichier("fichier1", 100);
        Fichier fichier2 = new Fichier("fichier2", 102);
        Fichier fichier3 = new Fichier("fichier2", 102);

        Dossier repertoire1 = new Dossier("repertoire1");
        repertoire1.add(fichier1);
        repertoire1.add(fichier2);
        Dossier repertoire2 = new Dossier("repertoire2");
        repertoire2.add(fichier3);

        Dossier repertoire3 = new Dossier("repertoire3");
        repertoire3.add(repertoire1);
        repertoire3.add(repertoire2);

        System.out.println(repertoire3.calculerTaille());

    }
}
