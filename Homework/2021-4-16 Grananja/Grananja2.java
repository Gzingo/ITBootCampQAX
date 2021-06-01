package zadatakDomaci2;

import java.util.Scanner;

public class Grananja2 {

	public static void main(String[] args) {
		/*
		 * Prvi domaci zadatak od 15.4.2021. uraditi ponovo, koristeci grananja kako
		 * bismo se ogradili od nemogucih izracunavanja povrsina (kakvi celi brojevi
		 * moraju da budu visina, sirina i duzina?)
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite visinu prostorije i pritisnite enter: ");
		double a = s.nextDouble();
		if (a <= 0) {
			System.out.println("Unesena vrednost nije validna! Pokusajte ponovo. ");
		} else {
			System.out.println("Unesite sirinu prostorije i pritisnite enter: ");
		}
		double b = s.nextDouble();
		if (b <= 0) {
			System.out.println("Unesena vrednost nije validna! Pokusajte ponovo. ");
		} else {
			System.out.println("Unesite duzinu prostorije i pritisnite enter: ");
		}
		double c = s.nextDouble();
		if (c <= 0) {
			System.out.println("Unesena vrednost nije validna! Pokusajte ponovo. ");
		} else {
			System.out.println("Povrsina vase prostorije je " + (2 * ((a * b) + (a * c)) + (b * c)));
		}
	}
}