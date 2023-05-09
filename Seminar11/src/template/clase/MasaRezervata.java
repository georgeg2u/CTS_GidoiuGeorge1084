package template.clase;

public class MasaRezervata  extends MasaRestaurant{
    String oraRezervare;

    public MasaRezervata(int numarMasa, String oraRezervare) {
        super(numarMasa);
        this.oraRezervare = oraRezervare;
    }

    @Override
    protected void curataMasa() {
        System.out.println("Chelnerul curata masa " + getNumarMasa() + " pentru rezervarea de la ora " + oraRezervare);
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Chelnerul aseaza servetele pe masa " +getNumarMasa() + " pentru rezervarea de la ora " + oraRezervare );
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Chelnerul aseaza tacamurile pe masa " +getNumarMasa() + " pentru rezervarea de la ora " + oraRezervare);

    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Atunci cand ajung la restaurant cei care au rezervat masa " + getNumarMasa() + " pentru ora " + oraRezervare + ", chelnerul ii invita la masa " );
    }
}
