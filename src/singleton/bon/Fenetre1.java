package singleton.bon;


public class Fenetre1 {


    public void method() {
        Preference.getInstance().getPreference("theme");
    }
}
