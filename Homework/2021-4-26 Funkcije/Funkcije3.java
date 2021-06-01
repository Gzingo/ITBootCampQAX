package zadatakDomaci7;

import java.util.Scanner;

public class Funkcije3 {

	public static void main(String[] args) {
		/*
		 * spojena prva dva zadatka sa malo izmenjenim zahtevima -> Napisati program koji ce 
		 * procitati 3 cela broja sa standardnog ulaza i poziva i ispisuje dve metode. 
		 * Prva ispisuje zbir tri unesena broja, a druga vraca najveci od unetih brojeva.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite tri cela broja.");
		System.out.println("Unesite prvi broj: ");
		int a=sc.nextInt(); 
		System.out.println("Unesite drugi broj: ");
		int b=sc.nextInt();
		System.out.println("Unesite treci broj: ");
		int c=sc.nextInt();
		System.out.println("Zbir ova tri broja je: " + zbir(a, b, c));
		System.out.println("Najveci broj je " + najveci(a, b, c));
		
	}

	private static int najveci(int a, int b, int c) {
		
		return Math.max(Math.max(a, b), c);
	}

	private static int zbir(int a, int b, int c) {
		
		return (a+b+c);
	}

}
