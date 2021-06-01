package zadatakDomaci4;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce korisniku ispisati poruku da li je ceo pozitivan
		 * broj koji je uneo palindrom ili nije palindrom.
		 */
		System.out.println("Unesite ceo pozitivan broj: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 0;
		int temp = n;

		while (n > 0) {

			r = r * 10;
			r = r + n % 10;
			n = n / 10;
		}
		if (r == temp) {
			System.out.println("Broj koji ste uneli je Palindrom.");
		} else {
			System.out.println("Broj koji ste uneli nije Palindrom.");
		}

	}

}
