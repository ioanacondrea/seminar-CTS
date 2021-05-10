package ro.ase.cts.factorymethod;

import ro.ase.cts.factorymethod.PersonalSpital;

public interface FactoryAbstract {
    public PersonalSpital createInstance(String nume);
}
