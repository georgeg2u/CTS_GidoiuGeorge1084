package facade.main;

import facade.clase.MeseRestaurant;
import facade.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant=new Restaurant();
        System.out.println(restaurant.verificareMasa(1));
        System.out.println(restaurant.verificareMasa(2));
        System.out.println(restaurant.verificareMasa(3));
        System.out.println(restaurant.verificareMasa(4));
    }
}