package register;

public class Firma {
    private int nrAngajati;
    private String nume;

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    protected Firma(int nrAngajati, String nume) {
        this.nrAngajati = nrAngajati;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Firma{" +
                "nrAngajati=" + nrAngajati +
                ", nume='" + nume + '\'' +
                '}';
    }

    public void angajeaza(){
        nrAngajati++;
    }
}
