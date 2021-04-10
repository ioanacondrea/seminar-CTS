package ro.ase.cts.facade.program;

import ro.ase.cts.facade.BirouCredite;
import ro.ase.cts.facade.Persoana;
import ro.ase.cts.facade.Politie;
import ro.ase.cts.facade.VerificaPersoana;

public class Main {

	public static void main(String[] args) {
		Persoana persoana = new Persoana("Ioana", "1983323123435");
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmatorit(persoana)) {
				BirouCredite birouCredite = new BirouCredite();
				if(!birouCredite.areCredite(persoana)) {
					System.out.println("S-a creat contul");
				}
			}
		}
		Persoana persoana2 = new Persoana("Ioana", "1983323123411");
		if(VerificaPersoana.verificaPersoana(persoana2)) {
			System.out.println("Cont creat!");
		}
		else {
			System.out.println("Nu se poate crea cont!");
		}
	}

}
