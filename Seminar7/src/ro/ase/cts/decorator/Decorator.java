package ro.ase.cts.decorator;

public class Decorator extends DecoratorAbstract{
	
	
	public Decorator(Card card) {
		super(card);
	}

	@Override
	public void platesteContactless(int suma) {
		if(super.getCard().getSold()>suma) {
			System.out.println("A platit contactless: " + suma);
			super.getCard().setSold(super.getCard().getSold()-suma);
			System.out.println("Soldul ramas: "+ super.getCard().getSold());
		}
		
	}
	
}

