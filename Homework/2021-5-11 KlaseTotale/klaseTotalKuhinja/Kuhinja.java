package klaseTotalKuhinja;

import java.util.ArrayList;
import java.util.List;

public class Kuhinja {

	public static void main(String[] args) {
		
		Sastojak s = new Sastojak("Sargarepa", 30.8);
		Sastojak s1 = new Sastojak("Krompir", 50.0);
		Sastojak s2 = new Sastojak("Luk", 35.5);;
		Sastojak s3 = new Sastojak("Piletina", 320.0);
		Sastojak s4 = new Sastojak("Svinjetina", 450.0);
		Sastojak s5 = new Sastojak("Teletina", 690.0);
		Sastojak s6 = new Sastojak("So", 74.5);
		
		List<Sastojak> listaSastojaka = new ArrayList<Sastojak>();
		listaSastojaka.add(s);
		listaSastojaka.add(s1);
		listaSastojaka.add(s2);
		listaSastojaka.add(s3);
		listaSastojaka.add(s4);
		listaSastojaka.add(s5);
		listaSastojaka.add(s6);
		
		System.out.println(listaSastojaka.get(0).toString());
		
		

	}

}
