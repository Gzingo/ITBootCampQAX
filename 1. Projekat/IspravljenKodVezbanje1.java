package zadatakDomaci6;

import java.util.Scanner;

public class Vezbanje1 {

	public static void main(String[] args) {
		/*
		 * Vezbanje1: Napisati program koji ima meni za samousluznu kasu u prodavnici.
		 * Meni za potrosace sadrzi sledece opcije: 0 - Izlaz iz programa (zatvaranje
		 * kase) 1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu) 2
		 * - naplata racuna Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko
		 * korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta
		 * cena se dodaje na racun u prodavnici. Ukoliko korisnik unese opciju 2 program
		 * pita korisnika da unese kolicinu novca za naplatu racuna. Ukoliko korisnik
		 * unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska,
		 * bez umanjenja racuna i da se ponovo ispise meni. Ukoliko korisnik unese
		 * vrednost vecu ili jednaku od cene racuna ispisuje se kusur i racun se ponovo
		 * postavlja na nulu. Zatim se ponovo ispisuje meni.
		 */

		System.out.println("Samousluzna Kasa");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Molimo vas izaberite opciju: ");
		System.out.println("0 ~ Izlaz/zatvori kasu");
		System.out.println("1 ~ Ubaci u korpu");
		System.out.println("2 ~ Plati");
		int izbor = sc.nextInt();
		double racun = 0;
		double zbir = 0;

		while (izbor != 0) {
			switch (izbor) {

			case 0:
				System.out.println("Zatvorili ste kasu. Dodjite ponovo.");
				break;

			case 1:

				System.out.println("Unesite cenu proizvoda: ");
				double c = sc.nextDouble();
				racun = 0;

				while (c != 2 || izbor == 3) {

					if (c > 0 || c != 3) {
						racun += c;
						System.out.println("Racun iznosi: " + racun);
						System.out.println("Unesite cenu proizvoda ili izaberite opciju: ");
						System.out.println("2 ~ Plati");
						System.out.println("3 ~ Izpraznite korpu.");
						c = sc.nextDouble();

					}
					if (c < 0) {
						System.out.println("Uneta je nevalidna vrednost, pokusajte ponovo.");
						break;
					}
					if (c == 3) {
						zbir = racun - racun;
						System.out.println("Vasa korpa je sada prazna.");

					}
				}

			case 2:
				zbir = racun - racun;
				System.out.println("Vas racun iznosi ukupno: " + racun);
				System.out.println("Unesite kolicinu novca za naplatu racuna: ");
				double naplata = sc.nextDouble();
				if (naplata == racun) {
					System.out.println("Racun uspesno placen.");
					System.out.println("Vas racun iznosi: " + zbir);
					System.out.println();
					System.out.println("Molimo vas odaberite opciju: ");
					System.out.println("0 ~ Izlaz/zatvori kasu");
					System.out.println("1 ~ Ubaci u korpu");

					izbor = sc.nextInt();
				}
				if (naplata < racun) {
					System.out.println("Greska! Uneli ste iznos manji od ukupnog iznosa.");
					System.out.println("Vas racun iznosi ukupno: " + racun);
					System.out.println();
					System.out.println("Molimo vas odaberite opciju: ");
					System.out.println("2 ~ Plati");
					izbor = sc.nextInt();
				}
				if (naplata > racun) {
					double kusur = naplata - racun;
					System.out.println("Uneli ste iznos koji je veci od ukupnog iznosa racuna.");
					System.out.println("Racun je placen.");
					System.out.println("Vas kusur je: " + kusur + " - Vas racun iznosi: " + zbir);
					System.out.println();
					System.out.println("Molimo vas odaberite opciju: ");
					System.out.println("0 ~ Izlaz/zatvori kasu");
					System.out.println("1 ~ Ubaci u korpu");
					izbor = sc.nextInt();
					break;
				}

			default:

			}
		}
		System.out.println("Hvala na poseti, dodjite ponovo.");
	}
}
