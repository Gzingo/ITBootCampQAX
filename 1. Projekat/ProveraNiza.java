package projekatiZadaci;

import java.util.Scanner;

public class ProveraNiza {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i proverava da li je niz
		 * rastuci. Primer1 niza: 3 54 123 18 Ispis: Niz nije rastuci. 
		 * Primer2 niza: 71 422 1001 5054 Ispis: Niz je rastuci.
		 */

		Scanner sc = new Scanner(System.in); 
		int prethodni, sledeci;
		boolean rastuci = true;
		
		System.out.print("Unesite broj clanova niza: ");
		int n = sc.nextInt();
		
		System.out.println("Unesi prvi element niza: ");
		prethodni = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			System.out.println("Unesi " + i + ". element niza:");
			sledeci = sc.nextInt();
			if (prethodni >= sledeci) {
				rastuci = false;
				break;
			}
			prethodni = sledeci;
		}
		if (rastuci) {
			System.out.println("Niz je rastuci.");
		} else {
			System.out.println("Niz nije rastuci");
		}
	}
}
