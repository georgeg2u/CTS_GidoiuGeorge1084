package decorator.clase;

public abstract class Decorator implements INotaDePlata{
    private INotaDePlata notaDePlata;

    public Decorator(INotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    @Override
    public void printeazaNotaDePlata(double totalPlata) {
        this.notaDePlata.printeazaNotaDePlata(totalPlata);
    }
    public abstract void printareFelicitare();
}
