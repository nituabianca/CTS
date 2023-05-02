package decoratorCursInterfata;

public abstract class ADecorator implements IFactura{
    public IFactura facturaDecorata;

    public ADecorator(IFactura facturaDecorata) {
        this.facturaDecorata = facturaDecorata;
    }
    @Override
    public String getFactura() {
        return this.facturaDecorata.getFactura();
    }

    @Override
    public float getPret() {
        return this.facturaDecorata.getPret();
    }
}
