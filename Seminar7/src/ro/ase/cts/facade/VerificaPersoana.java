package ro.ase.cts.facade;

public class VerificaPersoana {
	public static boolean verificaPersoana(Persoana persoana) {
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmatorit(persoana)) {
				BirouCredite birouCredite = new BirouCredite();
				if(!birouCredite.areCredite(persoana)) {
					return true;
				}
			}else return false;
		}
		return false;
	}
}
