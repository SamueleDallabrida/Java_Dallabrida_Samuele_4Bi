public class App extends Object {
    public static void main(String[] args) throws Exception {
        Materiale m = new Materiale("C1", "OOP no problem");

        System.out.println(m.descrizione());
        
        Libro l = new Libro("C2", "Ereditarietà", "Montiny");
        System.out.println(l.descrizione());

        Object o;

        o = new Libro("C2", "Ereditarietà", "Editerroneo");
        System.out.println(o.toString()); //binding dinamico, viene richiamato il metodo della classe figlia Libro, non della classe padre Object

        DVD d = new DVD("C3", "DVD Example", 67);
        System.out.println(d.descrizione());
    }
}
