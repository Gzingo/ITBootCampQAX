package zadatakDomaci3;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		/*
		 * While2: Napisati program koji ce na standardnom izlazu ispisati poruku “Laku
		 * noc!” onoliko puta koliko je korisnik zadao preko konzole. Primer: ako
		 * korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta
		 */

		System.out.println("Unesite celi broj: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int itr = 1;

		while (itr <= n) {

			System.out.print("Laku noc. ");
			itr = itr + 1;
		}
		System.out.println();
		n = n + 1;

	}

}
