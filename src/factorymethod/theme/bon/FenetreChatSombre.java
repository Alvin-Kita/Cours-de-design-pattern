package factorymethod.theme.bon;

public class FenetreChatSombre extends FenetreChat {

     Bouton creerBouton() {
        return new BoutonSombre();
    }
}
