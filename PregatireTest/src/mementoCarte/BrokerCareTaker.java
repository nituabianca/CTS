package mementoCarte;

import java.util.ArrayList;

public class BrokerCareTaker {
    private ArrayList<VersiuneContractMemento> listaVersiuni=new ArrayList<>();
    public void adaugaVersiune(VersiuneContractMemento versiune){
        this.listaVersiuni.add(versiune);
    }

    public VersiuneContractMemento recuperareVersiune(int i){
        return listaVersiuni.get(i);
    }
}
