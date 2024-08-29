package factorymethod.theme.bon;

public abstract class FenetreChat {

    private Bouton boutonSend;
    private Bouton boutonClose;

    public void initFenetre() {
        boutonSend = creerBouton();
        boutonClose = creerBouton();

        // créer aussi le input
        // créer le texte area qui contient 'historique
        // creer l'avatar...

        // cabler le bouton send au servie d'envouie du message.
    }

    abstract Bouton creerBouton();
}
