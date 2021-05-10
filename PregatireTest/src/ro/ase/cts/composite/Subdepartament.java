package ro.ase.cts.composite;

import java.util.ArrayList;
import java.util.List;

public class Subdepartament implements Departament{
    private String nume;
    private List<Departament> departamente;

    public Subdepartament(String nume) {
        this.nume = nume;
        this.departamente = new ArrayList<Departament>();
    }

    @Override
    public void descriere() {
        for(int i =0; i<departamente.size();i++){
            departamente.get(i).descriere();
        }
    }

    @Override
    public void adaugaDepartament(Departament departament) {
        departamente.add(departament);
    }

    @Override
    public void stergeDepartament(Departament departament) {
        departamente.remove(departament);
    }

    @Override
    public Departament getDepartament(int index) {
        return departamente.get(index);
    }
}
