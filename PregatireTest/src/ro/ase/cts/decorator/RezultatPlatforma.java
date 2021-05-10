package ro.ase.cts.decorator;

public abstract class RezultatPlatforma {
    private RezultatAbstract rezultat;

    public RezultatAbstract getRezultat() {
        return rezultat;
    }

    public RezultatPlatforma(RezultatAbstract rezultat) {
        this.rezultat = rezultat;
    }
    public abstract void afiseazaPePlatforma();

    public void printezaRezultat(){
        rezultat.printeazaRezultat();
    }
}
