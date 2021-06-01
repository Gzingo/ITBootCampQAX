package klase1Vozilo;

import java.util.Scanner;

public class Voznja {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Automobil a1 = new Automobil("Volvo", "C30", 83574941);
		Automobil a2 = new Automobil("Ford", "Mustang GT", 51666738);
		Automobil a3 = new Automobil("Skoda", "Fabia vRS", 77131694);

		System.out.println("Unesite ime vlasnika za prvi automobil: ");
		String a1vlasnik = sc.nextLine();
		a1.setVlasnik(a1vlasnik);

		System.out.println("Unesite ime vlasnika za drugi automobil: ");
		String a2vlasnik = sc.nextLine();
		a2.setVlasnik(a2vlasnik);

		System.out.println("Unesite ime vlasnika za treci automobil: ");
		String a3vlasnik = sc.nextLine();
		a3.setVlasnik(a3vlasnik);
		System.out.println();
		System.out.println("Prvi automobil je " + a1.getMarka() + ", model " + a1.getModel() + ".");
		System.out.println("Drugi automobil je " + a2.getMarka() + ", model " + a2.getModel() + ".");
		System.out.println("Treci automobil je " + a3.getMarka() + ", model " + a3.getModel() + ".");
		System.out.println();
		System.out
				.println(a1.getVlasnik() + " je vlasnik automobila sa serijskim brojem " + a1.getSerijskiBroj() + ".");
		System.out
				.println(a2.getVlasnik() + " je vlasnik automobila sa serijskim brojem " + a2.getSerijskiBroj() + ".");
		System.out
				.println(a3.getVlasnik() + " je vlasnik automobila sa serijskim brojem " + a3.getSerijskiBroj() + ".");
		System.out.println();
		System.out.println("Automobil " + a1.getMarka() + "-" + a1.getModel() + " nosi serijski broj "
				+ a1.getSerijskiBroj() + ".");
		System.out.println("Automobil " + a2.getMarka() + "-" + a2.getModel() + " nosi serijski broj "
				+ a2.getSerijskiBroj() + ".");
		System.out.println("Automobil " + a3.getMarka() + "-" + a3.getModel() + " nosi serijski broj "
				+ a3.getSerijskiBroj() + ".");
		System.out.println();
		System.out.println(a1.getVlasnik() + " je vlasnik automobila " + a1.getMarka() + "-" + a1.getModel() + ".");
		System.out.println(a2.getVlasnik() + " je vlasnik automobila " + a2.getMarka() + "-" + a2.getModel() + ".");
		System.out.println(a3.getVlasnik() + " je vlasnik automobila " + a3.getMarka() + "-" + a3.getModel() + ".");
		System.out.println();
		System.out.println(a1.getVlasnik() + " poseduje automobil marke " + a1.getMarka() + ", model " + a1.getModel()
				+ ", ciji je serijski broj " + a1.getSerijskiBroj() + ".");
		System.out.println(a2.getVlasnik() + " poseduje automobil marke " + a2.getMarka() + ", model " + a2.getModel()
				+ ", ciji je serijski broj " + a2.getSerijskiBroj() + ".");
		System.out.println(a3.getVlasnik() + " poseduje automobil marke " + a3.getMarka() + ", model " + a3.getModel()
				+ ", ciji je serijski broj " + a3.getSerijskiBroj() + ".");

	}
}
