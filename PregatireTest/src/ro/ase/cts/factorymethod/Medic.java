package ro.ase.cts.factorymethod;

import ro.ase.cts.factorymethod.PersonalSpital;

public class Medic extends PersonalSpital {

    public Medic(String nume) {
        super(nume);
    }

    @Override
    public void descriere() {
        System.out.println("Medic "+ this.toString());
    }
}
