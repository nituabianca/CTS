package decoratorCursClsAbstracta;

public abstract class ADecorator extends AFactura{
    private AFactura facturaDecorata;

    public ADecorator(AFactura facturaDecorata) {
        this.facturaDecorata = facturaDecorata;
    }

    @Override
    String getFactura() {
        return this.facturaDecorata.getFactura();
    }

    @Override
    float getPret() {
        return facturaDecorata.pret;
    }
}
