package zadatak2;

public class Stajling extends Stvar{
	/*
	 * Stajling sadrzi ime kreatora, jedan par obuce i jedan ili vise odevnih predmeta. Prilikom kreiranja stajlinga prosledjuje se samo 
	 * ime kreatora. Moguce je postaviti, dohvatiti i izbaciti obucu, kao i dohvatiti sve odevne predmete, dodati neki odevni predmet, 
	 * kao i ukloniti odevni predmet sa neke pozicije. Odevni predmeti dodaju se pojedinacno, a ne vise njih odjednom. Tekstualni opis je 
	 * kreator - oznaka stajlinga – ukupna cena stajlinga. Oznaka stajling je “z” ukoliko ima vise zenskih stvari, “m” ukoliko ima vise 
	 * muskih stvari ili “u” ukoliko ima jednak broj muskih I zenskih stvari ili su sve stvari unisex
	 */
	
	private String imeKreatora;
	private Obuca obuca;
	private Odeca odPredmet;
	private char oznaka;
	private double ukupnaCena;
	
	public Stajling(String naziv, double cena, int velicina, char kolekcija, String imeKreatora, Obuca obuca, Odeca odPredmet, char oznaka, double ukupnaCena) {
		super(naziv, cena, velicina, kolekcija);
		this.imeKreatora = imeKreatora;
		this.obuca = obuca;
		this.odPredmet = odPredmet;
		this.oznaka = oznaka;
		this.ukupnaCena = ukupnaCena;
	}		
	
	public String getImeKreatora() {
		return imeKreatora;
	}
	
	public double getUkupnaCena() {
		return ukupnaCena;
	}

	public char getOznaka() {
		return oznaka;
	}

	public Obuca getObuca() {
		return obuca;
	}

	public void setObuca(Obuca obuca) {
		this.obuca = obuca;
	}

	public Odeca getOdPredmet() {
		return odPredmet;
	}

	public void setOdPredmet(Odeca odPredmet) {
		this.odPredmet = odPredmet;
	}

	public static void kreator (char oznaka, Obuca obuca, Odeca odPredmet, double ukupnaCena) {
		
		int brOdPredmeta = 20;
		for (int i = 0; i < brOdPredmeta; i ++) {
			ukupnaCena += i;			
		}
	}
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getImeKreatora());
		sb.append(" - ");
		sb.append(getOznaka());
		sb.append(" - ");
		sb.append(getUkupnaCena());		
		sb.append(" RSD");
		return sb.toString();
	}
	

}
