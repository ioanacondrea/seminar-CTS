package ro.ase.cts.restaurant.factorymethod;

public class SupaVita extends Supa{
    public SupaVita(String denumireSupa, int pret) {
        super(denumireSupa, pret);
    }

    @Override
    public String toString() {
        return "SupaVita{"+ super.toString() + "}";
    }
}
