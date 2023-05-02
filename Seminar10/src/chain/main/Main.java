package chain.main;

import chain.clase.*;

public class Main {
    public static void main(String[] args) {

        Notificator notificatorTelefon = new NotificareTelefon();
        Notificator notificatorMail = new NotificareMail();
        Notificator notificatorManager = new NotificareManager();

        notificatorMail.setSuccesor(notificatorTelefon);
        notificatorTelefon.setSuccesor(notificatorManager);

//        notificatorTelefon.setSuccesor(notificatorMail);
//        notificatorMail.setSuccesor(notificatorManager);

        Client client1 = new Client("Ana", "mailana@gmail.com", "0723232323");
        Client client2 = new Client("Maria", "mailMaria@gmail.com", null);
        Client client3 = new Client("Ion",null, "071238123");
        Client client4 = new Client("Vlad", null, null);

        notificatorMail.notificaClient(client1, "mesaj");
        notificatorMail.notificaClient(client2, "mesaj");
        notificatorMail.notificaClient(client3, "mesaj");
        notificatorMail.notificaClient(client4, "mesaj");

    }
}
