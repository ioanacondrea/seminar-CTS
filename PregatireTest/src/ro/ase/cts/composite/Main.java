package ro.ase.cts.composite;

public class Main {
    public static void main(String[] args) {
        Subdepartament s1 = new Subdepartament("S1");
        Subdepartament s2 = new Subdepartament("s2");
        Subdepartament s3 = new Subdepartament("s3");

        Sectie se1 = new Sectie("se1");
        Sectie se2 = new Sectie("se2");
        s1.adaugaDepartament(se1);
        s2.adaugaDepartament(se2);
        s1.descriere();
        s1.stergeDepartament(se1);
        s1.descriere();
    }
}
