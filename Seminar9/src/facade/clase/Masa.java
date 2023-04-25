package facade.clase;

public class Masa {
    private boolean masaLibera;
    private boolean areServetele;
    private int nrMasa;

    public Masa(boolean masaLibera, boolean areServetele, int nrMasa) {
        this.masaLibera = masaLibera;
        this.areServetele = areServetele;
        this.nrMasa = nrMasa;
    }

    public boolean isMasaLibera() {
        return masaLibera;
    }

    public void setMasaLibera(boolean masaLibera) {
        this.masaLibera = masaLibera;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public boolean areServetele() {
        return areServetele;
    }

    public void setAreServetele(boolean areServetele) {
        this.areServetele = areServetele;
    }
}
