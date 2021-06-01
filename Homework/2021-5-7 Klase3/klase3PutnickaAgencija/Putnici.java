package klase3PutnickaAgencija;

public class Putnici {

	private String ime;
	private String prezime;
	private int brPasosa;

	public Putnici(String ime, String prezime, int brPasosa) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brPasosa = brPasosa; 

	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getBrPasosa() {
		return brPasosa;
	}

}
