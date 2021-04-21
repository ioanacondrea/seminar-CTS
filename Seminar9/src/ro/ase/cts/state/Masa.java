package ro.ase.cts.state;

public class Masa {
	private State stare;
	private int nrMasa;
	
	public Masa(int nrMasa) {
		super();
		this.stare = new Libera();
		this.nrMasa = nrMasa;
	}
	
	public void rezervaMasa() {
		if(this.stare instanceof Libera) {
			System.out.println("Masa " + nrMasa + " a fost rezervata.");
			this.stare = new Rezervata();
		}else {
			System.out.println("Masa nu poate fi rezervata.");
		}
	}
	
	public void ocupaMasaFaraRezervare() {
		if(this.stare instanceof Libera) {
			System.out.println("Masa cu numarul " + nrMasa + " a fost ocupata.");
			this.stare = new Ocupata();
		}else {
			System.out.println("Masa nu poate ocupata.");
		}
	}
	
	public void ridicaRezervare() {
		if(this.stare instanceof Rezervata) {
			System.out.println("Masa ocupata");
			this.stare = new Ocupata();
		}else {
			System.out.println("Masa nu poate fi ocupata");
		}
	}
	
	public void elibereazaMasa() {
		if(!(this.stare instanceof Libera)) {
			System.out.println("Masa este eliberata");
			this.stare = new Libera();
		}
	}
}
