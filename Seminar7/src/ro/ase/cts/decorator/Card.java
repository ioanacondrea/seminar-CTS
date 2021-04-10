package ro.ase.cts.decorator;

public class Card implements CardAbstract {
	private String titular;
	private int sold;

	public Card(String titular, int sold) {
		super();
		this.titular = titular;
		this.sold = sold;
	}

	public String getTitular() {
		return titular;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	@Override
	public void platesteOnline(int suma) {
		if (sold >= suma) {
			System.out.println("A platit online " + suma);
			sold -= suma;
		}

	}

	@Override
	public void platesteNormal(int suma) {
		if (sold >= suma) {
			System.out.println("A platit normal " + suma);
			sold -= suma;
		}

	}

}
