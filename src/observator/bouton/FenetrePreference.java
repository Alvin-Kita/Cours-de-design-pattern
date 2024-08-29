package observator.bouton;

public class FenetrePreference {

    private final Bouton boutonEnregistrer;

    public FenetrePreference() {
        Observator observator = () -> sauvegarderPreference("..");
        boutonEnregistrer = new Bouton(observator);

        Observator observator2 = new Observator() {
            @Override
            public void notifier() {
                sauvegarderPreference("..");
            }
        };
    }

    public void sauvegarderPreference(String preferences) {
        //...
    }

}
