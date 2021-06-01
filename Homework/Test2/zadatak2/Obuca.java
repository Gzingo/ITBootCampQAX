package zadatak2;

public class Obuca extends Stvar {
	// Obuca je stvar koja ima materijal. Tekstualni opis je naziv –velicina/materijal - cena.

	private String materijal;

	public Obuca(String naziv, double cena, int velicina, char kolekcija, String materijal) {
		super(naziv, cena, velicina, kolekcija);
		this.materijal = materijal;
	}

	public String getMaterijal() {
		return materijal;
	}

	public void setMaterijal(String materijal) {
		this.materijal = materijal;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getNaziv());
		sb.append(" - ");
		sb.append(getVelicina());
		sb.append("/");
		sb.append(getMaterijal());
		sb.append(" - ");
		sb.append(getCena());
		sb.append(" RSD");
		return sb.toString();
	}

}
