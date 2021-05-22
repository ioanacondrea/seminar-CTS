package ro.ase.cts.restaurant.factorymethod;

public class SupaCiuperci extends Supa{
    public SupaCiuperci(String denumireSupa, int pret) {
        super(denumireSupa, pret);
    }

    @Override
    public String toString() {
        return "SupaCiuperci{" + super.toString() +"}";
    }
}
