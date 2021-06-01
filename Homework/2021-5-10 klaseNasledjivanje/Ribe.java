package klaseNasledjivanje;

public class Ribe extends Zivotinje{
	
	//Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka, slana voda) i vrsta peraja.

	private String vrstaVode;
	private String vrstaPeraja;
	
	public Ribe(String vrsta, String naziv, String hrana, String vrstaVode, String vrstaPeraja) {
		super(vrsta, naziv, hrana);
		this.vrstaVode = vrstaVode;
		this.vrstaPeraja = vrstaPeraja;
	}

	public String getVrstaVode() {
		return vrstaVode;
	}

	public void setVrstaVode(String vrstaVode) {
		this.vrstaVode = vrstaVode;
	}

	public String getVrstaPeraja() {
		return vrstaPeraja;
	}

	public void setVrstaPeraja(String vrstaPeraja) {
		this.vrstaPeraja = vrstaPeraja;
	}
	
	

}
