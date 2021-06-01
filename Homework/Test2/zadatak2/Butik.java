package zadatak2;

import java.util.ArrayList;
import java.util.List;

public class Butik {

	public static void main(String[] args) {
		/*
		 * Napisati program na programskom jeziku Java koji sluzi za evidenciju i kombinovanje obuce i garderobe.
		 * Stvar  ima cenu, naziv, velicinu i oznaku za kolekciju (m – muska, z – zenska, u - unisex). Tekstulani opis je naziv – cena.
		 * Obuca je stvar koja ima materijal. Tekstualni opis je naziv – velicina/materijal - cena.
		 * Odeca je stvar koja ima dezen. Tekstualni opis je naziv - velicina/dezen – cena.
		 * Stajling sadrzi ime kreatora, jedan par obuce i jedan ili vise odevnih predmeta. Prilikom kreiranja stajlinga prosledjuje se samo ime 
		 * kreatora. Moguce je postaviti, dohvatiti i izbaciti obucu, kao i dohvatiti sve odevne predmete, dodati neki odevni predmet, kao i 
		 * ukloniti odevni predmet sa neke pozicije. Odevni predmeti dodaju se pojedinacno, a ne vise njih odjednom. Tekstualni opis je 
		 * kreator - oznaka stajlinga – ukupna cena stajlinga. Oznaka stajling je “z” ukoliko ima vise zenskih stvari, “m” ukoliko ima vise 
		 * muskih stvari ili “u” ukoliko ima jednak broj muskih I zenskih stvari ili su sve stvari unisex
		 */
		
		Stvar s1 = new Stvar ("kosulja", 3000);
		Stvar s2 = new Stvar ("haljina", 4200.5);
		Stvar s3 = new Stvar ("patike", 7000);
		Stvar s4 = new Stvar ("majica", 1800);
		Stvar s5 = new Stvar ("cipele", 12000);
		Stvar s6 = new Stvar ("carape", 1000);
		Stvar s7 = new Stvar ("sesir", 4660);
		
		List<Stvar> listaStvari = new ArrayList<Stvar>();
		listaStvari.add(s6);
		listaStvari.add(s7);
		
		List<Stvar> listaObuce = new ArrayList<Stvar>();
		listaObuce.add(s3);
		listaObuce.add(s5);
		
		List<Stvar> listaOdece = new ArrayList<Stvar>();
		listaOdece.add(s1);
		listaOdece.add(s2);
		listaOdece.add(s4);
		
		List<Stvar> kolekcija = new ArrayList<Stvar>();
		kolekcija.add(s1);
		kolekcija.add(s3);
		kolekcija.add(s4);
		kolekcija.add(s6);
		kolekcija.add(s7);
		
		StringBuilder sb = new StringBuilder();
		System.out.println(listaObuce.get(0).getNaziv());
		System.out.println(s1.toString());
		System.out.println(kolekcija.toString());
		System.out.println();
		
		

	}

}
