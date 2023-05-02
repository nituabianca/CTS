package flyweightCursZurini;

public class Mesaje {
    private EMesaj tipMesaj;
    private String mesaj;

    public Mesaje(String mesaj) {
        this.mesaj = mesaj;
        System.out.println("S a creat obj de tip "+this.tipMesaj);
    }

    public EMesaj getTipMesaj() {
        return tipMesaj;
    }
}
