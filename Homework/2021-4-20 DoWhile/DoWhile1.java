package zadatakDomaci4;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce omoguciti Peri da unese sa koliko novca raspolaze.
		 * On moze da kupuje sve dok mu ne ostane samo 89 dinara jer mu toliko novca
		 * treba da kupi BUSPLUS kartu i vrati se kuci sa novogodisnjim poklonima. Pera
		 * treba da unosi pojedinacne cene poklona, a program treba da ga obavesti kada
		 * potrosi sav predvidjeni novac, to jest kada za sledeci poklon vise nema
		 * kinte.
		 */

		System.out.println("Unesite ukupnu sumu novca kojim raspolazete:  ");
		Scanner sc = new Scanner(System.in);
		double kinta = sc.nextDouble();
		double cena = 0;
		int karta = 89;

		do {
			System.out.println("Unesite cenu poklona: ");
			cena = sc.nextDouble();
			kinta = kinta - cena;
			System.out.println("Preostali iznos je: " + kinta + " RSD");
		} while (kinta > karta);
		{
			if (cena > kinta)
				System.out.println("STOP!! Potrosili biste predvidjenu sumu novca!");
		}

		System.out.print("BUSPLUS karta kosta " + karta + " RSD.");
		System.out.println("Nemate dovoljno novca za sledeci poklon.");
	}
}
