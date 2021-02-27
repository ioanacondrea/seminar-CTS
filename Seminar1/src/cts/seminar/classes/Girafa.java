package cts.seminar.classes;

public class Girafa extends Animal{

	private int inaltime;
	
	public Girafa(String nume) {
		super(nume);
		this.inaltime = 400;
	}

	
	
	public Girafa(String nume, int inaltime) {
		super(nume);
		this.inaltime = inaltime;
	}



	public int getInaltime() {
		return inaltime;
	}

	public void setInaltime(int inaltime) {
		this.inaltime = inaltime;
	}
	

}
