package ro.ase.cts.decorator;

public class DecoratorPlataTelefon extends DecoratorAbstract {

	public DecoratorPlataTelefon(Card card) {
		super(card);
	}

	@Override
	public void platesteContactless(int suma) {
		if(super.getCard().getSold()>suma) {
			System.out.println("A platit contactless prin telefon: " + suma);
			super.getCard().setSold(super.getCard().getSold()-suma);
			System.out.println("Soldul ramas: "+ super.getCard().getSold());
		}
		
	}

}
