package chain.clase;

public class Client {
    private String nume;
    private String adresaMail;
    private String numarTelefon;

    public Client(String nume, String adresaMail, String numarTelefon) {
        this.nume = nume;
        this.adresaMail = adresaMail;
        this.numarTelefon = numarTelefon;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresaMail() {
        return adresaMail;
    }

    public void setAdresaMail(String adresaMail) {
        this.adresaMail = adresaMail;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }
}
