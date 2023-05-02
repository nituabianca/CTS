package decoratorCarte;

public class DecoratorCasco extends Decorator{
    public DecoratorCasco(AAsigurareAuto asigurareAuto) {
        super(asigurareAuto);
    }
    @Override
    String getDescriere() {
        return super.getDescriere()+" + asigurare Casco";
    }
}
