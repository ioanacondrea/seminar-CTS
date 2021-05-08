package ro.ase.cts.chain;

public class Main {

	public static void main(String[] args) {
		Cont contCurent = new ContCurent(1000, "RO34343");
		Cont contEconomii = new ContEconomii(2000, "RO76876");
		Cont contCredit = new ContCredit(1000, "RO513754");
		
		contCurent.setNext(contEconomii);
		contEconomii.setNext(contCredit);
		contCurent.plateste(400);
		contCurent.plateste(800);
		contCurent.plateste(1000);
		contCurent.plateste(1000);
	}

}
