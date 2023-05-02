package flyweightCursZurini;

public class Bon implements IBon{
    private int nrMasa;
    private float cost;

    public Bon(int nrMasa, float cost) {
        this.nrMasa = nrMasa;
        this.cost = cost;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Bon{" +
                "nrMasa=" + nrMasa +
                ", cost=" + cost +
                '}';
    }

    @Override
    public void printeazaBon() {
        System.out.println("Ati stat la masa "+nrMasa+" iar suma totala a fost de "+cost+" lei.");
    }
}
