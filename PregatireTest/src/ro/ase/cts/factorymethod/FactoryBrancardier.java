package ro.ase.cts.factorymethod;

import ro.ase.cts.factorymethod.PersonalSpital;

public class FactoryBrancardier implements FactoryAbstract{

    @Override
    public PersonalSpital createInstance(String nume) {
        return new Brancardier(nume);
    }
}
