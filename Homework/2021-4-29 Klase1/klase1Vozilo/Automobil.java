package klase1Vozilo;

public class Automobil { 
	/*
	 * vozilo  - Napisati klasu Automobil. Automobil ima 
     * 1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
     * 2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
     * 3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne
     * i postavi;
     * 4) Automobil moze da ima vlasnika, vlasnik moze da se dohvati i postavi u svakom trenutku.
     * Napisati klasu Voznja iz koje ce program moci da se pokrene. 
     * U njoj ce se kreirati najmanje dva automobila. Iskoristiti (proizvoljan broj puta) sve 
     * tipove metoda napisanih u klasi Automobil.
	 */

	private String marka;
	private String model;
	private int serijskiBroj;
	private String vlasnik;
	
	public Automobil(String marka, String model) {
		this.marka = marka;
		this.model = model;
	}	
	public Automobil(String vlasnik, int serijskiBroj) {
		this.vlasnik = vlasnik;
		this.serijskiBroj = serijskiBroj;
		
	}
	public Automobil(String marka, String model, int serijskiBroj) {
		this.marka = marka;
		this.model = model;
		this.serijskiBroj = serijskiBroj;
	}
	public Automobil(String vlasnik, String marka, String model) {
		this.vlasnik = vlasnik;
		this.marka = marka;
		this.model = model;
	}
	public Automobil(String vlasnik, String marka, String model, int serijskiBroj ) {
		this.vlasnik = vlasnik;
		this.marka = marka;
		this.model = model;
		this.serijskiBroj = serijskiBroj;
		
	}
	public String getMarka () {
	return marka;
	}
	public String getModel () {
		return model;
	}
	public int getSerijskiBroj () {
		return serijskiBroj;
	}
	public String getVlasnik() {
		return vlasnik;
	}
	public void setVlasnik(String vlasnik) {
		this.vlasnik = vlasnik;
	}

}
