package mementoCarte;

public class Main {
    public static void main(String[] args) {
        BrokerCareTaker brokerCareTaker=new BrokerCareTaker();
        ContractOriginator contractOriginator=new ContractOriginator("Razvan");

        contractOriginator.adaugareClauza("cl1");
        contractOriginator.adaugareClauza("cl2");
        System.out.println(contractOriginator);

        brokerCareTaker.adaugaVersiune(contractOriginator.salvare());
        System.out.println(contractOriginator);


    }
}
