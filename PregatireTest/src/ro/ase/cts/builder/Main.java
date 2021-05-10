package ro.ase.cts.builder;

public class Main {
    public static void main(String[] args) {
        Internare i1= new BuilderInternare().setNumePacient("Ioana").setHalatInterior(true).build();

    }
}
