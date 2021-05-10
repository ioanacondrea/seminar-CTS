package ro.ase.cts.factorymethod;

import ro.ase.cts.factorymethod.PersonalSpital;

public class Brancardier extends PersonalSpital {

    public Brancardier(String nume) {
        super(nume);
    }

    @Override
    public void descriere() {
        System.out.println(this.toString());
    }
}
