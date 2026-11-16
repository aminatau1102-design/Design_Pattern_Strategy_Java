public class ItinerairePieton implements ItineraireStrategy {
    @Override
    public void calculerItineraire(String depart, String arrivee) {
        System.out.println("\n[A PIED] Trajet : " + depart + " -> " + arrivee);
        System.out.println("Itineraire : Voies pietonnes et passerelles (31 km - Duree : 6h 15min - Gratuit)\n");
    }
}
