package Telefilm.gestionefilm;
import Telefilm.gestionefilm.Stagione;

public class CollezioneStagioni {
    
    private Stagione[] collezione;
    private int count;  //numero di elementi inseiriti nel vettore

    private int dimMax; //rappresenta la dimensione massima del vettore (può essere sostituita da collezione.length)

    /**
     * Crea una collezione con una dimensione fornita in input
     * @param dimensione
     */
    public CollezioneStagioni(int dimensione) 
    {
        collezione = new Stagione[dimensione];
        count = 0;
        dimMax = dimensione;
    }


    /**
     * Crea una collezione con una dimensione fissa pari a 50 stagioni
     */
    public CollezioneStagioni()
    {   
        this(50);
        // collezione = new Stagione[50];
        // count = 0;
        // dimMax = 50;
    }

    /**
     * Aggiunge una stagione al vettore delle stagioni
     */
    public void addStagione(Stagione s)
    {
        if (s == null) {
            throw new IllegalArgumentException("GOOFY VETTORE NULL");
        }

        this.collezione[count] = s;
        count++;
    }

    @Override 
    public String toString()
    {
        String tmp="";
        for (int i = 0; i < this.count; i++) {
            tmp+= this.collezione[i].toString()+"\n";
            return tmp;
        }
    }

}
