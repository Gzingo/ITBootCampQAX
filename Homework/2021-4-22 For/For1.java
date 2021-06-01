package zadatakDomaci5;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji omoguciti korisniku da unosi recii, sve dok ne unese
		 * rec “stop”, nebitno da li je koristio mala, velika slova ili kombinaciju.
		 * Mozete pri radu koristiti petlju po izboru
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite rec");
		String s1 = sc.nextLine();
		String s2 = "stop";

		while (!s2.equalsIgnoreCase(s1)) {

			System.out.println("Unesite novu rec: ");
			s1 = sc.nextLine();
		}
		System.out.println("Unesena je rec STOP!");
	}
}
