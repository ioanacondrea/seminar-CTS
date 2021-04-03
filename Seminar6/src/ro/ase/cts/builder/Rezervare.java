package ro.ase.cts.builder;

public class Rezervare {
	private int cod;
	private boolean areMancareInclusa;
	private boolean areBauturaInlcusa;
	private boolean areScaunErgonomic;
	private boolean areMuzica;
	private String genMuzica;
	
	
	
	public void setCod(int cod) {
		this.cod = cod;
	}



	public void setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
	}



	public void setAreBauturaInlcusa(boolean areBauturaInlcusa) {
		this.areBauturaInlcusa = areBauturaInlcusa;
	}



	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}



	public void setAreMuzica(boolean areMuzica) {
		this.areMuzica = areMuzica;
	}



	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [cod=");
		builder.append(cod);
		builder.append(", areMancareInclusa=");
		builder.append(areMancareInclusa);
		builder.append(", areBauturaInlcusa=");
		builder.append(areBauturaInlcusa);
		builder.append(", areScaunErgonomic=");
		builder.append(areScaunErgonomic);
		builder.append(", areMuzica=");
		builder.append(areMuzica);
		builder.append(", genMuzica=");
		builder.append(genMuzica);
		builder.append("]");
		return builder.toString();
	}



	public Rezervare(int cod, boolean areMancareInclusa, boolean areBauturaInlcusa, boolean areScaunErgonomic,
			boolean areMuzica, String genMuzica) {
		super();
		this.cod = cod;
		this.areMancareInclusa = areMancareInclusa;
		this.areBauturaInlcusa = areBauturaInlcusa;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areMuzica = areMuzica;
		this.genMuzica = genMuzica;
	}
	
	
	
}
