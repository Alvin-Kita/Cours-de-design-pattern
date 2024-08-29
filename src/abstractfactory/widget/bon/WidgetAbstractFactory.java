package abstractfactory.widget.bon;

import abstractfactory.widget.bon.avatar.Avatar;
import abstractfactory.widget.bon.bouton.Bouton;
import abstractfactory.widget.bon.input.Input;

public interface WidgetAbstractFactory {
    Bouton creerBouton();
    Input creerInput();
    Avatar creerAvatar();
}
