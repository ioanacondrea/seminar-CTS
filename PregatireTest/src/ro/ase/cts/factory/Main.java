package ro.ase.cts.factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        try {
            PersonalSpital medic = factory.createInstance(TipPersonal.Medic, "Ioana C", 120);
            PersonalSpital asistent = factory.createInstance(TipPersonal.Asistent, "Mariana S", 1323);
            medic.descriere();
            asistent.descriere();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
