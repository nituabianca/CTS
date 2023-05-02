package decoratorCursInterfata;

public class Program {
    public static void main(String[] args) {
        IFactura factura=new Factura(23);
        System.out.println(factura.getFactura());
        System.out.println(factura.getPret());

        IFactura facturaDecorata=new DecoratorUrare(factura);
        System.out.println(facturaDecorata.getFactura());
        System.out.println(facturaDecorata.getPret());
    }
}
