package Polaznici;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spisak polaznici = new Spisak();
		
		polaznici.ucitajListu("spisak.txt");
		polaznici.stampajListu();
		polaznici.sortirajListu();
		polaznici.stampajListu();
		polaznici.upisiListu("uredjeniSpisak.txt");
	}

}
