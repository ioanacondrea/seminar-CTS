package ro.ase.cts.factorymethod;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic = new FactoryMedic().createInstance("Ioana");
        PersonalSpital asistent = new FactoryAsistent().createInstance("Cristina");

        medic.descriere();
        asistent.descriere();
    }
}
