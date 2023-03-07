package cts.main;

import java.io.FileNotFoundException;
import java.util.List;


import cts.clase.Angajat;
import cts.clase.Aplicant;
import cts.clase.reader.ReaderAngajat;
import cts.clase.reader.ReaderAplicant;


public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		ReaderAngajat readerAngajat = new ReaderAngajat();
		try {
			ReaderAngajat reader = new ReaderAngajat();
			listaAngajati = reader.readAplicants("angajati.txt");
			Angajat.setSumaFinantare(100);
			for(Aplicant angajat:listaAngajati) {
				System.out.println(angajat.toString());
				angajat.afisareSumaFinantare();
				angajat.afisareStatus();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
