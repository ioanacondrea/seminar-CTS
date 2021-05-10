package ro.ase.cts.factorymethod;

import ro.ase.cts.factorymethod.PersonalSpital;

public class Asistent extends PersonalSpital {
    public Asistent(String nume) {
        super(nume);
    }

    @Override
    public void descriere() {
        System.out.println("Asistent "+ this.toString());
    }
}
