package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static int sumaFinantata= 10;
	
	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
		
	}
	
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("Angajat: ");
		stringBuilder.append(super.toString()).append("Ocupatie=").append(this.ocupatie).append("Salariu=").append(salariu);
		return stringBuilder.toString();
	}
	

	@Override
	public void afisareSumaFinantata() {
		System.out.println(super.compunereStringPentruSumaFinantata(this.sumaFinantata, "Angajatul"));
	}
	
}
