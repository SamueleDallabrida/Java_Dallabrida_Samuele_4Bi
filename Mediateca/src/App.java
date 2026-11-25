public class App extends Object {
    public static void main(String[] args) throws Exception {
        Materiale m = new Materiale("C1", "OOP no problem");

        System.out.println(m.descrizione());
        
        Libro l = new Libro("C2", "Ereditarietà", "Montiny");
        System.out.println(l.descrizione());
    }
}
