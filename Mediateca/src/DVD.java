public class DVD extends Materiale {
    private int durata;

    public DVD(String codice, String titolo, int durata) {
        super(titolo, codice);
        this.durata = durata;
    }

    @Override 
    public String descrizione() {
        return super.descrizione() + ", Durata: " + durata;
    }
}
