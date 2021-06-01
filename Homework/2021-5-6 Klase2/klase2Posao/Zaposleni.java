package klase2Posao;

public class Zaposleni {
	/*
	 * Zaposleni ima ime i prezime koji se zadaju prilikom kreiranja, poziciju i iznos mesecnih primanja. 
	 * Zaposlenog ispisati u obliku IME_PREZIME: POZICIJA (mesecna zarada)
	 */
	
	private String ime;
	private String prezime;
	private String pozicija;
	private double primanja;
	
	
	
	public Zaposleni(String ime, String prezime, String pozicija, double primanja) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.pozicija = pozicija;
		this.primanja = primanja;
				
		
	}
	public String getPozicija() {
		return pozicija;
	}
	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}
	public double getPrimanja() {
		return primanja;
	}
	public void setPrimanja(double primanja) {
		this.primanja = primanja;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	
}
