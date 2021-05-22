package cts.ase.junit.test;

import cts.ase.junit.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTests {

    @Test
    public void testConstructorCuParametru(){
        String nume= "Ioana";
        Student student = new Student(nume);
        assertEquals(nume, student.getNume());
    }

    @Test
    public void testConstructorFaraParametrii(){
        Student student = new Student();
        assertNotNull("Numele este null", student.getNume());
        assertNotNull("Lista nu este initializata", student.getNote());
    }

    @Test
    public void testAdaugaNota(){
        int nota =10;
        Student student = new Student();
        student.adaugaNota(nota);
        assertEquals(nota, student.getNota(0));

    }

    @Test
    public void testDimensiuneLista(){
        Student student = new Student();
        int nota=10;
        student.adaugaNota(nota);
        assertEquals(1, student.getNote().size());
    }

    @Test
    public void testCalculMedie(){
        Student student  = new Student();
        int nota1 = 5;
        int nota2 = 10;
        float medie2 = (nota1+ nota2)/2.0f;
        student.adaugaNota(nota1);
        student.adaugaNota(nota2);
        float medie1 = student.calculeazaMedie();
        assertEquals(medie2, medie1,0.001 );
    }

    @Test
    public void testAreRestante(){
        Student student = new Student();
        int nota1= 4;
        int nota2= 9;
        student.adaugaNota(nota1);
        student.adaugaNota(nota2);
        assertTrue(student.areRestante());
    }

    @Test
    public void testNuAreRestante(){
        Student student = new Student();
        int nota1= 10;
        int nota2= 9;
        student.adaugaNota(nota1);
        student.adaugaNota(nota2);
        assertFalse(student.areRestante());
    }

    @Test
    public void testSetNume(){
        Student student = new Student();
        String nume ="Ioana";
        student.setNume(nume);
        assertEquals(nume, student.getNume());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNotAruncaExceptie(){
        Student student = new Student();
        student.getNota(-1);

    }

    public void testGetNotAruncaExceptieJU3(){
        Student student = new Student();
        try{
            student.getNota(-1);
            fail("Metoda nu arunca exceptie");
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){

        }
        catch (Exception ex){
            fail("Metoda nu arunca exceptia indexOutOfBoundsException");
        }
    }

}