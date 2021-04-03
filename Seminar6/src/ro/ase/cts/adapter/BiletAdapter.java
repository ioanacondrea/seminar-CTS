package ro.ase.cts.adapter;

public class BiletAdapter  extends Bilet implements BiletOnline{

	public BiletAdapter(double pret) {
		super(pret);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void vindeBiletOnline() {
		this.vinde();
	}

	@Override
	public void rezervaBiletOnline() {
		this.rezerva();
		
	}

	
}
