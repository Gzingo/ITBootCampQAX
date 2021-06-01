package projekatiZadaci;

import java.util.Scanner;

public class ZbirNedeljivih {

	public static void main(String[] args) {
		/*
		 * Napisati program koji racuna zbir prvih n prirodnih brojeva, izostavljajuci
		 * one koji su deljivi brojem k.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: n = ");
		int n = sc.nextInt();

		System.out.println("Unesite broj: k = ");
		int k = sc.nextInt();
		int zbir = 0;

		for (int i = n; i <= k; i++) {
			if (i % k != 0)
				zbir += i;
		}
		System.out.println("Zbir je: " + zbir);
	}

}
