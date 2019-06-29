package planinarenje;

public class Alpinista extends Planinar {
	Alpinista partner;

	public Alpinista getPartner() {
		return partner;
	}

	public void setPartner(Alpinista partner) {
		this.partner = partner;
	}

	public Alpinista(String ime, String prezime, Planina planina) {
		super(ime, prezime, planina);
		
	}

	@Override
	public boolean penjanje() {
		if (this.getPlanina().getVisina()< 3000 || this.partner==null) {
			return false;
		} else {
			return true;
		}
	}


	@Override
	public String toString() {
		return vPlaninara() + super.toString();
	}

	@Override
	public String vPlaninara() {
		// TODO Auto-generated method stub
		return "A_";
	}

}