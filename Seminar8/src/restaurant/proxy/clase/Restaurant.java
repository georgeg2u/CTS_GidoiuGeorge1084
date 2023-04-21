package restaurant.proxy.clase;

public class Restaurant implements IRestaurant{
    private String denumire;

    public Restaurant(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void rezervaMasa(int numarPersoane) {
        System.out.println("Masa a fost rezervata pentru " + numarPersoane + " la restaurantul " + this.denumire);
    }
}
