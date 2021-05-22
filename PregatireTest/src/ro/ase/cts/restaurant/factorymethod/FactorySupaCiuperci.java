package ro.ase.cts.restaurant.factorymethod;

public class FactorySupaCiuperci implements Factory{
    @Override
    public Supa createSupa(String denumire, int pret) {
        return new SupaCiuperci(denumire, pret);
    }
}
