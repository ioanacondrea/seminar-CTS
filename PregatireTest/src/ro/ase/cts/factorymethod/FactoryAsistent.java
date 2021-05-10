package ro.ase.cts.factorymethod;

public class FactoryAsistent implements FactoryAbstract{
    @Override
    public PersonalSpital createInstance(String nume) {
        return new Asistent(nume);
    }
}
