package decorator.clase;

public class DecoratorNotaPlataPasteFericit extends Decorator{
    public DecoratorNotaPlataPasteFericit(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }
    @Override
    public void printareFelicitare() {
        System.out.println("Paste fericit!");
    }

    @Override
    public void printeazaNotaDePlata(double totalPlata) {
        super.printeazaNotaDePlata(totalPlata);
        System.out.println("Paste fericit pe nota!");
    }
}
