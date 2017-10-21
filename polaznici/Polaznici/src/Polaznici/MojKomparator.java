package Polaznici;
	import java.util.*;
public class MojKomparator implements Comparator<Osoba> {
	
	@Override public int compare(Osoba o1, Osoba o2) {
		if(o1.getJmbg() > o2.getJmbg()) {
			return -1;
		}
		else if(o1.getJmbg() < o2.getJmbg()) {
			return 1;
		}
		return 0;
	}
}
