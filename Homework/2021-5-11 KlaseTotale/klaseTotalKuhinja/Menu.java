package klaseTotalKuhinja;

import java.util.ArrayList;
import java.util.List;

public class Menu extends Jelo{
	
	/*
	 * Meni sadrzi listu jela. Sadrzi metodu koja dodaje jelo u meni. Moze da se ispise ceo meni u sledecem formatu: 
	 * Naziv_jela: nazivNamirnice, nazivNamirnice, … , nazivNamirnice
	 * Naziv_jela: nazivNamirnice, nazivNamirnice, … , nazivNamirnice
	 * Naziv_jela: nazivNamirnice, nazivNamirnice, … , nazivNamirnice
	 */


	protected List<Jelo> listaJela = new ArrayList<Jelo>();
	
	public Menu(String nazivJela, List<Sastojak> listaSastojaka, double kolicina, List<Jelo> listaJela) {
		super(nazivJela, listaSastojaka, kolicina);
		this.listaJela = listaJela;
	}
	
	public void dodajJelo(Jelo j) {
		listaJela.add(j);
	}
	
	
	
}
