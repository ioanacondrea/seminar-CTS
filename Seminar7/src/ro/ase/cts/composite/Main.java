package ro.ase.cts.composite;

public class Main {

	public static void main(String[] args) {
		Agentie a1 = new Agentie("a1");
		Agentie a2 = new Agentie("a2");
		Filiala f1 = new Filiala("f1");
		Filiala f2 = new Filiala("f2");
		Filiala f3 = new Filiala("f3");
		
		
		try {
			a1.adaugaSediu(f1);
			a2.adaugaSediu(f2);
			a2.adaugaSediu(f3);
			a1.adaugaSediu(a2);
			a1.descriere();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
