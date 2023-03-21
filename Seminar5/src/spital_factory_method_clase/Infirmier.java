package spital_factory_method_clase;

public class Infirmier implements PersonalSpital{
    private String nume;
    private int aniVechime;

    public Infirmier(String nume) {
        this.nume = nume;
    }

    public Infirmier(String nume, int anVechime) {
        this.nume = nume;
        this.aniVechime = anVechime;
    }

    public void setAniVechime(int aniVechime) {
        this.aniVechime = aniVechime;
    }

    @Override
    public void descriere() {
        System.out.println("Infirmierul " + this.nume + " are " + this.aniVechime + " ani vechime");
    }
}
