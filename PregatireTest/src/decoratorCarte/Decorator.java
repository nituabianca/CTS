package decoratorCarte;

public abstract class Decorator extends AAsigurareAuto {
    AAsigurareAuto asigurareAuto;

    public Decorator(AAsigurareAuto asigurareAuto) {
        this.asigurareAuto = asigurareAuto;
    }
    @Override
    String getDescriere() {
        return this.asigurareAuto.getDescriere();
    }
}
