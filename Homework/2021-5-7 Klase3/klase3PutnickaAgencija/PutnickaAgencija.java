package klase3PutnickaAgencija;

import java.util.ArrayList;
import java.util.List;

public class PutnickaAgencija {

	public static void main(String[] args) {
		/*
		 * Napisati klasu Putovanje. Putovanje ima destinaciju, cenu aranzmana i listu putnika.
		 * Putnici imaju ime, prezime i broj pasosa. U glavnom programu se igrati i testirati napisane klase.
		 * Obavezni deo: napraviti bar 3 razlicita putovanja. Po zelji staviti putovanja u listu koja se zove
		 * ponuda. Jednom putovanju bar promeniti cenu aranzmana. Izbaciti jedno putovanje iz ponude.
		 * Sa putovanja izbaciti jednog od putnika.
		 * Neobavezni: vas slobodan izbor u skladu sa tekstom zadatka
		 */
				
		Putnici p1 = new Putnici ("Milan", "Milanovic", 105864312);
		Putnici p2 = new Putnici ("Gordana", "Gajic", 103886432);
		Putnici p3 = new Putnici ("Zorana", "Pajic", 103866115);
		Putnici p4 = new Putnici ("Gordan", "Pajic", 105612834);
		Putnici p5 = new Putnici ("Zoltan", "Hrdelj", 104916773);
		Putnici p6 = new Putnici ("Milana", "Hrdelj", 105834491);
		Putnici p7 = new Putnici ("Atila", "Hrdelj", 112586493);
		Putnici p8 = new Putnici ("Dejan", "Petrovic", 104386166);
		Putnici p9 = new Putnici ("Bozidarka", "Serdar", 105821386);
		Putnici p10 = new Putnici ("Dobrivoj", "Serdar", 104386991);
		Putnici p11 = new Putnici ("Stefana", "Drobnjak", 105813671);
		Putnici p12 = new Putnici ("Dubravka", "Stojakovic", 103846939);
		
		List<Putnici>listaPutnika = new ArrayList<Putnici>();
		
		listaPutnika.add(p1);
		listaPutnika.add(p2);
		listaPutnika.add(p3);
		listaPutnika.add(p4);
		listaPutnika.add(p5);
		listaPutnika.add(p6);
		listaPutnika.add(p7);
		listaPutnika.add(p8);
		listaPutnika.add(p9);
		listaPutnika.add(p10);
		listaPutnika.add(p11);
		listaPutnika.add(p12);
		
		List<Putnici>listaPutnikaT1 = new ArrayList<Putnici>();
				
		listaPutnikaT1.add(p1);
		listaPutnikaT1.add(p2);
		listaPutnikaT1.add(p5);
		listaPutnikaT1.add(p6);
		listaPutnikaT1.add(p7);
		
		List<Putnici>listaPutnikaT2 = new ArrayList<Putnici>();
		
		listaPutnikaT2.add(p3);
		listaPutnikaT2.add(p4);
		listaPutnikaT2.add(p8);
		listaPutnikaT2.add(p12);
		
		List<Putnici>listaPutnikaT3 = new ArrayList<Putnici>();
		
		listaPutnikaT3.add(p9);
		listaPutnikaT3.add(p10);
		listaPutnikaT3.add(p11);
		
		Putovanje v1 = new Putovanje ("Sardinija-Algero", 950.25, listaPutnikaT3);
		Putovanje v2 = new Putovanje ("Sejseli-Ostrvo Mae", 1024.5, listaPutnikaT1);
		Putovanje v3 = new Putovanje ("Meksiko-Kankun", 1456.34, listaPutnikaT2);
		
		List<Putovanje> listaPonuda = new ArrayList<Putovanje>();
		listaPonuda.add(v1);
		listaPonuda.add(v2);
		listaPonuda.add(v3);
		
		System.out.println("U ponudi su " + listaPonuda.size() + " destinacije.");
		System.out.println("Pogledajte kompletnu ponudu: ");
		
		StringBuilder sb = new StringBuilder();
		sb.append("1. Lokacija: ");
		sb.append(v1.getDestinacija());
		sb.append(", cena aranzmana za 10 nocenja sa avionskim prevozom: ");
		sb.append(v1.getCena());
		sb.append(" evra.");
		sb.append(" Putnici: ");
		sb.append(listaPutnikaT3.get(0).getIme());
		sb.append(" ");
		sb.append(listaPutnikaT3.get(0).getPrezime());
		sb.append(", ");
		sb.append(listaPutnikaT3.get(1).getIme());
		sb.append(" ");
		sb.append(listaPutnikaT3.get(1).getPrezime());
		sb.append(", ");
		sb.append(listaPutnikaT3.get(2).getIme());
		sb.append(" ");
		sb.append(listaPutnikaT3.get(2).getPrezime());
		sb.append(".");
		System.out.println(sb.toString());
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("2. Lokacija: ");
		sb1.append(v2.getDestinacija());
		sb1.append(", cena aranzmana za 10 nocenja sa avionskim prevozom: ");
		sb1.append(v2.getCena());
		sb1.append(" evra.");
		sb1.append(" Putnici: ");
		sb1.append(listaPutnikaT1.get(0).getIme());
		sb1.append(" ");
		sb1.append(listaPutnikaT1.get(0).getPrezime());
		sb1.append(", ");
		sb1.append(listaPutnikaT1.get(1).getIme());
		sb1.append(" ");
		sb1.append(listaPutnikaT1.get(1).getPrezime());
		sb1.append(", ");
		sb1.append(listaPutnikaT1.get(2).getIme());
		sb1.append(" ");
		sb1.append(listaPutnikaT1.get(2).getPrezime());
		sb1.append(listaPutnikaT1.get(3).getIme());
		sb1.append(" ");
		sb1.append(listaPutnikaT1.get(3).getPrezime());
		sb1.append(listaPutnikaT1.get(4).getIme());
		sb1.append(" ");
		sb1.append(listaPutnikaT1.get(4).getPrezime());
		sb1.append(".");
		System.out.println(sb1.toString());
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("3. Lokacija: ");
		sb2.append(v3.getDestinacija());
		sb2.append(", cena aranzmana za 10 nocenja sa avionskim prevozom: ");
		sb2.append(v3.getCena());
		sb2.append(" evra.");
		sb2.append(" Putnici: ");
		sb2.append(listaPutnikaT2.get(0).getIme());
		sb2.append(" ");
		sb2.append(listaPutnikaT2.get(0).getPrezime());
		sb2.append(", ");
		sb2.append(listaPutnikaT2.get(1).getIme());
		sb2.append(" "); 
		sb2.append(listaPutnikaT2.get(1).getPrezime());
		sb2.append(", ");
		sb2.append(listaPutnikaT2.get(2).getIme());
		sb2.append(" ");
		sb2.append(listaPutnikaT2.get(2).getPrezime());
		sb2.append(listaPutnikaT2.get(3).getIme());
		sb2.append(" ");
		sb2.append(listaPutnikaT2.get(3).getPrezime());		
		sb2.append(".");
		System.out.println(sb2.toString());
				
		System.out.println("Za destinaciju " + v2.getDestinacija() + ", trenutna cena aranzmana je");		
		System.out.println(v2.getCena() + " evra za 10 nocenja sa avionskim prevozom.");
				
		v2.setCena(1125.0);
		System.out.println("Od 10. juna cena aranzmana za destinaciju " + v2.getDestinacija() + " iznosice " + v2.getCena() + " evra.");
		
		listaPonuda.remove(v3);	
		System.out.println("Zbog novonastale situacije obavestavamo vas o izmenama ponude putovanja. ");
		System.out.println("Nakon izmena u ponudi ostaju " + listaPonuda.size() + " destinacije: ");
		System.out.println("1. " + listaPonuda.get(0).getDestinacija() + "- cena aranzmana za 10 nocenja sa avionskim prevozom: " + listaPonuda.get(0).getCena());
		System.out.println("2. " + listaPonuda.get(1).getDestinacija() + "- cena aranzmana za 10 nocenja sa avionskim prevozom: " + listaPonuda.get(1).getCena());
		System.out.println();
				
		}

}
