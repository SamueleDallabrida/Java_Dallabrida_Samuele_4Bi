public class Libro extends Materiale {
    private String autore;

    public Libro(String codice, String titolo, String autore) {
        super(titolo, codice); // Richiama il costruttore della classe padre Materiale
        this.autore = autore;
    }

    @Override 
    public String descrizione() {
        return super.descrizione() + ", Autore: " + autore; // Richiama il metodo descrizione() della classe padre Materiale
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+ ", Autore: " + autore;
    }


}
