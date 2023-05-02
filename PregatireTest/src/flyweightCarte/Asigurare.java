package flyweightCarte;

public class Asigurare implements IAsigurare{
    private ETipAsigurare tipAsigurare;
    private String numeClient;
    private String dateClient;

    public Asigurare(ETipAsigurare tipAsigurare, String numeClient, String dateClient) {
        this.tipAsigurare = tipAsigurare;
        this.numeClient = numeClient;
        this.dateClient = dateClient;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getDateClient() {
        return dateClient;
    }

    @Override
    public String toString() {
        return "Asigurare{" +
                "tipAsigurare=" + tipAsigurare +
                ", numeClient='" + numeClient + '\'' +
                ", dateClient='" + dateClient + '\'' +
                '}';
    }

    public void setDateClient(String dateClient) {
        this.dateClient = dateClient;
    }

    @Override
    public void printeazaContract() {
        System.out.println("Clientul "+numeClient+ "cu datele "+dateClient+" are asigurare de tip "+tipAsigurare);
    }
}
