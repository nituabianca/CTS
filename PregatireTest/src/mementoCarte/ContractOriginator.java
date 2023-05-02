package mementoCarte;

public class ContractOriginator {
    private String clauza;
    private String numeClient;

    public ContractOriginator(String numeClient) {
        this.clauza = clauza;
        this.numeClient = numeClient;
    }

    @Override
    public String toString() {
        return "ContractOriginator{" +
                "clauza='" + clauza + '\'' +
                ", numeClient='" + numeClient + '\'' +
                '}';
    }

    public void adaugareClauza(String clauza){
        this.clauza+=", "+clauza;
    }

    public VersiuneContractMemento salvare(){
        System.out.println("Salvare contract");
        return new VersiuneContractMemento(clauza);
    }
}
