package cts.seminar.classes;

public abstract class Animal implements Mers{

	private String nume;
	
	public Animal(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	
}
