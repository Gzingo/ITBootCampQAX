package zadatakDomaci8;

import java.util.Scanner;

public class Nizovi2 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji izracunava proizvod elemenata niza tipa int, koji su
		 * veci od njihovog indeksa. Za unos niza i za proizvod koristiti zasebno
		 * metode. Duzina niza i unos niza ucitavaju se sa standardnog ulaza. Primer
		 * ucitanog niza: 3 7 1 4 2 5 Primer izracunatog proizvoda: 840
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj clanova niza: ");
		int n = sc.nextInt();
		int niz[] = new int[n];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite" + i + ". element niza: ");
			niz[i] = sc.nextInt();
		}
		proizvod(niz, n);

	}

	private static void proizvod(int[] niz, int n) {
		int p = 1;
		for (int i = 0; i < niz.length; i++) {
			p = p * niz[i];
		}
		System.out.println("Proizvod elemenata niza je: p = " + p);

	}

}
