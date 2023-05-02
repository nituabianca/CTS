package decoratorCarte;

public class Program {
    public static void main(String[] args) {
        AAsigurareAuto asigurareAuto=new AsigurareRCA();
        System.out.println(asigurareAuto.getDescriere());

        AAsigurareAuto asigurareCasco=new DecoratorCasco(asigurareAuto);
        System.out.println(asigurareCasco.getDescriere());

        AAsigurareAuto asigurareCaso=new DecoratorCaso(asigurareAuto);
        System.out.println(asigurareCaso.getDescriere());
    }
}
