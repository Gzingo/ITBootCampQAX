package klaseTotalKuhinja;

public class Sastojak {

	/*
	 * Sastojak sadrzi naziv i cenu po kilogramu. Svi podaci mogu da se dohvate.
	 * Omoguciti da cena moze i da se promeni, ali da nikada nece biti negativna.
	 */

	private String naziv;
	private double cenaPoKG;

	public Sastojak(String naziv, double cenaPoKG) {
		super();
		this.naziv = naziv;
		this.cenaPoKG = cenaPoKG;
	}

	public double getCenaPoKG() {
		return cenaPoKG;
	}

	public void setCenaPoKG(double cenaPoKG) {
		this.cenaPoKG = cenaPoKG;
	}

	public String getNaziv() {
		return naziv;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		while (cenaPoKG > 0) {
			sb.append(naziv);
			sb.append(" kosta ");
			sb.append(cenaPoKG);
			sb.append(" RSD po kilogramu.");
			return sb.toString();
		}
		if (cenaPoKG <= 0) {
			return null;
		}
		return naziv;
	}

}
