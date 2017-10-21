package Polaznici;

public class Osoba {
	private String ime, prezime;
	private long jmbg;
	
	Osoba(){}
	
	public Osoba(String ime, String prezime, long jmbg) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public long getJmbg() {
		return jmbg;
	}

	public void setJmbg(long jmbg) {
		this.jmbg = jmbg;
	}
	
	@Override public String toString() {
		return("Ime: " + this.getIme() + " Prezime: " + this.getPrezime() + " JMBG: " + this.getJmbg());
	}
}
