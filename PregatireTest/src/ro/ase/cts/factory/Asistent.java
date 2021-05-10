package ro.ase.cts.factory;

public class Asistent extends PersonalSpital{
    public Asistent(String nume, int cod) {
        super(nume, cod);
    }

    @Override
    public void descriere() {
        System.out.println("Asistent " + this.toString());
    }
}
