package abstractfactory.widget.bon;


import abstractfactory.widget.bon.avatar.Avatar;
import abstractfactory.widget.bon.avatar.AvatarSombre;
import abstractfactory.widget.bon.bouton.Bouton;
import abstractfactory.widget.bon.bouton.BoutonSombre;
import abstractfactory.widget.bon.input.Input;
import abstractfactory.widget.bon.input.InputSombre;

public class WidgetAbstractFactorySombre implements WidgetAbstractFactory {
    @Override
    public Bouton creerBouton() {
        return new BoutonSombre();
    }

    @Override
    public Input creerInput() {
        return new InputSombre();
    }

    @Override
    public Avatar creerAvatar() {
        return new AvatarSombre();
    }
}
