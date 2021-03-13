package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.readers.ReaderAngajat;
import ro.ase.cts.readers.ReaderAplicanti;

public class Program {

	public static List<Aplicant> citesteAplicanti(ReaderAplicanti reader) throws FileNotFoundException{
		return reader.readAplicant();
	}
	
	public static void main(String[] args) {
		List<Aplicant> listaAplicant;
		try {
			listaAplicant = citesteAplicanti(new ReaderAngajat("angajati.txt"));
			for(Aplicant aplicant:listaAplicant){
				System.out.println(aplicant.toString());
				aplicant.afisareSumaFinantata();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
