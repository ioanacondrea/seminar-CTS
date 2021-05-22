package ro.ase.cts.restaurant.factorymethod;

public class SupaLegume extends  Supa{

    public SupaLegume(String denumireSupa, int pret) {
        super(denumireSupa, pret);
    }

    @Override
    public String toString() {
        return "SupaLegume{" + super.toString() +"}";
    }
}
