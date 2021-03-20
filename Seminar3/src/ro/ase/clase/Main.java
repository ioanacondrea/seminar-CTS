package ro.ase.clase;

public class Main {
	public static void main(String[] args) {
		Receptie receptie1 =Receptie.getInstance();
		Receptie receptie2 = Receptie.getInstance();
		System.out.println(receptie1.toString());
		System.out.println(receptie2.toString());
		receptie1.setNumeReceptioner("Ioana");
		receptie2.setEtaj(1);
		System.out.println(receptie1.toString());
		System.out.println(receptie2.toString());
	}
}
