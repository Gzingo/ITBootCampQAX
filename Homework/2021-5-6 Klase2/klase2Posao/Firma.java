package klase2Posao;

public class Firma {
	/*
	 * Firma poseduje naziv, sediste, PIB i niz zaposlenih. Sva polja mogu da se dohvate, a naziv firme moze i da se postavi. Ispisati ceo objekat klase firma. 
	 *Ispisati prezimena svih zaposlenih u firmi.
	 */
	
	private String naziv;
	private String sediste;
	private int PIB;
	private String [] zaposleni = {"Gojkovic", "Stevic", "Petrovic", "Krculj"};
	
	
	
	public Firma(String naziv, String sediste, int pIB, String[] zaposleni) {
		super();
		this.naziv = naziv;
		this.sediste = sediste;
		PIB = pIB;
		this.zaposleni = zaposleni;			
	}
	
	public Firma(String naziv, String sediste, int pIB) {
		super();
		this.naziv = naziv;
		this.sediste = sediste;
		PIB = pIB;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSediste() {
		return sediste;
	}
	public int getPIB() {
		return PIB;
	}
	public String[] getZaposleni() {
		return zaposleni;
	}
	
	
	
	
	

}
