package projekatiZadaci;

public class Intervju1 {

	public static void main(String[] args) {
		/*
		 * Ako je x = 3, a y = 7, Napisati program tako da im se vrednosti zamene. 
		 * Dostaviti oba resenja, sa i bez uvodjenja novih promenljivih.
		 */

		int x = 3;
		int y = 7;
		
		x= y;
		y= y - 4;
		
		System.out.println("x = " + x);
		System.out.println("y = " + y); 
	}

}
