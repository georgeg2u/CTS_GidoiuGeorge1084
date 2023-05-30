package clase;

import dubluri.FakePachetTuristic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgentieTurismTest {

    @Test
    public void calculareSumaTotalaPacheteTest() {
        AgentieTurism agentie = new AgentieTurism();
        IPachetTuristic pachet1 = new FakePachetTuristic();
        IPachetTuristic pachet2 = new FakePachetTuristic();
        IPachetTuristic pachet3 = new FakePachetTuristic();
        pachet1.setPret(200.0);
        pachet2.setPret(300.0);
        pachet3.setPret(400.0);

        agentie.adaugaPachet(pachet1);
        agentie.adaugaPachet(pachet2);
        agentie.adaugaPachet(pachet3);

        assertEquals(900.0, agentie.calculareSumaTotalaPachete());

    }

}