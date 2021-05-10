package ro.ase.cts.composite;

public class Sectie implements Departament{

    private String nume;

    public Sectie(String nume) {
        super();
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println("Sectie "+ nume);
    }

    @Override
    public void adaugaDepartament(Departament departament) {

    }

    @Override
    public void stergeDepartament(Departament departament) {

    }

    @Override
    public Departament getDepartament(int index) {
        return null;
    }
}
