package template.main;

import template.clase.MasaLocala;
import template.clase.MasaRestaurant;
import template.clase.MasaRezervata;

public class Main {
    public static void main(String[] args) {
        //problema 14 restaurant
        MasaRestaurant masa = new MasaLocala(6);
        masa.ocupaMasa();
        System.out.println();
        MasaRestaurant masaRezervata = new MasaRezervata(4, "12:00");
        masaRezervata.ocupaMasa();
    }
}
