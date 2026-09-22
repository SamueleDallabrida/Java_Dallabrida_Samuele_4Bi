package Telefilm.gestionefilm;

public class CollezioneTelefilm {
    private int n_telefilm;
    private Telefilm[] collezione;

    public CollezioneTelefilm () {
        //Costruttore vuoto (default)
    }

    public CollezioneTelefilm(int n_telefilm, Telefilm[] collezione) throws Exception {
        try {
            setN_telefilm(n_telefilm);
            setCollezione(collezione);
        } catch (Exception e) {
            throw new Exception("Errore durante la creazione della collezione di telefilm: " + e.getMessage());
        }
    }

    public CollezioneTelefilm(int dimensione) {
        this.collezione = new Telefilm[dimensione];
        this.n_telefilm = 0;
    }

    public void setN_telefilm(int n_telefilm) throws IllegalArgumentException {
        if (n_telefilm > 0) {
            this.n_telefilm = n_telefilm;
        }
        else {
            throw new IllegalArgumentException("Il numero di telefilm deve essere maggiore di zero.");
        }
    }

    public int getN_telefilm() {
        return n_telefilm;
    }

    public void setCollezione(Telefilm[] collezione) throws Exception {
        if (collezione != null && collezione.length > 0) {
            this.collezione = collezione;
        }
        else {
            throw new Exception("La collezione di telefilm non può essere vuota.");
        }
    }

    public Telefilm[] getCollezione() {
        return collezione;
    }

    public void aggiungiTelefilm(Telefilm t) throws Exception {
        if (t == null) {
            throw new Exception("Impossibile aggiungere un telefilm nullo.");
        }
    
        // Controlliamo se l'array è pieno
        if (n_telefilm < collezione.length) {
            collezione[n_telefilm] = t;
            n_telefilm++; // Incrementiamo il numero di telefilm presenti
        } else {
            throw new Exception("La collezione è piena, impossibile aggiungere altri telefilm.");
        }
    }

    public void ordinaPerNome() {
        for (int i = 0; i < n_telefilm - 1; i++) {
            for (int j = i + 1; j < n_telefilm; j++) {
                // Confronta il nome del telefilm i con il telefilm j
                if (collezione[i].getNome().compareToIgnoreCase(collezione[j].getNome()) > 0) {
                    // Scambio i due telefilm
                    Telefilm temp = collezione[i];
                    collezione[i] = collezione[j];
                    collezione[j] = temp;
                }
            }
        }
    }
}
