package zadatakDomaci5;

import java.util.Scanner;

public class For3 {

	private static Scanner sc;

	public static void main(String[] args) {
		/*
		   Napraviti program koji ce odstampati na standardnom izlazu trougao od
		   zvezdica. Ako je unet broj 5 (korisnik unosi broj), trougao ce izgledati
		   ovako:			 
		 					  * * * * *  
								* * * * 
								  * * *
								    * *
								      *
		 */

		System.out.println("Unesi broj: ");
		sc = new Scanner(System.in);

		int n = sc.nextInt(); 
		for (int i = n; i >= 1; i--) {

			for (int j = 0; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
