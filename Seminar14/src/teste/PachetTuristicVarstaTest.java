package teste;

import clase.IPersoana;
import clase.PachetTuristic;
import dubluri.FakePersoana;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PachetTuristicVarstaTest {

    @Test
    public void nuPoateRezervaTanar() {
        FakePersoana persoana = new FakePersoana();
        persoana.setVarsta(16);
        PachetTuristic pachet = new PachetTuristic(persoana, "Cluj", 200.0);

        assertFalse(pachet.poateRezerva());
    }

    @Test
    public void unAdultPoateRezerva() {
        FakePersoana persoana = new FakePersoana();
        persoana.setVarsta(30);
        PachetTuristic pachet = new PachetTuristic(persoana, "Cluj", 200.0);

        assertTrue(pachet.poateRezerva());
    }

}