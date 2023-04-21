package restaurant.adapter.main;

import restaurant.adapter.bar.ISoftBar;
import restaurant.adapter.bar.SoftBar;
import restaurant.adapter.bucatarie.AdapterObiecteRestaurant;
import restaurant.adapter.bucatarie.AdapterRestaurant;
import restaurant.adapter.bucatarie.Bucatarie;
import restaurant.adapter.bucatarie.ISoftRestaurant;

public class Main {
    public static void imprimare(ISoftRestaurant restaurant, float totalNota){
        restaurant.printeazaNota(totalNota);
    }
    public static void main(String[] args) {
        ISoftBar bar = new SoftBar("Alcadibo");
//        bar.printeazaNotaBauturi(240);

        ISoftRestaurant bucatarie = new Bucatarie("Chef Scarlatescu");
//        bucatarie.printeazaNota(350);

//        Main.imprimare(bar, 230);
        Main.imprimare(bucatarie, 300);

        AdapterRestaurant adapter = new AdapterRestaurant("Alcadibo");
        Main.imprimare(adapter, 450);


        AdapterObiecteRestaurant adapterObiecte = new AdapterObiecteRestaurant(bar);
        Main.imprimare(adapterObiecte, 500);
    }
}
