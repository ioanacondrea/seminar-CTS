package ro.ase.cts.facade;

public class BirouCredite {
	public boolean areCredite(Persoana persoana) {
		return Integer.parseInt(""+ persoana.getCnp().charAt(11)) %2 ==0;
	}
}
