package ro.ase.cts.restaurant.factorymethod;

public class FactorySupaVita implements Factory{
    @Override
    public Supa createSupa(String denumire, int pret) {
        return new SupaVita(denumire, pret);
    }
}
