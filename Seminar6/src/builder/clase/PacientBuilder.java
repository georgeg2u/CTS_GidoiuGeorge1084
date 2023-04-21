package builder.clase;

public class PacientBuilder implements  Builder{
    //ex 1 din pdf
    private Pacient pacient;

    public PacientBuilder(String nume) {
        this.pacient = new Pacient();
        this.pacient.setNume(nume);
    }

    @Override
    public Pacient build() {
        return this.pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }

    public PacientBuilder setNume(String nume) {
        this.pacient.setNume(nume);
        return this;
    }

    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        this.pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
        this.pacient.setMicDejunInclus(micDejunInclus);
        return this;
    }

    public PacientBuilder setPapuciDeCamera(boolean papuciDeCamera) {
        this.pacient.setPapuciDeCamera(papuciDeCamera);
        return this;
    }
}
