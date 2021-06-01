package klaseNasledjivanje;

import java.util.ArrayList;
import java.util.List;

public class Staniste  {	
		
	//Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.

	
	protected List<Zivotinje> listaZivotinja = new ArrayList<Zivotinje>();;
	private String nazivStanista;
	
	public Staniste(List<Zivotinje> listaZivotinja, String nazivStanista) {
		super();
		this.listaZivotinja = listaZivotinja;
		this.nazivStanista = nazivStanista;
	}

	public List<Zivotinje> getListaZivotinja() {
		return listaZivotinja;
	}

	public void setListaZivotinja(List<Zivotinje> listaZivotinja) {
		this.listaZivotinja = listaZivotinja;
	}

	public String getNazivStanista() {
		return nazivStanista;
	}
	
	

}
