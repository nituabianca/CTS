package decoratorCarte;

public class DecoratorCaso extends Decorator{
    public DecoratorCaso(AAsigurareAuto asigurareAuto) {
        super(asigurareAuto);
    }

    @Override
    String getDescriere() {
        return super.getDescriere()+" + asigurare Caso";
    }
}
