package klase2Dogadjaj;



public class Event {

// Napraviti klasu Event koja sadrzi podatke o vremenu, dvorani u kojoj se dogadjaj organizuje i tip (koncert, utakmica, vencanje…)
	
	private double vreme;
	private Dvorana dvorana;
	private String tipDogadjaja;
	
	public Event(double vreme, Dvorana dvorana, String tipDogadjaja) {
		super();
		this.vreme = vreme;
		this.dvorana = dvorana;
		this.tipDogadjaja = tipDogadjaja;
	}
		
		public Event(double vreme, String tipDogadjaja) {		
		this.vreme = vreme;
		this.tipDogadjaja = tipDogadjaja;
	}
		

	public double getVreme() {
		return vreme;
	}

	public void setVreme(double vreme) {
		this.vreme = vreme;
	}

	public Dvorana getDvorana() {
		return dvorana;
	}

	public void setDvorana(Dvorana dvorana) {
		this.dvorana = dvorana;
	}

	public String getTipDogadjaja() {
		return tipDogadjaja;
	}

	public void setTipDogadjaja(String tipDogadjaja) {
		this.tipDogadjaja = tipDogadjaja;
	}
	
	
	}

	

