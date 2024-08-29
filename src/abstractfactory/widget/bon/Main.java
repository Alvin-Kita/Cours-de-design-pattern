package abstractfactory.widget.bon;

public class Main {
    public static void main(String[] args) {
        WidgetAbstractFactory widgetAbstractFactorySombre = new WidgetAbstractFactorySombre();
        WidgetAbstractFactory widgetAbstractFactoryClair = new WidgetAbstractFactoryClair();

        FenetreChat fenetreChat = new FenetreChat(widgetAbstractFactorySombre);
        fenetreChat.initFenetre();

    }
}
