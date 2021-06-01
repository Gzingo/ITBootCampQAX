package klaseNasledjivanje;

public class Sisari extends Zivotinje{
	
	//Sisari su kicmenjaci koje se razlikuju po boji dlake i po broju nogu.


	public int brojNogu;
	public String bojaDlake;
	
		public Sisari(String vrsta, String naziv, String hrana, int brojNogu, String bojaDlake) {
		super(vrsta, naziv, hrana);
		this.brojNogu = brojNogu;
		this.bojaDlake = bojaDlake;
	}

		public int getBrojNogu() {
			return brojNogu;
		}

		public void setBrojNogu(int brojNogu) {
			this.brojNogu = brojNogu;
		}

		public String getBojaDlake() {
			return bojaDlake;
		}

		public void setBojaDlake(String bojaDlake) {
			this.bojaDlake = bojaDlake;
		}
		

}
