package zadatakDomaci2;

import java.util.Scanner;

public class Grananja4 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji na osnovu unete godine i meseca ispisuje koliko taj
		 * mesec ima dana.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite godinu : ");
		int godina = sc.nextInt();
		System.out.println("Unesite redni broj meseca : ");
		int mesec = sc.nextInt();
		int brDana = 0;
		switch (mesec) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			brDana = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			brDana = 30;
			break;
		case 2:
			if (((godina % 4 == 0) && !(godina % 100 == 0)) || (godina % 400 == 0))
				brDana = 29;
			else
				brDana = 28;
			break;

		default:
			System.out.println("Nepostojeci mesec.");
		}
		System.out.println("Broj dana u mesecu = " + brDana);

	}
}
