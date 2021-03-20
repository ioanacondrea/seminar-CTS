package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	private static int sumaFinantata= 20;
	
	
	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getAn_studii() {
		return anStudii;
	}
	public void setAn_studii(int an_studii) {
		this.anStudii = an_studii;
	}


	public Student() {
		super();
		
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, String facultate, int anStudii) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiect);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("Student: ");
		stringBuilder.append(super.toString()).append("Facultate=").append(this.facultate).append("An studii=").append(this.anStudii);
		return stringBuilder.toString();
	}
	
	
	@Override
	public void afisareSumaFinantata() {
		
		System.out.println(super.compunereStringPentruSumaFinantata(this.sumaFinantata, "Studentul"));
		
	}
	
}
