package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Utils;
import ro.ase.cts.readers.ReaderAngajat;
import ro.ase.cts.readers.ReaderElev;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicant;
		try {
			listaAplicant = ReaderElev.readPupil("elevi.txt");
			for(Aplicant angajat:listaAplicant)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
