package projekatiZadaci;

import java.util.Scanner;

public class Intervju2 {

	public static void main(String[] args) {
		// Napisati program gde korisnik unosi n brojeva i ispisuje maksimalni i minimalni broj.

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj clanova niza: ");
		int n = sc.nextInt();
		int niz[] = new int[n];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite" + i + ". element niza: ");
			niz[i] = sc.nextInt();
		}
		int max = niz[0];
		int min = niz[0];
		for (int i = 1; i < niz.length; i++) {
			if (max < niz[i]) {
				max = niz[i];
			}
			if (min > niz[i]) {
				min = niz[i];
			}
		}
		System.out.println("Maksimalni broj je " + max);
		System.out.println("Minimalni broj je " + min);
	}
}