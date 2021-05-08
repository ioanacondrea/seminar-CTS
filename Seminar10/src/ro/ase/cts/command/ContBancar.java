package ro.ase.cts.command;

public class ContBancar {
	private String IBAN;
	private double sold;
	
	public ContBancar(String iBAN, double sold) {
		super();
		IBAN = iBAN;
		this.sold = sold;
	}
	
	public void constituire(double suma) {
		this.sold=suma;
		System.out.println("Contul are soldul: "+  this.sold);
	}
	
	public void retragere(double suma) {
		if(sold>= suma) {
			this.sold -= suma;
			System.out.println("S-a realizat o retragere");
		}else {
			System.out.println("Fonduri insuficiente");
		}
	}
	
	public void depunere(double suma) {
		this.sold+= suma;
		System.out.println("S-a realizat o depunere");
	}
}
