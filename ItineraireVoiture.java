public class ItineraireVoiture implements ItineraireStrategy {
    @Override
    public void calculerItineraire(String depart, String arrivee) {
        System.out.println("\n[VOITURE] Trajet : " + depart + " -> " + arrivee);
        System.out.println("Itineraire : Autoroute a peage (70 km - Duree : 25 min - Cout peage : 1500 FCFA)\n");
    }
}
