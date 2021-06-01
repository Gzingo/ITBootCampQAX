package klaseTotalKuhinja;

import java.util.List;

public class Jelo {
	/*
	 * Jelo ima svoj naziv i proizvoljno mnogo sastojaka, a za svaki sastojak treba znati i koliko grama je potrebno. 
	 * Pri kreiranju se zadaje samo naziv jela.
	 * Treba napraviti metodu koja ce omoguciti dodavanje sastojka koja izgleda ovako:
	 * public void dodajSastojak(Sastojak s, int kolicina);
	 * Lista sastojaka moze da se dohvati, kao i naziv.
	 * U klasi jelo postoji metoda koja racuna koliko novca je potrebno da bi se sve namirnice nabavile.
	 */
	
	private String nazivJela;
	protected List<Sastojak> listaSastojaka;
	protected double kolicina;
		
	
	public Jelo(String nazivJela, List<Sastojak> listaSastojaka, double kolicina)  {
		super();
		this.nazivJela = nazivJela;
		this.listaSastojaka = listaSastojaka;
		this.kolicina = kolicina;		
		
	}
	public void dodajSastojak(Sastojak s, int kolicina) {
		listaSastojaka.add(kolicina, s);		
	}
	
	public String getNazivJela() {
		return nazivJela;
	}
	public void setNazivJela(String nazivJela) {
		this.nazivJela = nazivJela;
	}
	public List<Sastojak> getListaSastojaka() {
		return listaSastojaka;
	}		
	public double getKolicina() {
		return kolicina;
	}
	public void setKolicina(double kolicina) {
		this.kolicina = kolicina;
	}
	
	
	
}
