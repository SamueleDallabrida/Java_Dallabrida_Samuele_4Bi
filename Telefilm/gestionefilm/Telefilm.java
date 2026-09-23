package Telefilm.gestionefilm;

public class Telefilm {

    // attributi

    private String nome;
    private Generi genere;
    private Stato stato;
    private Stagione[] stagioni;

    public Telefilm (String nome, Generi genere, Stato stato, Stagione[] stagioni) throws Exception{
        try {
            setNome(nome);
            setGenere(genere);
            setStato(stato);
            setStagioni(stagioni);  
        } catch (Exception e) {
            throw new Exception("Errore durante la creazione del telefilm: " + e.getMessage());
        }
    }

    public Telefilm () {
        setNome("BERLUSCONI");
        setStato(stato.TERMINATA);
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
        else {
            throw new IllegalArgumentException("Il nome del telefilm non può essere vuoto.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setGenere(Generi genere) {
        if (genere != null) {
            this.genere = genere;
        }
        else {
            throw new IllegalArgumentException("Il genere del telefilm non può essere nullo.");
        }
    }

    public Generi getGenere() {
        return genere;
    }

    public void setStato(Stato stato) {
        if (stato != null) {
            this.stato = stato;
        }
        else {
            throw new IllegalArgumentException("Lo stato del telefilm non può essere nullo.");
        }
    }

    public Stato getStato() {
        return stato;
    }

    public void setStagioni(Stagione[] stagioni) {
        if (stagioni != null && stagioni.length > 0) {
            this.stagioni = stagioni;
        }
        else {
            throw new IllegalArgumentException("Il telefilm deve avere almeno una stagione.");
        }
    }

    public Stagione[] getStagioni() {
        return stagioni;
    }

    public double mediaEpisodiPerStagione() {
        if (stagioni == null || stagioni.length == 0) {
            return 0.0;
        }

        int totaleEpisodi = 0;
        for (Stagione stagione : stagioni) {
            if (stagione != null) {
                totaleEpisodi += stagione.getN_episodi();
            }
        }

        return (double) totaleEpisodi / stagioni.length;
    }

    public boolean haSceneggiatore(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Il nome dello sceneggiatore non può essere vuoto.");
        }

        if (stagioni != null) {
            for (Stagione stagione : stagioni) {
                if (stagione != null && nome.equals(stagione.getNome_sceneggiatore())) {
                    return true;
                }
            }
        }

        return false;
    }

    public void ordinaStagioni(){
        if (stagioni != null) {
            for (int i = 0; i < stagioni.length - 1; i++) {
                for (int j = 0; j < stagioni.length - 1 - i; j++) {
                    if (stagioni[j] != null && stagioni[j + 1] != null && stagioni[j].getN_stagione() > stagioni[j + 1].getN_stagione()) {
                        Stagione temp = stagioni[j];
                        stagioni[j] = stagioni[j + 1];
                        stagioni[j + 1] = temp;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        String testo = "Telefilm{" +
                "nome='" + nome + '\'' +
                ", genere=" + genere +
                ", stato=" + stato +
                ", stagioni=[\n";

        if (stagioni != null) {
            for (int i = 0; i < stagioni.length; i++) {
                if (stagioni[i] != null) {
                    testo += "  " + stagioni[i].toString() + "\n";
                }
            }
        }

        testo += "]}";
        return testo;
    }
}
