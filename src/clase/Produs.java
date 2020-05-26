package clase;

public class Produs {
	private int cantitate;
	private float pret;
	private String nume;
	
	public Produs(int cantitate,float pret,String nume) {
		super();
		this.cantitate = cantitate;
		this.pret=pret;
		this.nume=nume;
	}

	public float getPret() {
		return pret;
	}

	public void setPret(float pret) {
		this.pret = pret;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getCantitate() {
		return cantitate;
	}

	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}

	@Override
	public String toString() {
		return this.cantitate+"x"+this.nume+" costa "+this.pret+" si mai sunt "+this.cantitate;
	}
}


