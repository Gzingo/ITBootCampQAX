package zadatak2;

public class Odeca extends Stvar {
	// Odeca je stvar koja ima dezen. Tekstualni opis je naziv - velicina/dezen – cena.

	private String dezen;

	public Odeca(String naziv, double cena, int velicina, char kolekcija, String dezen) {
		super(naziv, cena, velicina, kolekcija);
		this.dezen = dezen;
	}

	public String getDezen() {
		return dezen;
	}

	public void setDezen(String dezen) {
		this.dezen = dezen;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getNaziv());
		sb.append(" - ");
		sb.append(getVelicina());
		sb.append("/");
		sb.append(getDezen());
		sb.append(" - ");
		sb.append(getCena());
		sb.append(" RSD");
		return sb.toString();
	}

	
}
