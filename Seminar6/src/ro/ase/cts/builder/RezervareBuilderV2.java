package ro.ase.cts.builder;

public class RezervareBuilderV2 implements RezervareAbstractBuilder{
	private int cod;
	private boolean areMancareInclusa;
	private boolean areBauturaInlcusa;
	private boolean areScaunErgonomic;
	private boolean areMuzica;
	private String genMuzica;
	
	
	
	public RezervareBuilderV2 setCod(int cod) {
		this.cod = cod;
		return this;
	}

	public RezervareBuilderV2 setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}

	public RezervareBuilderV2 setAreBauturaInlcusa(boolean areBauturaInlcusa) {
		this.areBauturaInlcusa = areBauturaInlcusa;
		return this;
	}

	public RezervareBuilderV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}

	public RezervareBuilderV2 setAreMuzica(boolean areMuzica) {
		this.areMuzica = areMuzica;
		return this;
	}

	public RezervareBuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}

	public RezervareBuilderV2() {
		this.areMancareInclusa = false;
		this.areBauturaInlcusa=false;
		this.areScaunErgonomic= false;
		this.areMuzica= false;
		this.genMuzica="";
	}
	
	@Override
	public Rezervare build() {
		return new Rezervare(cod, areMancareInclusa, areBauturaInlcusa, areScaunErgonomic, areMuzica, genMuzica);
	}
	
}
