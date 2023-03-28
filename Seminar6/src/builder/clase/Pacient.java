package builder.clase;

public class Pacient {
    private String nume;
    private Boolean patRabatabil;
    private Boolean micDejunInclus;
    private Boolean papuciDeCamera;

    public Pacient() {
        this.nume = "Anonim";
        this.patRabatabil = false;
        this.micDejunInclus = false;
        this.papuciDeCamera = false;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    protected void setPatRabatabil(Boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    protected void setMicDejunInclus(Boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }

    protected void setPapuciDeCamera(Boolean papuciDeCamera) {
        this.papuciDeCamera = papuciDeCamera;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", patRabatabil=" + patRabatabil +
                ", micDejunInclus=" + micDejunInclus +
                ", papuciDeCamera=" + papuciDeCamera +
                '}';
    }
}
