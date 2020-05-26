package clase;

public class Paine extends Produs {
	private String dataExpirare;
	
	public Paine(int cantitate,float pret, String nume, String dataExpirare) {
		super(cantitate, pret, nume);
		this.dataExpirare=dataExpirare;
		// TODO Auto-generated constructor stub
	}
	public String getDataExpirare() {
		return dataExpirare;
	}
	public void setDataExpirare(String dataExpirare) {
		this.dataExpirare = dataExpirare;
	}

}
