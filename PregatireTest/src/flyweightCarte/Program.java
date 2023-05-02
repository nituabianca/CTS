package flyweightCarte;

public class Program {
    public static void main(String[] args) {
        AsigurareFlyweightFactory factory=new AsigurareFlyweightFactory();
        IAsigurare asigurare=factory.getAsigurare(ETipAsigurare.RCA);
        asigurare.printeazaContract();
    }
}
