package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.readers.ReaderAngajat;
import ro.ase.cts.readers.ReaderAplicanti;

public class Program {

	public static List<Aplicant> citesteAplicanti(ReaderAplicanti reader) throws FileNotFoundException{
		return reader.readAplicant();
	}
	
	public static void afiseazaAplicanti (List<Aplicant> aplicanti) {
		Proiect proiect = new Proiect(80);
		for(Aplicant aplicant:aplicanti){
			System.out.println(aplicant.toString());
			aplicant.afisareSumaFinantata();
			aplicant.afiseazaStatusPeProiect(proiect);
		}
	}
	
	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new ReaderAngajat("angajati.txt"));
			afiseazaAplicanti(listaAplicanti);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
