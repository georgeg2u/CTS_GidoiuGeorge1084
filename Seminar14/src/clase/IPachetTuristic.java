package clase;

public interface IPachetTuristic {
    Double getPret();
    IPersoana getClient();
    String getDestinatie();
    boolean poateRezerva();
    void aplicaDiscountVarstnici(int procent);
    void setClient(IPersoana client);
    void setDestinatie(String destinatie);
    void setPret(Double pret);

}
