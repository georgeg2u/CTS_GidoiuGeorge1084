package memento.main;

import memento.clase.Autobuz;
import memento.clase.OperatorAutobuze;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz("Mugurel", 14, "Otokar", 2015, 20);
        OperatorAutobuze operatorAutobuze = new OperatorAutobuze();
        operatorAutobuze.adaugaMemento(autobuz.creareMemento());
        System.out.println(autobuz.toString());
        autobuz.setNumeSofer("Nea Fane");
        autobuz.setConsumMediu(20);
        System.out.println(autobuz.toString());
        autobuz.restaurareAutobuz(operatorAutobuze.getMemento(0));
        System.out.println(autobuz.toString());
    }
}
