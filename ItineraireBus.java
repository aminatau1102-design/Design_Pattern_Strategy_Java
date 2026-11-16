public class ItineraireBus implements ItineraireStrategy {
    @Override
    public void calculerItineraire(String depart, String arrivee) {
        System.out.println("\n[BUS / TRANSPORT] Trajet : " + depart + " -> " + arrivee);
        System.out.println("Itineraire : Route Nationale N1 / Dakar Dem Dikk (34 km - Duree : 55 min - Tarif : 500 FCFA)\n");
    }
}
