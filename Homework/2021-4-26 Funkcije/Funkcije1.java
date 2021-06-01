package zadatakDomaci7;

import java.util.Scanner;

public class Funkcije1 {

	private static Scanner sc;

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
		 * (znaci da korisnik unosi tri broja) i taj program treba da pozove i ispise 
		 * (u mainu) najmanji od ta tri unesena broja.
		 */

		System.out.println("Unesite tri cela broja.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvi broj: ");
		int a=sc.nextInt();
		System.out.println("Unesite drugi broj: ");
		int b=sc.nextInt();
		System.out.println("Unesite treci broj: ");
		int c=sc.nextInt();
		System.out.println("Najmanji broj je " + broj(a, b, c));
										
	}
	
	public static int broj(int a, int b,int c) {
		
		return Math.min(Math.min(a, b), c);
	}

}
