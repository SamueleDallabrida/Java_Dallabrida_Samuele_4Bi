package Telefilm.applicazione;

import java.util.Scanner;
import Telefilm.gestionefilm.*;

public class MainTelefilm {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Inserisci il nome del telefilm
            System.out.print("Inserisci il nome del telefilm: ");
            String nome = scanner.nextLine();

            // Per gli Enum imposto genere e stato di default, ma sarebbe possibile farli inserire dall'utente
            Generi genere = Generi.DRAMMATICO; 
            Stato stato = Stato.IN_CORSO;

            // Inserisci il numero di stagionii
            System.out.print("Quante stagioni possiede il telefilm? ");
            int nStagioni = scanner.nextInt();
            scanner.nextLine(); //salta prossima riga di testo

            Stagione[] stagioni = new Stagione[nStagioni]; //creazione array stagioni

            // Inseririsci i dati di ciascuna stagione
            for (int i = 0; i < nStagioni; i++) {
                System.out.println("\n--- Inserimento Stagione " + (i + 1) + " ---");
                
                System.out.print("Numero episodi: ");
                int nEpisodi = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Nome sceneggiatore: ");
                String sceneggiatore = scanner.nextLine();

                System.out.print("Trama: ");
                String trama = scanner.nextLine();

                // Creazione dell'oggetto Stagione a aggiunta nell'array
                stagioni[i] = new Stagione(nEpisodi, sceneggiatore, trama, i + 1);
            }

            // Creazione dell'oggetto Telefilm
            Telefilm tf = new Telefilm(nome, genere, stato, stagioni);

            // Test dei vari metodi
            System.out.println("=== TELEFILM CREATO ===");
            System.out.println(tf.toString());

            System.out.println("Media episodi per stagione: " + tf.mediaEpisodiPerStagione());

            System.out.print("Inserisci il nome di uno sceneggiatore da cercare: ");
            String cercaSceneggiatore = scanner.nextLine();
            if (tf.haSceneggiatore(cercaSceneggiatore)) {
                System.out.println("Lo sceneggiatore " + cercaSceneggiatore + " ha lavorato al telefilm!");
            } else {
                System.out.println("Lo sceneggiatore " + cercaSceneggiatore + " NON è presente.");
            }

            // 6. Test di CollezioneTelefilm e ordinamento
            CollezioneTelefilm collezione = new CollezioneTelefilm(5);
            collezione.aggiungiTelefilm(tf);

            // Inserisci un secondo telefilm di prova per testare l'ordinamento
            // collezione.aggiungiTelefilm(secondoTelefilm);
            // collezione.ordinaPerNome();

        } catch (Exception e) {
            System.err.println("Errore: " + e.getMessage());
        }

        scanner.close();
    }
}
