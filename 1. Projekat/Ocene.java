package projekatiZadaci;

import java.util.Scanner;

public class Ocene {

	public static void main(String[] args) {
		/*
		 * Napisati program koji za tri unete ocene ispisuje srednju vrednost i u
		 * numerickom i opisnom obliku. (opisan oblik - odlican, vrlo dobar, dobar,
		 * dovoljan, nedovoljan)*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvu ocenu: ");
		int a = sc.nextInt();
		System.out.println("Unesite drugu ocenu: ");
		int b = sc.nextInt();
		System.out.println("Unesite trecu ocenu: ");
		int c = sc.nextInt();

		int srednja = (a + b + c) / 3;

		if (srednja == 5) {
			System.out.println("Prosecna ocena je " + srednja + " - odlican.");
		}
		if (srednja == 4) {
			System.out.println("Prosecna ocena je " + srednja + " - vrlo dobar.");
		}
		if (srednja == 3) {
			System.out.println("Prosecna ocena je " + srednja + " - dobar.");
		}
		if (srednja == 2) {
			System.out.println("Prosecna ocena je " + srednja + " - dovoljan.");
		} 
		if (srednja == 1) {
			System.out.println("Prosecna ocena je " + srednja + " - nedovoljan.");
		}
	}

}
