package decoratorCursInterfata;

public class DecoratorUrare extends ADecorator{
    public DecoratorUrare(IFactura facturaDecorata) {
        super(facturaDecorata);
    }
    @Override
    public String getFactura() {
        return this.facturaDecorata.getFactura()+"La multi ani!";
    }

    @Override
    public float getPret() {
        return (float) (super.getPret()-0.1*super.getPret());
    }
}
