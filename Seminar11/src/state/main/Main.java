package state.main;

import state.clase.Masa;

public class Main {
    public static void main(String[] args) {
        //problema 13 restaurant
        Masa masa = new Masa(5);

        masa.elibereazaMasa();
        masa.ocupaMasa();
        masa.rezervaMasa();
        masa.ridicaRezervare();
        masa.ocupaMasa();
        masa.elibereazaMasa();
        masa.rezervaMasa();
    }
}
