package observer.clase;

public class ClientRestaurant implements Observer{
    private String nume;

    public ClientRestaurant(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println(this.nume + " ai primit un mesaj: " + mesaj);
    }
}
