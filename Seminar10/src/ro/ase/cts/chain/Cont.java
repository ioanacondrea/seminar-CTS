package ro.ase.cts.chain;

public abstract class Cont {
	private Cont next;
	private double sold;
	private String IBAN;
	
	public Cont(double sold, String iBAN) {
		super();
		this.next = null;
		this.sold = sold;
		IBAN = iBAN;
	}

	public Cont getNext() {
		return next;
	}

	public void setNext(Cont next) {
		this.next = next;
	}

	public double getSold() {
		return sold;
	}

	public void setSold(double sold) {
		this.sold = sold;
	}
	
	public abstract void plateste(double suma);
}
