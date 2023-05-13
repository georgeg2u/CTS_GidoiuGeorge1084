package command.clase;

import java.util.ArrayList;
import java.util.List;

public class OperatorComenzi {
    private List<ICommand> comenzi = new ArrayList<>();

    public  void invocaComanda(ICommand comanda) {
         comenzi.add(comanda);
    }

    public void executaComanda() {
        if (this.comenzi.size() != 0) {
            comenzi.get(0).executa();
            comenzi.remove(comenzi.get(0));
        }
    }
}
