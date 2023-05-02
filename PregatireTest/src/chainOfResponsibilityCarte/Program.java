package chainOfResponsibilityCarte;

public class Program {
    public static void main(String[] args) {
        Broker broker=new Broker();
        ConducereSuperioara conducereSuperioara=new ConducereSuperioara();

        broker.setNextHandler(conducereSuperioara);

        Alerta alerta1=new Alerta("alerta1", 3);
        Alerta alerta2=new Alerta("alerta1", 7);
        Alerta alerta3=new Alerta("alerta1", 5);

        System.out.println("Alerta 1");
        broker.trateazaAlerta(alerta1);

        System.out.println("Alerta 2");
        broker.trateazaAlerta(alerta2);

        System.out.println("Alerta 3");
        broker.trateazaAlerta(alerta3);

    }
}
