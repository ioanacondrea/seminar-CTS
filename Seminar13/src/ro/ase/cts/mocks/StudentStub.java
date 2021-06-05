package ro.ase.cts.mocks;

import ro.ase.cts.clase.IStudent;

import java.util.ArrayList;
import java.util.List;

public class StudentStub implements IStudent {
    @Override
    public String getNume() {
        return "Ioana";
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return new ArrayList<>(){{add(8);}};
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return 8;
    }

    @Override
    public int getNota(int index) {
        return 8;
    }

    @Override
    public boolean areRestante() {
        return false;
    }
}
