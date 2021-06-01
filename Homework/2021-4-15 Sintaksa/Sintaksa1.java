package zadatakDomaci1;

import java.util.Scanner;

public class Sintaksa1 {

	public static void main(String[] args) {
		/*
		 * Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije,
		 * tako sto se ivice prostorije ucitavaju preko konzole. (za pretpostavku uzeti
		 * da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite visinu prostorije i pritisnite enter: ");
		double a = s.nextDouble();
		System.out.println("Unesite sirinu prostorije i pritisnite enter: ");
		double b = s.nextDouble();
		System.out.println("Unesite duzinu prostorije i pritisnite enter: ");
		double c = s.nextDouble();
		System.out.println("Povrsina vase prostorije je "  + (2*((a * b) + (a * c)) + (b * c))); 
 
	}

}