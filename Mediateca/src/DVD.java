public class DVD extends Materiale {
    int durata;

    public DVD(int durata, String titolo, String codice) {
        super(titolo, codice); // Richiama il costruttore della classe padre Materiale
        this.durata = durata;
    }
}
