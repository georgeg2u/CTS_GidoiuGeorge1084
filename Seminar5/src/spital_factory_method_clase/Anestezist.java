package spital_factory_method_clase;

public class Anestezist implements PersonalSpital {
    private String nume;

    public Anestezist(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Anestezistul: " + this.nume);
    }
}
