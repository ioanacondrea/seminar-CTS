package ro.ase.cts.decorator;

public class Main {

	public static void main(String[] args) {
		Card card = new Card("Ioana", 1000);
		card.platesteNormal(100);
		card.platesteOnline(100);
		Decorator decorator = new Decorator(card);
		decorator.platesteContactless(200);
		DecoratorPlataTelefon decoratorTelefon = new DecoratorPlataTelefon(card);
		decoratorTelefon.platesteContactless(200);
	}

}
