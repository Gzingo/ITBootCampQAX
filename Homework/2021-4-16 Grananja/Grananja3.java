package zadatakDomaci2;

import java.util.Scanner;

public class Grananja3 {

	public static void main(String[] args) {

		/*
		 * Napisati program koji na osnovu unetog naziva meseca ispisuje koliko ima
		 * meseci u godini koji pocinju na to slovo(na taj glas)
		 * 
		 */ 
	   

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Unesite naziv mesec ai vidite koliko meseci ima da pocinju na to slovo");
	        System.out.println("Unesite molim vas nazive na srpskom, malim slovima");

	        String mesec = sc.next();

	        switch(mesec){
	            case "januar":
	            case "jun":
	            case "jul":
	                System.out.println("Ima 3 meseca u godini koji pocinju na slovo unetog meseca");
	                break;
	            case "april":
	            case "avgust":
	            case "mart":
	            case "maj":
	                System.out.println("Ima 2 meseca u godini koji pocinju na slovo unetog meseca");
	                break;
	            case "februar": case "septembar": case "oktobar": case "novembar": case "decembar":
	                System.out.println("Samo uneti mesec pocinje na to slovo");
	                break;
	            default: System.out.println("Pogresan naziv");
	            sc.close();

	        }

	    }

	}