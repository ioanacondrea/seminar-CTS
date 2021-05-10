package ro.ase.cts.factorymethod;

public abstract class PersonalSpital {
    private String nume;

    public PersonalSpital(String nume) {
        this.nume = nume;
    }

    public abstract void descriere();
}
