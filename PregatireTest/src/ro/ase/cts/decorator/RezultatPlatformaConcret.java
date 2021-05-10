package ro.ase.cts.decorator;

public class RezultatPlatformaConcret extends RezultatPlatforma{


    public RezultatPlatformaConcret(RezultatAbstract rezultat) {
        super(rezultat);
    }

    @Override
    public void afiseazaPePlatforma() {
        System.out.println("Pe platforma: " + super.getRezultat().toString());
    }


}
