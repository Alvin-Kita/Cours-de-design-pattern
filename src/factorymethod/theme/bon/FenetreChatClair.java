package factorymethod.theme.bon;

public class FenetreChatClair extends FenetreChat {

    Bouton creerBouton() {
        return new BoutonClair();
    }
}
