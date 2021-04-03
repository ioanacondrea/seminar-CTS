package ro.ase.cts.builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare = new Rezervare(1, true, true, false, true, "jazz");
		Rezervare rezervare2 = new RezervareBuilder().setCod(10).setAreBauturaInlcusa(true).build();
		Rezervare rezervare3 = new RezervareBuilder().setCod(11).setAreMancareInclusa(true).build();
		
		System.out.println(rezervare.toString());
		System.out.println(rezervare2.toString());
		System.out.println(rezervare3.toString());
		
		RezervareBuilderV2  rezBuilder = new RezervareBuilderV2();
		rezBuilder.setAreMancareInclusa(true).setAreBauturaInlcusa(true).setAreScaunErgonomic(true);
		Rezervare rez1 = rezBuilder.setCod(12).build();
		Rezervare rez2 = rezBuilder.setCod(13).build();

		System.out.println(rez1.toString());
		System.out.println(rez2.toString());
}
}
