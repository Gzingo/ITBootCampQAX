package klase3PutnickaAgencija;

import java.util.List;

public class Putovanje {

	private String destinacija; 
	private double cena;
	private List<Putnici> listaPutnika;

	public Putovanje(String destinacija, double cena, List<Putnici> listaPutnika) {
		super();
		this.destinacija = destinacija;
		this.cena = cena;
		this.listaPutnika = listaPutnika;
	}

	public String getDestinacija() {
		return destinacija;
	}

	public void setDestinacija(String destinacija) {
		this.destinacija = destinacija;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public List<Putnici> getListaPutnika() {
		return listaPutnika;
	}

	public void setListaPutnika(List<Putnici> listaPutnika) {
		this.listaPutnika = listaPutnika;
	}

}
