package ro.ase.cts.factory;

public class Brancardier extends PersonalSpital{

    public Brancardier(String nume, int cod) {
        super(nume, cod);
    }

    @Override
    public void descriere() {
        System.out.println("Brancardier" + this.toString());
    }
}
