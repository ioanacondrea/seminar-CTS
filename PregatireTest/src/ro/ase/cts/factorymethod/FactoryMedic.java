package ro.ase.cts.factorymethod;

public class FactoryMedic implements FactoryAbstract{
    @Override
    public PersonalSpital createInstance(String nume) {
        return new Medic(nume);
    }
}
