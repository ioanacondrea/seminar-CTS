package ro.ase.cts.singleton.lazy;


public class Vaccin {
	private String denumireProducator;
	private int dozeDisponibile;
	private double rataVaccinare;
	private static Vaccin instanta = null;
	
	private Vaccin(String denumireProducator, int dozeDisponibile, double rataVaccinare) {
		super();
		this.denumireProducator = denumireProducator;
		this.dozeDisponibile = dozeDisponibile;
		this.rataVaccinare = rataVaccinare;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vaccin [denumireProducator=");
		builder.append(denumireProducator);
		builder.append(", dozeDisponibile=");
		builder.append(dozeDisponibile);
		builder.append(", rataVaccinare=");
		builder.append(rataVaccinare);
		builder.append("]");
		return builder.toString();
	}
	
	public void setDenumireProducator(String denumireProducator) {
		this.denumireProducator = denumireProducator;
	}
	public void setDozeDisponibile(int dozeDisponibile) {
		this.dozeDisponibile = dozeDisponibile;
	}
	public void setRataVaccinare(double rataVaccinare) {
		this.rataVaccinare = rataVaccinare;
	} 
	
	
	public static synchronized Vaccin getInstanta(String denumire, int doze, double rata) {
		if(instanta == null) {
			instanta = new Vaccin(denumire, doze, rata);
		}
		return instanta;
	}
}
