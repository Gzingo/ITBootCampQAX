package zadatak2;

public class Stvar {

	// Stvar ima cenu, naziv, velicinu i oznaku za kolekciju (m – muska, z – zenska,
	// u - unisex). Tekstulani opis je naziv – cena.

	private String naziv;
	private double cena;
	private int velicina;
	private char kolekcija;

	public Stvar(String naziv, double cena, int velicina, char kolekcija) {
		super();
		this.naziv = naziv;
		this.cena = cena;
		this.velicina = velicina;
		this.kolekcija = kolekcija;
	}

	public Stvar(String naziv, double cena) {
		this.naziv = naziv;
		this.cena = cena;
	}

	public String getNaziv() {
		return naziv;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public int getVelicina() {
		return velicina;
	}

	public void setVelicina(int velicina) {
		this.velicina = velicina;
	}

	public char getKolekcija() {
		return kolekcija;
	}

	public void setKolekcija(char kolekcija) {
		this.kolekcija = kolekcija;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getNaziv());
		sb.append(" - ");
		sb.append(getCena());
		sb.append(" RSD");
		return sb.toString();
	}

}
