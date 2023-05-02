package decoratorCursClsAbstracta;

public class DecoratorUrare extends ADecorator{
    public DecoratorUrare(AFactura facturaDecorata) {
        super(facturaDecorata);
    }

    @Override
    String getFactura() {
        return super.getFactura()+" La multi ani!";
    }

    @Override
    float getPret() {
        return (float) (super.getPret()-0.1*super.getPret());
    }
}
