package zadatakDomaci7;

import java.util.Scanner;

public class Funkcije2 {

	private static Scanner sc;

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i taj program 
		 * treba da pozove i vrati (u mainu) proizvod unetih brojeva.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite tri cela broja.");
		System.out.println("Unesite prvi broj: ");
		int a=sc.nextInt(); 
		System.out.println("Unesite drugi broj: ");
		int b=sc.nextInt();
		System.out.println("Unesite treci broj: ");
		int c=sc.nextInt();
		System.out.println("Proizvod ova tri broja je: " + proizvod(a, b, c));
				
	}

	private static int proizvod(int a, int b, int c) {
		
		return (a*b*c);
	}

}
