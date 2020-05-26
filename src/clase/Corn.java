package clase;

public class Corn extends Produs {
	private String umplutura;
	
	public Corn(int cantitate,float pret, String nume,String umplutura) {
		super(cantitate, pret, nume);
		this.umplutura=umplutura;
		// TODO Auto-generated constructor stub
	}
	public String getUmplutura() {
		return umplutura;
	}
	public void setUmplutura(String umplutura) {
		this.umplutura = umplutura;
	}

}
