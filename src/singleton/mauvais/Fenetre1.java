package singleton.mauvais;


public class Fenetre1 {

    private Preference preference = new Preference();

    public void method() {

        preference.getPreference("theme");
    }
}
