public class NavigateurGPS {
    private ItineraireStrategy strategie;

    public void setStrategie(ItineraireStrategy strategie) {
        this.strategie = strategie;
    }

    public void lancerNavigation(String depart, String arrivee) {
        if (strategie == null) {
            System.out.println("Erreur : Veuillez choisir un mode de transport !");
        } else {
            strategie.calculerItineraire(depart, arrivee);
        }
    }
}