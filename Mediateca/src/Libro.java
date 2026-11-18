public class Libro extends Materiale {
    String Autore;

    public Libro(String autore, String titolo, String codice) {
        super(titolo, codice); // Richiama il costruttore della classe padre Materiale
        this.Autore = autore;
    }
}
