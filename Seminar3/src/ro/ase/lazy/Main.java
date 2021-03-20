package ro.ase.lazy;

import ro.ase.lazy.Receptie;

public class Main {

	public static void main(String[] args) {
		Receptie receptie1 =Receptie.getInstance("Ioana", 1, "Hilton");
		Receptie receptie2 = Receptie.getInstance("Daniel", 2, "Hilton");
		System.out.println(receptie1.toString());
		System.out.println(receptie2.toString());
		receptie1.setNumeReceptioner("Maria");
		receptie2.setEtaj(4);
		System.out.println(receptie1.toString());
		System.out.println(receptie2.toString());

	}

}
