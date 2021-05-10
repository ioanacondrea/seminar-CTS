package ro.ase.cts.factory;

public abstract class PersonalSpital {
    private String nume;
    private int cod;

    public PersonalSpital(String nume, int cod) {
        this.nume = nume;
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "PersonalSpital{" +
                "nume='" + nume + '\'' +
                ", cod=" + cod +
                '}';
    }

    public abstract void descriere();
}
