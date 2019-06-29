package planinarenje;

import java.util.ArrayList;
import java.util.List;

public class Planina {
	private String ime;
	private int visina;
	private ArrayList<Planinar> list;

	public Planina(String ime, int visina) {
		this.ime = ime;
		this.visina = visina;
		this.list = new ArrayList<Planinar>();
	}

	public String getIme() {
		return ime;
	}

	public int getVisina() {
		return visina;
	}

	public boolean dodajPlaninara(Planinar p) {
		if(list.contains(p))return false;
		list.add(p);
		return true;
	}

	public void ukloniPlaninara(Planinar p) {
		list.remove(p);
	}

	@Override
	public String toString() {
		return getIme() + "(" + getVisina() + ")";
	}

	public String ispis() {
		String s = "";
		for (Planinar planinar : list) {
			s += planinar + "\n";
		}
		return s;
	}
}