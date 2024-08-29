package abstractfactory.widget.bon;


import abstractfactory.widget.bon.avatar.Avatar;
import abstractfactory.widget.bon.avatar.AvatarClair;
import abstractfactory.widget.bon.bouton.Bouton;
import abstractfactory.widget.bon.bouton.BoutonClair;
import abstractfactory.widget.bon.input.Input;
import abstractfactory.widget.bon.input.InputClair;

public class WidgetAbstractFactoryClair implements WidgetAbstractFactory {
    @Override
    public Bouton creerBouton() {
        return new BoutonClair();
    }

    @Override
    public Input creerInput() {
        return new InputClair();
    }

    @Override
    public Avatar creerAvatar() {
        return new AvatarClair();
    }
}
