package teste;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaGetVarstaTest {
    @Test
    public void getVarstaRightTest(){
        Persoana p=new Persoana("Mariana","6011111252525");
        assertEquals(21,p.getVarsta());
    }
    @Test
    public void getVarstaBoundaryNouNascutTest(){
        Persoana p=new Persoana("Mariana","6230522252525");
        assertEquals(0,p.getVarsta());
    }
    @Test
    public void getVarstaBoundaryAnul2000Test(){
        Persoana p=new Persoana("Mariana","6000101252525");
        assertEquals(23,p.getVarsta());
    }
    @Test
    public void getVarstaBoundaryAnul1900Test(){
        Persoana p=new Persoana("Mariana","1000101252525");
        assertEquals(123,p.getVarsta());
    }
    @Test
    public void getVarstaBoundaryAnul1999Test(){
        Persoana p=new Persoana("Mariana","2991231252525");
        assertEquals(23,p.getVarsta());
    }

    @Test(expected = MyExc.class)
    public void getVarstaException(){
        Persoana p=new Persoana("Mariana","6230607252525");
        p.getVarsta();
    }
    @Test(timeout = 100)
    public void getVarstaTime(){
        Persoana p=new Persoana("Mariana","6230302252525");
        p.getVarsta();
    }
}