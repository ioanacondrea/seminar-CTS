package cts.prototype;

public class Bilet implements Cloner{
	private int cod;
	private String echipaA;
	private String echipaB;
	
	public Bilet(int cod, String echipaA, String echipaB) {
		super();
		this.cod = cod;
		this.echipaA = echipaA;
		this.echipaB = echipaB;
	}
	
	private Bilet() {}
	
	public void setCod (int cod) {
		this.cod= cod;
	}

	@Override
	public Cloner cloneaza() {
		Bilet bilet = new Bilet();
		bilet.cod = this.cod;
		bilet.echipaA = this.echipaA;
		bilet.echipaB =this.echipaB;
		
		return bilet;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bilet [cod=");
		builder.append(cod);
		builder.append(", echipaA=");
		builder.append(echipaA);
		builder.append(", echipaB=");
		builder.append(echipaB);
		builder.append("]");
		return builder.toString();
	}
}
