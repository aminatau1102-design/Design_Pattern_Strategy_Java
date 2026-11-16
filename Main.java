import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NavigateurGPS gps = new NavigateurGPS();
        String depart = "Diamniadio";
        String arrivee = "Dakar (Plateau)";
        int choix = 0;

        System.out.println("=== SYSTEME DE NAVIGATION GPS (PATTERN STRATEGY) ===");

        // La boucle continue tant que l'utilisateur ne choisit pas 5 (Quitter)
        while (choix != 4) {
            System.out.println("Choisissez votre mode de transport (" + depart + " -> " + arrivee + ") :");
            System.out.println("1. Voiture");
            System.out.println("2. Bus / Transport en commun");
            System.out.println("3. A pied");
            //System.out.println("4. TER (Train Express Regional)");
            System.out.println("4. Quitter");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();

            if (choix == 1) {
                gps.setStrategie(new ItineraireVoiture());
                gps.lancerNavigation(depart, arrivee);
            } else if (choix == 2) {
                gps.setStrategie(new ItineraireBus());
                gps.lancerNavigation(depart, arrivee);
            } else if (choix == 3) {
                gps.setStrategie(new ItinerairePieton());
                gps.lancerNavigation(depart, arrivee);
            } // else if (choix == 4) {
                // Ajout de la nouvelle strategie TER sans toucher a NavigateurGPS
               // gps.setStrategie(new ItineraireTER());
              //  gps.lancerNavigation(depart, arrivee);
            } else if (choix == 4) {
                System.out.println("Fin de la navigation. Bon voyage !");
            } else {
                System.out.println("Choix invalide, veuillez reessayer.\n");
            }
        }
        scanner.close();
    }
}
