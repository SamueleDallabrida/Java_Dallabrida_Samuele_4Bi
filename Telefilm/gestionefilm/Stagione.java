package Telefilm.gestionefilm;

public class Stagione {
    private int n_episodi;
    private String nome_sceneggiatore;
    private String trama;
    private int n_stagione;

    public Stagione () {
        //Costruttore vuoto (default)
    }

    public Stagione(int n_episodi, String nome_sceneggiatore, String trama, int n_stagione) throws Exception {
        try {
            setN_episodi(n_episodi);
            setNome_sceneggiatore(nome_sceneggiatore);
            setTrama(trama);
            setN_stagione(n_stagione);
        } catch (IllegalArgumentException e) {
            throw new Exception("Errore durante la creazione della stagione: " + e.getMessage());
        }
    }

    public void setN_episodi(int n_episodi) throws IllegalArgumentException {
        if (n_episodi > 0) {
            this.n_episodi = n_episodi;
        }
        else {
            throw new IllegalArgumentException("Il numero di episodi deve essere maggiore di zero.");
        }
    }

    public int getN_episodi() {
        return n_episodi;
    }

    public void setNome_sceneggiatore(String nome_sceneggiatore) {
        if (nome_sceneggiatore != null && !nome_sceneggiatore.isBlank()) {
            this.nome_sceneggiatore = nome_sceneggiatore;
        }
        else {
            throw new IllegalArgumentException("Il nome del sceneggiatore non può essere vuoto.");
        }
    }

    public String getNome_sceneggiatore() {
        return nome_sceneggiatore;
    }

    public void setTrama(String trama) {
        if (trama != null && !trama.isBlank()) {
            this.trama = trama;
        }
        else {
            throw new IllegalArgumentException("La trama non può essere vuota.");
        }
    }

    public String getTrama() {
        return trama;
    }

    public void setN_stagione(int n_stagione) {
        if (n_stagione > 0) {
            this.n_stagione = n_stagione;
        }
        else {
            throw new IllegalArgumentException("Il numero della stagione deve essere maggiore di zero.");
        }
    }

    public int getN_stagione() {
        return n_stagione;
    }

    @Override
    public String toString() {
        return "Stagione{" +
                "n_episodi=" + n_episodi +
                ", nome_sceneggiatore='" + nome_sceneggiatore + '\'' +
                ", trama='" + trama + '\'' +
                ", n_stagione=" + n_stagione +
                '}';
    }

}
