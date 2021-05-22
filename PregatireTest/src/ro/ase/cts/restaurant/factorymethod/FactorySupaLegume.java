package ro.ase.cts.restaurant.factorymethod;

public class FactorySupaLegume implements Factory{
    @Override
    public Supa createSupa(String denumire, int pret) {
        return new SupaLegume(denumire, pret);
    }
}
