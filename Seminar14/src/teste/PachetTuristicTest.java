package teste;

import clase.IPersoana;
import clase.PachetTuristic;
import dubluri.StubPersoana;
import dubluri.StubPersoanaVarstnica;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PachetTuristicTest {


    @Test
    void aplicaDiscountVarstnici() {
        IPersoana persoana = new StubPersoana();
        PachetTuristic pachet = new PachetTuristic(persoana, "Bucuresti", 10.0);

        pachet.aplicaDiscountVarstnici(20);
        assertEquals(10.0, pachet.getPret());
    }

    @Test void checkIfAplicaDiscountWorksForAged() {
        IPersoana persoana = new StubPersoanaVarstnica();
        PachetTuristic pachet = new PachetTuristic(persoana, "Bucuresti", 10.0);
        pachet.aplicaDiscountVarstnici(20);
        assertEquals(8, pachet.getPret());
    }



}