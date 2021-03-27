package cts.factory.main;

import cts.factory.Factory;
import cts.factory.Jucator;
import cts.factory.TipJucator;

public class Main {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Jucator portar = factory.getJucator(TipJucator.Portar, "Dorel");
		Jucator fundas = factory.getJucator(TipJucator.Fundas, "Ionel");

		System.out.println(portar.toString());
		System.out.println(fundas.toString());
	}

}
