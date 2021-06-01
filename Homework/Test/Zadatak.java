package test;

import java.util.Scanner;

public class Zadatak {

	public static void main(String[] args) {
		/*
		 * Napisati program na programskom jeziku Java koji sluzi za racunanje opterecenosti
		 *  mosta. Korisniku se na pocetku izvrsavanja ispisuje poruka “Unesite nosivost 
		 *  mosta u tonama”. Nakon unosa ispisuju se poruke “Unesite tezinu n. vozila koje 
		 *  treba da predje most”, gde je n redni broj vozila. Korisnik nakon ove poruke 
		 *  unosi tezinu vozila. Ukoliko unese vrednost 0 ispisati poruku o ukupnoj tezini 
		 *  vozila koja prelaze most i zavrsiti izvrsavanje programa. Ukoliko unese neku 
		 *  drugu nevalidnu vrednost za tezinu ispisati poruku “Nevalidna vrednost” i 
		 *  omoguciti mu ponovni unos za to vozilo. Ukoliko ukupna tezina u jednom trenutku 
		 *  predje nosivost mosta ispisati poruku “MOST JE PREOPTERECEN” i zavrsiti 
		 *  izvrsavanje programa.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite nosivost mosta u  tonama: ");
		double most = sc.nextDouble();
		System.out.println("Unesite tezinu n vozila: ");
		double n = sc.nextDouble();
		double ukupnaTezina = 0;
		double i = 0; 
		
		while (n != 0) {
			System.out.println("Unesite tezinu n vozila: ");
			n = sc.nextDouble();
		while (i<=n) {
			i+=1;
		ukupnaTezina += i ; 
		}if (n == 0) {
			
			System.out.println("Ukupna tezina vozila koja prelaze most je :" + ukupnaTezina + " tona.");
			break;
		}
		if (n<0) {
			System.out.println("Nevalidna vrednost, molimo vas unesite tezinu n vozila: ");
			n = sc.nextDouble();
		}
		if (ukupnaTezina > most || n>most) {
			System.out.println("MOST JE PREOPTERECEN!!");
			break;
		}
		}
	}
	}
	