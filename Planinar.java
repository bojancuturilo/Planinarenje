package planinarenje;

public abstract class Planinar {

	private String ime, prezime;
	private int id;
	private static int idglobal = 0;
	private Planina planina;

	public Planina getPlanina() {
		return planina;
	}

	public void setPlanina(Planina planina) {
		this.planina = planina;
	}

	public Planinar(String ime, String prezime,Planina planina) {
		this.ime = ime;
		this.prezime = prezime;
		this.planina = planina;
		this.id = ++idglobal;
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

	public int getId() {
		return id;
	}

	public abstract boolean penjanje();

	public abstract String vPlaninara();

	@Override
	public String toString() {
		return "Planinar " + this.ime + "-" + this.id;
	}

}
