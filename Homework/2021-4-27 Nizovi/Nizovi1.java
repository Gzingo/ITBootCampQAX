package zadatakDomaci8;

import java.util.Scanner;

public class Nizovi1 {

	public static void main(String[] args) {
		/*
		 * Napisti program koji sa standardnog ulaza ucitava duzinu i elemente niza koji
		 * su tipa int. Zatim niz proslediti metodi koja treba da proveri da li je niz
		 * palindrom ili nije. Na standradnom izlazu obavestiti krajnjeg korisnika njemu
		 * razumljivim tekstom da li je unesen niz palindrom. Primer ucitanog niza koji
		 * je palindrom: 12 46 17 46 12 
		 * Primer ucitanog niza koji nije palindrom: 12 46 17 12 64
		 */
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj clanova niza: ");
		int n = sc.nextInt();
		int niz[] = new int[n];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite" + i + ". element niza: ");
			niz[i] = sc.nextInt();
		}
		palindrome(niz, n);
	}

	static void palindrome(int niz[], int n) {

		int temp = 0;

		for (int i = 0; i <= n / 2 && n != 0; i++) {

			if (niz[i] != niz[n - i - 1]) {
				temp = 1;
				break;
			}
		}

		if (temp == 1)
			System.out.println("Niz nije Palindrom");
		else
			System.out.println("Niz je Palindrom");
	}

}