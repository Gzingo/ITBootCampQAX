package zadatak1;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		/*
		 * Napisati program na programskom jeziku Java koji sluzi za pronalazenje niza
		 * sa vecim prosecnim elementom. Korisnik na standardniu ulaz unosi duzniu prvog
		 * niza, a zatim i sve njegove elemente. Nakon toga unosi duzinu drugog niza i
		 * sve njegove elemente. Ukoliko korisnik unese nevalidnu vrednost za duzinu
		 * niza ispisati poruku o tome i prekinuti izvrsavanje programa. Pretpostaviti
		 * da ce korisnik uneti cele brojeve za elemente niza. Ucitavanje niza izvrsiti
		 * u zasebnoj funkciji. Napisati funkciju pronadji kojoj se proslednjuju oba
		 * niza. Funkcija pronadji racuna prosecnu vrednost elementa za oba niza i kao
		 * rezultat vreca vecu od te dve prosecne vrednosti. Na stendardni izlaz
		 * ispisati rezultat funkcije.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu prvog niza: ");
		int n = sc.nextInt();
		int niz[] = new int[n];
		if (n <= 0) {
			System.out.println("Uneta je nevalidna vrednost.");
		} else {
			System.out.println("Unesite duzinu drugog niza: ");
			int k = sc.nextInt();
			int niz2[] = new int[k];
			if (k <= 0) {
				System.out.println("Uneta je nevalidna vrednost.");
			} else {
				
				ucitavanje(niz, niz2);
				pronadji(niz, niz2);

			}
		}
	}

	public static void ucitavanje(int niz[], int niz2[]) {
		Scanner sc1 = new Scanner(System.in);
		for(int i = 0; i < niz.length; i ++) {
			System.out.println("Unesite " + i  + " clan 1. niza: ");
			niz[i] = sc1.nextInt();
		}
		for(int j = 0; j < niz2.length; j ++) {
			System.out.println("Unesite " + j  + " clan 2. niza: ");
			niz2[j] = sc1.nextInt();
		}

	}
	public static void pronadji(int niz[], int niz2[]) {
		int veci = 0;		
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < niz.length; i ++) {
			a = (a + niz[i]) / niz.length;
			
		}
		for(int j = 0; j < niz2.length; j ++) {
			b = (b + niz2[j]) / niz2.length;
		}
		if (a>b) {
			veci = a;			
		}
		if (b>a) {
			veci = b;			
		}
		System.out.println("Prosecna vrednost 1. niza je: " + a);
		System.out.println("Prosecna vrednost 2. niza je: " + b);
		
		System.out.println("Veci broj od ova dva broja je: " + veci);
	}

}
