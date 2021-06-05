package ro.ase.cts.teste;

import org.junit.Test;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.mocks.StudentDummy;
import ro.ase.cts.mocks.StudentFake;
import ro.ase.cts.mocks.StudentStub;

import static org.junit.Assert.*;

public class TestGrupaMocks {
    @Test
    public void testAdaugaStudent(){
        StudentDummy studentDummy = new StudentDummy();
        Grupa grupa = new Grupa(1078);
        grupa.adaugaStudent(studentDummy);
        assertEquals(1, grupa.getStudenti().size());
    }

    @Test
    public void testGetPromovabilitate(){
        StudentStub student= new StudentStub();
        Grupa grupa = new Grupa(1078);
        grupa.adaugaStudent(student);
        assertEquals(0, grupa.getPromovabilitate(), 0.01);
    }

    @Test
    public void testGrupaCuFakeRight(){
        Grupa grupa = new Grupa(1078);
        for(int i =0;i<7;i++){
            StudentFake stud = new StudentFake();
            stud.setValoareAreRestante(false);
            grupa.adaugaStudent(stud);

        }
        for(int i =0;i<3;i++){
            StudentFake stud = new StudentFake();
            stud.setValoareAreRestante(true);
            grupa.adaugaStudent(stud);

        }
        assertEquals(0.7, grupa.getPromovabilitate(), 0.01);
    }
}