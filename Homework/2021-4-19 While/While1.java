package zadatakDomaci3;

import java.util.Scanner;

public class While1 {
	/*
	 * Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan
	 * broj, i ispisuje njihov zbir (zbir pozitivnih brojeva). primer: ako korisnik
	 * unese 1 2 5 3 -1, program treba da ispise 11
	 */
	public static void main(String[] args) {
		System.out.println("Unesite cele brojeve koji zavrsavaju negativnim brojem: ");
		Scanner sc = new Scanner(System.in);

		int broj = sc.nextInt();
		int zbir = 0;
		
		zbir = zbir + broj;

		while (broj > 0) {
			System.out.println("Unesite broj : ");
			broj = sc.nextInt();
			zbir = zbir + broj;
			 
			if (broj < 0) {
				zbir = zbir - broj;
				System.out.print("Unesen je negativan broj! ");

			}
		}
		System.out.println("Ukupan zbir brojeva je  " + zbir);
	}

}
