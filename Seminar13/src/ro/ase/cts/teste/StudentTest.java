package ro.ase.cts.teste;

import org.junit.Test;
import ro.ase.cts.clase.Grupa;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testConstructorRight(){
        Grupa grupa= new Grupa(1078);
        assertEquals(1078, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimitaInferioara(){
        Grupa grupa = new Grupa(1000);
        assertEquals(1000, grupa.getNrGrupa());
    }

    @Test
    public void testConstructorLimitaSuperioara(){
        Grupa grupa = new Grupa(1100);
        assertEquals(1100, grupa.getNrGrupa());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstuctorSubLimita(){
        Grupa grupa = new Grupa(999);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorPesteLimita(){
        Grupa grupa = new Grupa(1101);
    }
}