package planinarenje;

public abstract class kPlaninar extends Planinar {
	private int kPlaninar;
	public kPlaninar(String ime, String prezime, Planina planina) {
		super(ime, prezime,planina);
	}

	public int getkPlaninar() {
		return kPlaninar;
	}

	public void setkPlaninar(int kPlaninar) {
		this.kPlaninar = kPlaninar;
	}

	@Override
	public boolean penjanje() {
		if (this.getPlanina().getVisina() < 2000) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String vPlaninara() {
		return "K_";
	}

	@Override
	public String toString() {
		return vPlaninara()+super.toString();
	}
	

}
