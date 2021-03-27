package cts.factory.method;

public class Main {

	public static void afiseazaJucator(Factory factory, String numeJucator) {
		Jucator jucator = factory.getJucator(numeJucator);
		System.out.println(jucator.toString());
	}
	
	public static void main(String[] args) {
		afiseazaJucator(new FactoryPortar(), "Mihai");
		afiseazaJucator(new FactoryFundas(), "Dorel");
		afiseazaJucator(new FactoryMijlocas(), "Ion");
	}

}
