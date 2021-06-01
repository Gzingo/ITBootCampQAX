package klaseNasledjivanje;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgram {

	public static void main(String[] args) {

		/*
		 * U prirodi obitavaju razne zivotinje. Sve imaju svoju vrstu (rod, porodica,
		 * poklasa.. Moze biti kicmenjak/beskicmenjak, moze biti i neko blize
		 * odredjivanje…), konkretan naziv i omiljenu hranu. Ribe su kicmenjaci koje
		 * karakterise vrsta vode u kojoj obitavaju (slatka, slana voda) i vrsta peraja.
		 * Sisari su kicmenjaci koje se razlikuju po boji dlake i po broju nogu.
		 * Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu
		 * zive. Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.
		 * Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje. Ispisati bar
		 * jedno staniste. Jednom sisaru zameniti boju dlake.
		 */

		Zivotinje z1 = new Zivotinje("ptica", "Orao", "meso");
		Zivotinje z2 = new Zivotinje("vodozemac", "Zaba", "insekti");

		Sisari s1 = new Sisari("sisar", "Leopard", "meso", 4, "zuta sa crnim rozetama");
		Sisari s2 = new Sisari("sisar", "Lav", "meso", 4, "zuto crvena");
		Sisari s3 = new Sisari("sisar", "Gazela", "biljke", 4, "narandzasta");
		Sisari s4 = new Sisari("sisar", "Zec", "biljke", 4, "siva");
		Sisari s5 = new Sisari("sisar", "Lisica", "meso", 4, "crvena");

		Ribe r1 = new Ribe("riba", "Stuka", "meso", "slatka", "kostana");
		Ribe r2 = new Ribe("riba", "Grgec", "ljuskari", "slatka", "kostana");

		List<Zivotinje> listaZivotinja = new ArrayList<Zivotinje>();
		listaZivotinja.add(z1);
		listaZivotinja.add(z2);
		listaZivotinja.add(s1);
		listaZivotinja.add(s2);
		listaZivotinja.add(s3);
		listaZivotinja.add(s4);
		listaZivotinja.add(s5);
	
		List<Sisari> listaSisari = new ArrayList<Sisari>();
		listaSisari.add(s1);
		listaSisari.add(s2);
		listaSisari.add(s3);
		listaSisari.add(s4);
		listaSisari.add(s5);

		List<Ribe> listaRibe = new ArrayList<Ribe>();
		listaRibe.add(r1);
		listaRibe.add(r2);

		Staniste e1 = new Staniste(listaZivotinja, "Suma");
		Staniste e2 = new Staniste(listaZivotinja, "Savana");
		Staniste e3 = new Staniste(listaZivotinja, "Reka");

		List<Staniste> listaStanista = new ArrayList<Staniste>();
		listaStanista.add(e1);
		listaStanista.add(e2);
		listaStanista.add(e3);		

		StringBuilder sb = new StringBuilder();
		sb.append(listaStanista.get(2).getNazivStanista());
		sb.append(" je jedno od prirodnih stanista riba: ");
		sb.append(listaRibe.get(0).getNaziv());
		sb.append(" i ");
		sb.append(listaRibe.get(1).getNaziv());
		sb.append(", ");
		sb.append(r1.getNaziv());
		sb.append(" preferira ");
		sb.append(r1.getHrana());
		sb.append(" u svojoj ishrani");
		sb.append(", dok su ");
		sb.append(r2.getHrana());
		sb.append(" dominantni u ishrani kod ribe ");
		sb.append(listaRibe.get(1).getNaziv());
		sb.append(". ");
		sb.append("Obe ribe imaju ");
		sb.append(r1.getVrstaPeraja());
		sb.append(" peraja.");
		sb.append(" Ovde se takodje moze naci i veliki broj ");
		sb.append(listaZivotinja.get(1).getNaziv());
		sb.append(".");
		System.out.println(sb.toString());
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append(listaStanista.get(0).getNazivStanista());
		sb1.append(" ... ");
		sb1.append(s4.getNaziv());
		sb1.append(". Ima ");
		sb1.append(s4.getBrojNogu());
		sb1.append(" noge i dominantna boja krzna je ");
		sb1.append(s4.getBojaDlake());
		sb1.append(". ");
		sb1.append(s5.getNaziv());
		sb1.append(" je takodje zivotinja koja hoda na ");
		sb1.append(s5.getBrojNogu());
		sb1.append(" noge, medjutim boja krzna je ");
		sb1.append(s5.getBojaDlake());
		sb1.append(". I pored svoje brzine ");
		sb1.append(s4.getNaziv());
		sb1.append(" je cesto plen koji ");
		sb1.append(s5.getNaziv());
		sb1.append(" lovi jer u njenoj ishrani dominira ");
		sb1.append(s5.getHrana());
		sb1.append(".");
		System.out.println(sb1.toString());
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append(listaStanista.get(1).getNazivStanista());
		sb2.append(" je veoma surovo okruzenje gde mozemo naci zivotinje kao sto su ");
		sb2.append(listaSisari.get(1).getNaziv());
		sb2.append(", ");
		sb2.append(listaSisari.get(0).getNaziv());
		sb2.append(" i ");
		sb2.append(listaSisari.get(2).getNaziv());
		sb2.append(". ");
		sb2.append(listaSisari.get(1).getNaziv());
		sb2.append(" je cesto prekriven dlakom cija je boja ");
		sb2.append(listaSisari.get(1).getBojaDlake());
		sb2.append(", koja u zavisnosti od uzrasta moze biti i ");
		listaSisari.get(1).setBojaDlake("sivo zuta");
		sb2.append(listaSisari.get(1).getBojaDlake());
		sb2.append(".");		
		System.out.println(sb2.toString());

	}

}