package ro.ase.cts.builder;

public class RezervareBuilder implements RezervareAbstractBuilder {

	private Rezervare rezervare;

	public RezervareBuilder() {
		super();
		this.rezervare = new Rezervare(0, false, false, false, false, "N/A");

	}
	
	public RezervareBuilder(int cod) {
		rezervare = new Rezervare(0, false, false, false, false, "N/A");
		rezervare.setCod(cod);
	}

	public RezervareBuilder setCod(int cod) {
		this.rezervare.setCod(cod);
		return this;
	}

	public RezervareBuilder setAreMancareInclusa(boolean areMancareInclusa) {
		this.rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}

	public RezervareBuilder setAreBauturaInlcusa(boolean areBauturaInlcusa) {
		this.rezervare.setAreBauturaInlcusa(areBauturaInlcusa);
		return this;
	}

	public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}

	public RezervareBuilder setAreMuzica(boolean areMuzica) {
		this.rezervare.setAreMuzica(areMuzica);
		return this;
	}

	public RezervareBuilder setGenMuzica(String genMuzica) {
		this.rezervare.setGenMuzica(genMuzica);
		return this;
	}
	
	

	@Override
	public Rezervare build() {

		return this.rezervare;
	}

}
