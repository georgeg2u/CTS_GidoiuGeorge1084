package template.clase;

public class MasaLocala extends MasaRestaurant {

    public MasaLocala(int numarMasa) {
        super(numarMasa);
    }

    @Override
    protected void curataMasa() {
        System.out.println("Chelnerul curata masa " + getNumarMasa() + " pentru persoanele care asteapta afara.");
    }

    @Override
    protected void aseazaServetele() {
        System.out.println("Chelnerul aseaza servetele pe masa "+ getNumarMasa() + " pentru persoanele care asteapta afara");
    }

    @Override
    protected void aseazaTacamuri() {
        System.out.println("Chelnerul aseaza tacamurile pe masa "+ getNumarMasa() + " pentru persoanele care asteapta afara");
    }

    @Override
    protected void invitaPersoane() {
        System.out.println("Chelnerul invita persoanele la masa " + getNumarMasa());
    }
}
