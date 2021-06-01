package test;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * Prvi zadatak
Napisati program na programskom jeziku Java koji sluzi kao kviz za pogadjanje zemalja
iz kojih dolaze teniseri. Korisnik moze da odgovara sve dok ne izabere opciju za izlaz.
Korisniku se na standardni izlaz ispisuje sledeci meni:
1. Djokovic
2. Nadal
3. Federer
4. Izlaz

Korisnik bira redni broj tesnisera za koga ce pogadjati zemlju porekla. Nakon toga mu se
ispisuje poruka sa pitanjem. Npr. ukoliko je korisnik izabrao opciju jedan ispisuje se
poruka:
"Iz koje zemlje dolazi Djokovic?". Ukoliko korisnik unese tacan odgovor ispisuje se
poruka "Tacno!". Ukoliko korisnik unese netacan odgovor ispisuje se poruka "Netacno!".
Nakon toga opet se ispisuje isti meni sa istim funkcionalnostima.
Ukoliko korisnik izabere opciju 4 izlazi se iz programa.  
Ukoliko korisnik unese neki nevalidan broj kao opciju ponovo ispisati meni.
Prilikom provere tacnosti odgovora ne treba voditi racuna o velikim i malim slovima.
Tacni odgovori su: Djokovic - Srbija, Nadal - Spanija, Federer - Svajcarska.
		 */
		System.out.println("Izaberite jednog od ponudjenih tenisera kako bi ste zapoceli kviz: ");
		System.out.println("Za Izlaz izaberite opciju 4");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Djokovic");
		System.out.println("2. Nadal");
		System.out.println("3. Federer");
		System.out.println("4. Izlaz");

		int izbor = sc.nextInt();

		while (izbor != 4) {

			switch (izbor) {

			case 1:
				System.out.println("Pitanje: Iz koje zemlje dolazi Djokovic?");
				System.out.println("Izaberite jedan od ponudjenih odgovora: ");
				System.out.println("1. Hrvatska");
				System.out.println("2. BiH");
				System.out.println("3. Srbija");
				int odgovor = sc.nextInt();

				if (odgovor == 3) {
					System.out.println("Odgovor je TACAN!!");
				}
				if (odgovor != 3) {
					System.out.println("Odgovor je NETACAN!!");
				}
				break;
			case 2:
				System.out.println("Pitanje: Iz koje zemlje dolazi Nadal?");
				System.out.println("Izaberite jedan od ponudjenih odgovora: ");
				System.out.println("1. Francuska");
				System.out.println("2. Portugal");
				System.out.println("3. Spanija");
				int odgovor1 = sc.nextInt();

				if (odgovor1 == 3) {
					System.out.println("Odgovor je TACAN!!");
				}
				if (odgovor1 != 3) {
					System.out.println("Odgovor je NETACAN!!");
				}
				break;
			case 3:
				System.out.println("Pitanje: Iz koje zemlje dolazi Federer?");
				System.out.println("Izaberite jedan od ponudjenih odgovora: ");
				System.out.println("1. Holandija");
				System.out.println("2. Svajcarska");
				System.out.println("3. Belgija");
				int odgovor2 = sc.nextInt();

				if (odgovor2 == 2) {
					System.out.println("Odgovor je TACAN!!");
				}
				if (odgovor2 != 2) {
					System.out.println("Odgovor je NETACAN!!");
				}
				break;
			default:
				System.out.println("Izaberite jednog od ponudjenih tenisera kako bi ste zapoceli kviz: ");
				System.out.println("Za Izlaz izaberite opciju 4");
				System.out.println("1. Djokovic");
				System.out.println("2. Nadal");
				System.out.println("3. Federer");
				System.out.println("4. Izlaz");
				izbor = sc.nextInt();
			}

		}
		if (izbor > 4) {
			System.out.println("Uneli ste nevalidan izbor. Molimo pokusajte ponovo.");
			System.out.println("Izaberite jednog od ponudjenih tenisera kako bi ste zapoceli kviz: ");
			System.out.println("Za Izlaz izaberite opciju 4");
			System.out.println("1. Djokovic");
			System.out.println("2. Nadal");
			System.out.println("3. Federer");
			System.out.println("4. Izlaz");
			izbor = sc.nextInt();
		}
		if (izbor <= 0) {
			System.out.println("Uneli ste nevalidan izbor. Molimo pokusajte ponovo.");
			System.out.println("Izaberite jednog od ponudjenih tenisera kako bi ste zapoceli kviz: ");
			System.out.println("Za Izlaz izaberite opciju 4");
			System.out.println("1. Djokovic");
			System.out.println("2. Nadal");
			System.out.println("3. Federer");
			System.out.println("4. Izlaz");
			izbor = sc.nextInt();
		}

		else {
			System.out.println("Izabrali ste Opciju 4 Izlaz. Kviz ce biti zatvoren, hvala na ucescu.");
		}

	}

}
