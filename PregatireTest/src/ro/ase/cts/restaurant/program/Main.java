package ro.ase.cts.restaurant.program;

import ro.ase.cts.restaurant.factorymethod.Factory;
import ro.ase.cts.restaurant.factorymethod.FactorySupaLegume;
import ro.ase.cts.restaurant.factorymethod.Supa;
import ro.ase.cts.restaurant.factorymethod.SupaLegume;

public class Main {
    public static void main(String[] args) {
        Supa supaLegume = new FactorySupaLegume().createSupa("supa legume buna", 10);
        System.out.println(supaLegume.toString());
    }
}
