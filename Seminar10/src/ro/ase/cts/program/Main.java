package ro.ase.cts.program;

import ro.ase.cts.command.ComandaConstituire;
import ro.ase.cts.command.ComandaDepunere;
import ro.ase.cts.command.ComandaRetragere;
import ro.ase.cts.command.ContBancar;
import ro.ase.cts.command.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		
		try {
			ManagerComenzi manager =new ManagerComenzi();
			ContBancar cont = new ContBancar("RO545453", 0);
			manager.invoca(new ComandaConstituire(cont, 1000));
			manager.invoca(new ComandaDepunere(cont, 500));
			manager.executaComanda();
			manager.invoca(new ComandaRetragere(cont, 900));
			manager.invoca(new ComandaRetragere(cont, 700));
			manager.executaComenzi();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
