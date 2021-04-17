package ro.ase.cts.program;

import ro.ase.cts.proxy.OperatorRezervari;
import ro.ase.cts.proxy.ProxyOperatorRezervari;

public class Main {

	public static void main(String[] args) {
		OperatorRezervari operator = new OperatorRezervari();
		operator.realizeazaRezervare("Ioana", 1);
		ProxyOperatorRezervari proxy = new ProxyOperatorRezervari(operator, 4);
		proxy.realizeazaRezervare("Ioana", 3);
	}

}
