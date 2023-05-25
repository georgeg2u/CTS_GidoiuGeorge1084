package teste;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaGetSexTest {
    @Test
    public void testGetRightSexMasculin(){
        Persoana p=new Persoana("Tibi","50101010101");
        assertEquals("M",p.getSex());
    }
    @Test
    public void testGetRightSexFeminin(){
        Persoana p2=new Persoana("Mariuta","6020202445566");
        assertEquals("F",p2.getSex());
    }
    @Test
    public void testGetBoundarySexMasculin(){
        Persoana p=new Persoana("Marius","1990202445566");
        assertEquals("M",p.getSex());
    }
    @Test
    public void testGetCrossCheckSexMasculin(){
        Persoana p=new Persoana("Tibi","60101010101");
        assertEquals(verificaParitate(p.CNP),p.getSex());
    }
    public String verificaParitate(String CNP){
        int n=Integer.parseInt(CNP.charAt(0)+"");
        if(n%2!=0){
            return "M";
        }
        return "F";
    }

    @Test(expected = MyExc.class)
    public void testGetSexError(){
        Persoana p=new Persoana("Tibi","9010222445588");
        p.getSex();
    }
    @Test(timeout = 100)
    public void testGetSexPerformance(){
        Persoana p=new Persoana("Tibi","5010222445588");
        p.getSex();
    }
}