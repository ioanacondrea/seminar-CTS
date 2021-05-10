package ro.ase.cts.flyweight;

import ro.ase.cts.flyweight.Pacient;

public class Main {
    public static void main(String[] args) {
        Internare i1 = new Internare(1, 2, 2);
        Internare i2= new Internare(2, 3, 4);
        Internare i3= new Internare(4,4,4);

        FlyweightFactory factory = new FlyweightFactory();
        Pacient p = factory.getPacient("45435354");
        p.afiseazaInternare(i1);
        Pacient p2 = factory.getPacient("3242324");
        p2.afiseazaInternare(i2);
        p2.setNume("Ioana");
        factory.getPacient("3242324").afiseazaInternare(i3);

    }
}
