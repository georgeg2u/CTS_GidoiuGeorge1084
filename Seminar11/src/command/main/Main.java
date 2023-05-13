package command.main;

import command.clase.Autobuz;
import command.clase.Automobil;
import command.clase.ComandaPlecareInCursa;
import command.clase.OperatorComenzi;

public class Main {
    public static void main(String[] args) {
        OperatorComenzi operator = new OperatorComenzi();
        Automobil autobuz = new Autobuz(1);

        operator.invocaComanda(new ComandaPlecareInCursa(381, autobuz));
        operator.invocaComanda(new ComandaPlecareInCursa(783, new Autobuz(2)));
        operator.invocaComanda(new ComandaPlecareInCursa(634, autobuz));
        operator.invocaComanda(new ComandaPlecareInCursa(300, new Autobuz(3)));


        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.invocaComanda(new ComandaPlecareInCursa(400, autobuz));
        operator.executaComanda();
        operator.executaComanda();


    }
}
