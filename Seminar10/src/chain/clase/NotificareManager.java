package chain.clase;

public class NotificareManager extends Notificator{
    @Override
    public void notificaClient(Client client, String mesaj) {
        System.out.println("Clientul " + client.getNume() + " nu are nici adresa de mail nici nr de telefon");
    }
}
