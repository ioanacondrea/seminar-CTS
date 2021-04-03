package ro.ase.cts.adapter;

public class Main {
	
	public static void RezervaSiVindeBiletLaClasa(Bilet bilet) {
		bilet.rezerva();
		bilet.vinde();
	}
	
	public static void RezervaSiVindeBiletOnline(BiletOnline bilet) {
		bilet.rezervaBiletOnline();
		bilet.vindeBiletOnline();
	}


	public static void main(String[] args) {
		Bilet bilet  = new Bilet(20);
		RezervaSiVindeBiletLaClasa(bilet);
		BiletAdapter bilet2 = new BiletAdapter(20);
		RezervaSiVindeBiletOnline(bilet2);
		
		BiletOnline biletOnline = new BiletOnlineAdapter(bilet);
		RezervaSiVindeBiletOnline(biletOnline);

	}

}
