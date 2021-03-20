package ro.ase.cts.singleton.lazy;

import ro.ase.cts.singleton.lazy.Vaccin;

public class Main {

	public static void main(String[] args) {
		Vaccin v1 = Vaccin.getInstanta("Pfizer", 1000, 0.02);
		Vaccin v2 = Vaccin.getInstanta("Oxford", 2000, 0.01);
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		v1.setDenumireProducator("Moderna");
		v2.setRataVaccinare(0.05);
		System.out.println(v1.toString());
		System.out.println(v2.toString());
	}

}
