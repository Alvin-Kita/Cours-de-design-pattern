package composite.fichier.bon;

import java.util.ArrayList;
import java.util.List;

public class Dossier implements Element {
    private String nom;
    private List<Element> elements = new ArrayList<>();

    public Dossier(String nom) {
        this.nom = nom;
    }

    public int calculerTaille() {
        int taille = 0;
        for (Element element : elements) {
            taille += element.calculerTaille();
        }
        return taille;
    }

    public void add(Fichier fichier) {
        elements.add(fichier);
    }

    public void add(Dossier repertoire) {
        elements.add(repertoire);
    }
}
