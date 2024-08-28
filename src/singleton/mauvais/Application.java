package singleton.mauvais;


public class Application {

    private Preference preference = new Preference();

    public void demarrage() {
        preference.loadPreferences();
    }
}
