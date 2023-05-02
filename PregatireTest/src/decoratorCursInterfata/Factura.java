package decoratorCursInterfata;

public class Factura implements IFactura{
    private float pret;

    public Factura(float pret) {
        this.pret = pret;
    }

    @Override
    public String getFactura() {
        return "Multumim ca ati cumparat de la noi!";
    }

    @Override
    public float getPret() {
        return pret;
    }
}
