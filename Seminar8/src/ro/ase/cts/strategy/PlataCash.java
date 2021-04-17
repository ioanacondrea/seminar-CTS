package ro.ase.cts.strategy;

public class PlataCash implements ModPlata{

	@Override
	public void realizeazaPlata(int suma) {
		System.out.println("Ai platit cash "+ suma);
		
	}

}
