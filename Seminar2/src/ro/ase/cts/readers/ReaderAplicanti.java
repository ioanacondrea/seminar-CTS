package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class ReaderAplicanti {
	
	protected String fileName;
	

	public ReaderAplicanti(String fileName) {
		super();
		this.fileName = fileName;
	}


	public abstract List<Aplicant> readAplicant() throws FileNotFoundException;
	
	public void citesteAplicati(Scanner input, Aplicant aplicant) {
		String nume = input.next();
		String prenume = input.next();
		int varsta = input.nextInt();
		int punctaj = input.nextInt();
		int nrProiecte = input.nextInt();
		String[] denumiriProiecte = new String[5];
		for (int i = 0; i < nrProiecte; i++) {
			denumiriProiecte[i] = input.next();
		}
			
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setDenumireProiect(denumiriProiecte, nrProiecte);
	}
}
