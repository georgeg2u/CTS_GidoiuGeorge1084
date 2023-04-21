package restaurant.proxy.main;

import restaurant.proxy.clase.IRestaurant;
import restaurant.proxy.clase.ProxyRestaurant;
import restaurant.proxy.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        IRestaurant restaurant = new Restaurant("Hush");
        restaurant.rezervaMasa(3);

        ProxyRestaurant proxyRestaurant = new ProxyRestaurant(restaurant);
        proxyRestaurant.rezervaMasa(3);
        proxyRestaurant.rezervaMasa(5);
    }
}
