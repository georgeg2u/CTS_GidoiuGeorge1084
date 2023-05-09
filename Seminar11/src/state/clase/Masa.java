package state.clase;

public class Masa {
    private int numar;
    private Stare stare;

    public Masa(int numar) {
        this.numar = numar;
        this.stare = new StareLibera();
    }

    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public int getNumar() {
        return numar;
    }

    public void rezervaMasa() {
        Stare rezervata = new StareRezervata();
        rezervata.schimbaStare(this);
    }

    public void ocupaMasa() {
        Stare ocupata = new StareOcupata();
        ocupata.schimbaStare(this);
    }

    public void elibereazaMasa() {
        Stare libera = new StareLibera();
        libera.schimbaStare(this);
    }

    public void ridicaRezervare() {
        Stare ocupata = new StareOcupata();
        ocupata.schimbaStare(this);
    }


}
