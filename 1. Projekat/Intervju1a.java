package projekatiZadaci;

public class Intervju1a {

	public static void main(String[] args) {
		/*
		 * Ako je x = 3, a y = 7, Napisati program tako da im se vrednosti zamene.
		 * Dostaviti oba resenja, sa i bez uvodjenja novih promenljivih.
		 */
		 
		int x = 3;
		int y = 7;
		int z = y - x;
		
		x += z;
		y -=z;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
