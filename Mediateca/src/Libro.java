public class Libro extends Materiale {
    String autore;

    public Libro(String codice, String titolo, String autore) {
        super(titolo, codice); // Richiama il costruttore della classe padre Materiale
        this.autore = autore;
    }
}
