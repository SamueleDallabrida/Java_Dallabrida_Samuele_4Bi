public class Materiale extends Object { // padre della classe è implicitamente Object //no elenco di classi padra -> ereditarietà singola
    private String titolo;
    private String codice;

    // aggiunge estensioni strutturali o comportamentali alle classi figlie
    // estensioni strutturali: attributi, metodi, costruttori
    // estensioni comportamentali: override dei metodi della classe padre
    //Costruttori non ereditati, ma possono essere richiamati con super()
    // Prima cosa che si fa nei costruttori delle classi figlie è richiamare il costruttore della classe padre con super()
    //Costruttore vuoto richiama object e alloca memoria per l'indirizzo dell'oggetto, x32 occupa 4 byte, x64 occupa 8 byte.

    public Materiale(String titolo, String codice) {
        super(); // Richiama il costruttore della classe padre Object
        this.titolo = titolo;
        this.codice = codice;
    }

    public String descrizione() {
        return "Titolo: " + titolo + ", Codice: " + codice;
    }

    @Override
    public String toString() {
        return "Materiale [titolo=" + titolo + ", codice=" + codice + "]";
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }


    

}
