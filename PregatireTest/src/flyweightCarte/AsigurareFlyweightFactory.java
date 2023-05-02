package flyweightCarte;

import java.util.HashMap;

public class AsigurareFlyweightFactory {
    public HashMap<ETipAsigurare, IAsigurare> listaAsigurari;
    private int nrAsigurari;

    public AsigurareFlyweightFactory() {
        this.listaAsigurari = new HashMap<ETipAsigurare, IAsigurare>();
    }

    public int getNrAsigurari() {
        return listaAsigurari.size();
    }

    public IAsigurare getAsigurare(ETipAsigurare tipAsigurare){
        IAsigurare asigurare=listaAsigurari.get(tipAsigurare);
        if (asigurare==null){
            asigurare=new Asigurare(ETipAsigurare.RCA,"Razvan", "ceva");
            listaAsigurari.put(tipAsigurare, asigurare);
        }
        return asigurare;
    }
}
