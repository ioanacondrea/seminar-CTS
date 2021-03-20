package ro.ase.lazy;

public class Receptie {
	private String numeReceptioner;
	private int etaj;
	private String numeHotel;
	private static Receptie instanta = null;
	

	private Receptie(String numeReceptioner, int etaj, String numeHotel) {
		super();
		this.numeReceptioner = numeReceptioner;
		this.etaj = etaj;
		this.numeHotel = numeHotel;
	}
	
	public void setNumeReceptioner(String numeReceptioner) {
		this.numeReceptioner = numeReceptioner;
	}
	public void setEtaj(int etaj) {
		this.etaj = etaj;
	}
	public void setNumeHotel(String numeHotel) {
		this.numeHotel = numeHotel;
	}
	
	public static synchronized Receptie getInstance(String numeReceptioner, int etaj, String numeHotel){
		if(instanta == null) {
			instanta = new Receptie(numeReceptioner, etaj, numeHotel);
		}
		return instanta;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Receptie [numeReceptioner=");
		builder.append(numeReceptioner);
		builder.append(", etaj=");
		builder.append(etaj);
		builder.append(", numeHotel=");
		builder.append(numeHotel);
		builder.append("]");
		return builder.toString();
	}
	
}
