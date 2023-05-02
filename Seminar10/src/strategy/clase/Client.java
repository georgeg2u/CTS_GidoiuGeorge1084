package strategy.clase;

public class Client {
    private String numeClient;
    private ModPlata modPlata;

    public Client(String numeClient) {
        this.numeClient = numeClient;
        this.modPlata =  new PlataCash();
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void realizeazaPlata(double sumaPlata) {
        modPlata.plateste(this.numeClient, sumaPlata);
    }
}
