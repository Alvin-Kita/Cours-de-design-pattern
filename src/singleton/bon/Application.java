package singleton.bon;


public class Application {

    public void demarrage() {
        Preference.getInstance().loadPreferences();
    }
}
