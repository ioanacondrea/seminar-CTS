package ro.ase.cts.factory;

public class Medic extends PersonalSpital{
    public Medic(String nume, int cod) {
        super(nume, cod);
    }

    @Override
    public void descriere() {
        System.out.println("Medic " +this.toString() );
    }
}
