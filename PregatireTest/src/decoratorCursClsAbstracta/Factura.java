package decoratorCursClsAbstracta;

public class Factura extends AFactura{
    @Override
    String getFactura() {
        return "Multumim ca ati cumparat de la noi!";
    }

    @Override
    float getPret() {
        return pret;
    }
}
