package ro.ase.cts.strategy;

public class Main {

	public static void main(String[] args) {
		Client client = new Client("Ioana", new PlataCard());
		client.platesteNota(200);
		client.setModPlata(new PlataCash());
		client.platesteNota(20);
	}

}
