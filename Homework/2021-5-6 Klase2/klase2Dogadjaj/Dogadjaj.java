package klase2Dogadjaj;

import java.util.ArrayList;
import java.util.List;

public class Dogadjaj {

	public static void main(String[] args) {
		
		Dvorana d1 = new Dvorana("Sava Centar", "Beograd", 3672);
		Dvorana d2 = new Dvorana("Dom sindikata", "Beograd", 1381);
				
		List<Dvorana> listaDvorana = new ArrayList<Dvorana>();
		 
		listaDvorana.add(d1);
		listaDvorana.add(d2);
		
		Event e1 = new Event(16.30, "FEST - projekcija filma 'Amonit' ");
		Event e2 = new Event(16.30, "FEST - projekcija filma 'Deca sunca' ");
		List<Event> listaDogadjaja = new ArrayList<Event>();
		
		listaDogadjaja.add(e1);
		listaDogadjaja.add(e2);
		
		System.out.println(listaDvorana.size());
		System.out.println(listaDvorana.get(0).getNaziv());
		System.out.println(listaDvorana.get(0).getGrad());
		System.out.println(listaDvorana.get(1).getNaziv());
		
		d2.setNaziv("Kombank Dvorana");
		d2.setKapacitet(1300);
		
		System.out.println(listaDvorana.get(1).getNaziv());
		System.out.println(listaDvorana.get(1).getGrad());
		System.out.println(d1.getNaziv());
		
		
		StringBuilder sb = new StringBuilder();
		 
		sb.append("1-Lokacija: ");
		sb.append(d1.getNaziv());
		sb.append(" ,");
		sb.append(d1.getGrad());
		sb.append(" ,kapaciteta ");
		sb.append(d1.getKapacitet());
		sb.append(" sedista, ");
		sb.append(" danas u ");
		sb.append(e1.getVreme());
		sb.append("0 casova: ");
		sb.append(e1.getTipDogadjaja() + ".");
		System.out.println(sb.toString());
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("2-Lokacija: ");
		sb1.append(d2.getNaziv());
		sb1.append(" ,");
		sb1.append(d2.getGrad());
		sb1.append(" ,kapaciteta ");
		sb1.append(d2.getKapacitet());
		sb1.append(" sedista, ");
		sb1.append(" danas u ");
		sb1.append(e2.getVreme());
		sb1.append("0 casova: ");
		sb1.append(e2.getTipDogadjaja() + ".");
		System.out.print(sb1.toString());
		
	}

}
