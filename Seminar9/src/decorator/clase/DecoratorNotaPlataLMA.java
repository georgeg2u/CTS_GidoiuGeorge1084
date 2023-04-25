package decorator.clase;

public class DecoratorNotaPlataLMA extends Decorator{
    public DecoratorNotaPlataLMA(INotaDePlata notaDePlata) {
        super(notaDePlata);
    }
    @Override
    public void printareFelicitare() {
        System.out.println("La multi ani");
    }

    @Override
    public void printeazaNotaDePlata(double totalPlata) {
        super.printeazaNotaDePlata(totalPlata);
        System.out.println("La multi ani pe nota!");
    }
}
