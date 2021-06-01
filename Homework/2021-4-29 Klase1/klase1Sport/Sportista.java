package klase1Sport;

public class Sportista {

	/*
	 * Napisati klasu Sportista. Sportista ima
	 * 1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
	 * 2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
	 * 3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
	 * 4) broj koji nosi na dresu ( tipa int) koje moze i da se dohvati i da se postavi. 
	 * Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti (proizvoljan broj puta) 
	 * sve tipove metoda napisanih u klasi Sportista.
	 */

	private String imeiprezime;
	private String sport;
	private String klub;
	private int brojdresa;

	public Sportista(String imeiprezime, String sport) {
		this.imeiprezime = imeiprezime;
		this.sport = sport;
	}

	public Sportista(String imeiprezime, String sport, String klub) {
		this.imeiprezime = imeiprezime;
		this.klub = klub;
		this.klub = klub;
	}

	public Sportista(String imeiprezime, int brojdresa, String klub) {
		this.imeiprezime = imeiprezime;
		this.brojdresa = brojdresa;
		this.klub = klub;
	}

	public Sportista(String imeiprezime, String sport, int brojdresa) {
		this.imeiprezime = imeiprezime;
		this.sport = sport;
		this.brojdresa = brojdresa;
	}

	public Sportista(String imeiprezime, String sport, String klub, int brojdresa) {
		this.imeiprezime = imeiprezime;
		this.sport = sport;
		this.klub = klub;
		this.brojdresa = brojdresa;
	}

	public String getImeiPrezime() {
		return imeiprezime;
	}

	public String getSport() {
		return sport;
	}

	public String getKlub() {
		return klub;
	}

	public void setKlub(String klub) {
		this.klub = klub;
	}

	public int getBrojDresa() {
		return brojdresa;
	}

	public void setBrojDresa(int brojdresa) {
		this.brojdresa = brojdresa;
	}
}
