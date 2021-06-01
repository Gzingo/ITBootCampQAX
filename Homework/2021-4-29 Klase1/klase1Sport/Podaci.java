package klase1Sport;

public class Podaci {

	public static void main(String[] args) {

		Sportista s1 = new Sportista("Milos Kostic", "Kosarka", "OKK Beograd", 17);
		Sportista s2 = new Sportista("Bojan Peric", "Fudbal", "Zemun", 32);
		Sportista s3 = new Sportista("Slobodan Stojanovic", "Odbojka", "OK Novi Beograd", 9);

		System.out.println(s1.getImeiPrezime() + " je sportista cija strast je " + s1.getSport() + ".");
		System.out.println(s2.getImeiPrezime() + " je sportista cija strast je " + s2.getSport() + ".");
		System.out.println(s3.getImeiPrezime() + " je sportista cija strast je " + s3.getSport() + ".");
		System.out.println();
		System.out.println(s1.getImeiPrezime() + " je sportista cija strast je " + s1.getSport() + " i igra za "
				+ s1.getKlub() + ".");
		System.out.println(s2.getImeiPrezime() + " je sportista cija strast je " + s2.getSport() + " i igra za "
				+ s2.getKlub() + ".");
		System.out.println(s3.getImeiPrezime() + " je sportista cija strast je " + s3.getSport() + " i igra za "
				+ s3.getKlub() + ".");
		System.out.println();
		System.out.println(
				s1.getImeiPrezime() + " nosi dres sa brojem " + s1.getBrojDresa() + " i igra za " + s1.getKlub() + ".");
		System.out.println(
				s2.getImeiPrezime() + " nosi dres sa brojem " + s2.getBrojDresa() + " i igra za " + s2.getKlub() + ".");
		System.out.println(
				s3.getImeiPrezime() + " nosi dres sa brojem " + s3.getBrojDresa() + " i igra za " + s3.getKlub() + ".");
		System.out.println();

		s1.setBrojDresa(21);
		s2.setBrojDresa(16);
		s3.setBrojDresa(3);

		System.out.println(s1.getImeiPrezime() + " je sportista cija strast je " + s1.getSport()
				+ " sada nosi dres sa brojem " + s1.getBrojDresa() + ".");
		System.out.println(s2.getImeiPrezime() + " je sportista cija strast je " + s2.getSport()
				+ " sada nosi dres sa brojem " + s2.getBrojDresa() + ".");
		System.out.println(s3.getImeiPrezime() + " je sportista cija strast je " + s3.getSport()
				+ " sada nosi dres sa brojem " + s3.getBrojDresa() + ".");
		System.out.println();

		s1.setKlub("KK Mega");
		s2.setKlub("Radnicki Nis");
		s3.setKlub("OK Vojvodina");

		System.out.println(
				s1.getImeiPrezime() + " je sportista cija strast je " + s1.getSport() + ", nakon transfera igra za "
						+ s1.getKlub() + " i sada nosi dres sa brojem " + s1.getBrojDresa() + ".");
		System.out.println(
				s2.getImeiPrezime() + " je sportista cija strast je " + s2.getSport() + ", nakon transfera igra za "
						+ s2.getKlub() + " i sada nosi dres sa brojem " + s2.getBrojDresa() + ".");
		System.out.println(
				s3.getImeiPrezime() + " je sportista cija strast je " + s3.getSport() + ", nakon transfera igra za "
						+ s3.getKlub() + " i sada nosi dres sa brojem " + s3.getBrojDresa() + ".");

	}

}
