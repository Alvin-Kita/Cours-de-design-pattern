package abstractfactory.widget.bon;

import abstractfactory.widget.bon.avatar.Avatar;
import abstractfactory.widget.bon.bouton.Bouton;
import abstractfactory.widget.bon.input.Input;

public class FenetreChat {

    private final WidgetAbstractFactory widgetAbstractFactory;

    private Avatar avatar;
    private Bouton boutonSend;
    private Bouton boutonClose;
    private Input input;

    public FenetreChat(WidgetAbstractFactory widgetAbstractFactory) {
        this.widgetAbstractFactory = widgetAbstractFactory;
    }

    public void initFenetre() {
        avatar = widgetAbstractFactory.creerAvatar();
        boutonSend = widgetAbstractFactory.creerBouton();
        boutonClose = widgetAbstractFactory.creerBouton();
        input = widgetAbstractFactory.creerInput();

        // créer aussi le input
        // créer le texte area qui contient 'historique
        // creer l'avatar...

        // cabler le bouton send au servie d'envouie du message.
    }

}
