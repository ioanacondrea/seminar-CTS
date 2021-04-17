package ro.ase.cts.strategy;

public class PlataCard implements ModPlata{

	@Override
	public void realizeazaPlata(int suma) {
		System.out.println("Ai platit cu cardul "+ suma);
		
	}
	
	
}
