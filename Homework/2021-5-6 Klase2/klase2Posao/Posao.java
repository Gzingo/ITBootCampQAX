package klase2Posao;

public class Posao {

	public static void main(String[] args) { 
		
		/*
		 * Firma poseduje naziv, sediste, PIB i niz zaposlenih. Sva polja mogu da se dohvate, a naziv firme moze i da se postavi. Ispisati ceo objekat klase firma. 
		 * Ispisati prezimena svih zaposlenih u firmi.
		 * Zaposleni ima ime i prezime koji se zadaju prilikom kreiranja, poziciju i iznos mesecnih primanja. Zaposlenog ispisati u obliku IME_PREZIME: POZICIJA (mesecna zarada)
		 * Napisati glavni program, gde cete testirati kako ove klase funkcionisu.
		 */
		
		
		Zaposleni z1 = new Zaposleni ("Marija", "Gojkovic", "generalni menadzer", 72.635);
		Zaposleni z2 = new Zaposleni ("Katarina", "Stevic", "menadzer poslovnice", 60.584);
		Zaposleni z3 = new Zaposleni ("Bojan", "Petrovic", "prodavac", 50.242);
		Zaposleni z4 = new Zaposleni ("Stefan", "Krculj", "pomocnik prodavca", 44.603);
		
		
		Firma f1 = new Firma ("Tvoj Bicikl", "Pancevo", 389915684 );
		
		
		
		System.out.println("Firma: " + f1.getNaziv());
		System.out.println("Sediste firme: " + f1.getSediste());
		System.out.println("PIB: " + f1.getPIB());
		System.out.println("Zaposleni:");
		System.out.println("Prezimena zaposlenih  su: " + z1.getPrezime() + ", " + z2.getPrezime() + ", " + z3.getPrezime() + ", " + z4.getPrezime() + ".");
		StringBuilder sb = new StringBuilder();
		sb.append(z1.getIme().toUpperCase());
		sb.append("_");
		sb.append(z1.getPrezime().toUpperCase());
		sb.append(": ");
		sb.append(z1.getPozicija().toUpperCase());
		sb.append(" - mesecna primanja: ");
		sb.append(" ( ");
		sb.append(z1.getPrimanja());
		sb.append(" )");
		System.out.println(sb.toString());
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append(z2.getIme().toUpperCase());
		sb1.append("_");
		sb1.append(z2.getPrezime().toUpperCase());
		sb1.append(": ");
		sb1.append(z2.getPozicija().toUpperCase());
		sb1.append(" - mesecna primanja: ");
		sb1.append(" ( ");
		sb1.append(z2.getPrimanja());
		sb1.append(" )");
		System.out.println(sb1.toString());
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append(z3.getIme().toUpperCase());
		sb2.append("_");
		sb2.append(z3.getPrezime().toUpperCase());
		sb2.append(": ");
		sb2.append(z3.getPozicija().toUpperCase());
		sb2.append(" - mesecna primanja: ");
		sb2.append(" ( ");
		sb2.append(z3.getPrimanja());
		sb2.append(" )");
		System.out.println(sb2.toString());
		
		StringBuilder sb3 = new StringBuilder();
		sb3.append(z4.getIme().toUpperCase());
		sb3.append("_");
		sb3.append(z4.getPrezime().toUpperCase());
		sb3.append(": ");
		sb3.append(z4.getPozicija().toUpperCase());
		sb3.append(" - mesecna primanja: ");
		sb3.append(" ( ");
		sb3.append(z4.getPrimanja());
		sb3.append(" )");
		System.out.println(sb3.toString());
		
		
	}

}
