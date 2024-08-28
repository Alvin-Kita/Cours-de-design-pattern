package singleton.bon;

public class Preference {

    private static final Preference preference = new Preference();

    public static Preference getInstance() {
        return preference;
    }

    private Preference() {
    }

    public void loadPreferences() {

    }

    public void getPreference(String pref1) {
    }


    public void modifierPreference(String pref2, String val2) {
    }
}
