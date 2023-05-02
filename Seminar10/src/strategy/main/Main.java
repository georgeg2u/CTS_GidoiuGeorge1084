package strategy.main;

import strategy.clase.Client;
import strategy.clase.PlataCard;
import strategy.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        //problema 11 restaurant
        Client client = new Client("Andrei");
        client.realizeazaPlata(2000);

        client.setModPlata(new PlataCard());
        client.realizeazaPlata(356);

        client.setModPlata(new PlataCash());
        client.realizeazaPlata(1000);
    }
}
