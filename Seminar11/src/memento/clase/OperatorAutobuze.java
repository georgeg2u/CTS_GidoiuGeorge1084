package memento.clase;

import java.util.ArrayList;
import java.util.List;

public class OperatorAutobuze {
    private List<MementoAutobuz> listaMementouri = new ArrayList<>();

    public void adaugaMemento(MementoAutobuz memento) {
        this.listaMementouri.add(memento);
    }

   public MementoAutobuz getMemento(int pozitie) {
        return this.listaMementouri.get(pozitie);
   }
}
