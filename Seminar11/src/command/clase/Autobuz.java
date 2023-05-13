package command.clase;

public class Autobuz  implements Automobil{
    private int numarAutobuz;

    public Autobuz(int numarAutobuz) {
        this.numarAutobuz = numarAutobuz;
    }

    @Override
    public void plecareInCursa(int numarLinie) {
        System.out.println("Autobuzul " + this.numarAutobuz + " a plecat in cursa de la linia " + numarLinie);
    }
}
