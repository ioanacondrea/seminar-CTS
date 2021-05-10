package ro.ase.cts.decorator;

public class Main {
    public static void main(String[] args) {
        Rezultat r1= new Rezultat("VSH", 13);
        r1.printeazaRezultat();
        RezultatPlatforma rezultatPlatforma = new RezultatPlatformaConcret(r1);
        rezultatPlatforma.afiseazaPePlatforma();
    }
}
