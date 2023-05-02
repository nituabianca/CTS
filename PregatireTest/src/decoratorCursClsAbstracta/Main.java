package decoratorCursClsAbstracta;

public class Main {
    public static void main(String[] args) {
        AFactura factura=new Factura();
        System.out.println(factura.getFactura());
        factura.pret=23;
        System.out.println(factura.getPret());

        AFactura facturaDecorata=new DecoratorUrare(factura);
        System.out.println(facturaDecorata.getFactura());
        System.out.println(facturaDecorata.getPret());
    }
}