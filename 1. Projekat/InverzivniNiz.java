package projekatiZadaci;

import java.util.Scanner;

public class InverzivniNiz {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim
		 * redosledom. Primer niza: 32 54 123 18 Ispis: 18 123 54 32
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite broj clanova niza: ");
		int n = sc.nextInt();
		int niz[] = new int[n];

		System.out.println("Unesite clan niza i pritisnite enter: ");
		for (int i = 0; i < n; i++) {
			niz[i] = sc.nextInt();
		}
		System.out.print("Niz : ");
		for (int i = 0; i < n; System.out.print(" " + niz[i++]));
		System.out.println();

		int temp;
		for (int i = 0, j = n - 1; i < j; i++, j--) {
			temp = niz[i];
			niz[i] = niz[j];
			niz[j] = temp;
		}
		System.out.print("Niz invertovan: ");
		for (int i = 0; i < n; System.out.print(" " + niz[i++]))
			;
	}
}