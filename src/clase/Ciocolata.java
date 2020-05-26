package clase;

public class Ciocolata extends Produs {
	public int numarKCalorii;
	
	public Ciocolata(int cantitate,float pret, String nume, int numarKCalorii) {
		super(cantitate, pret, nume);
		this.numarKCalorii=numarKCalorii;
		// TODO Auto-generated constructor stub
	}
	public int getNumarKCalorii() {
		return numarKCalorii;
	}
	public void setNumarKCalorii(int numarKCalorii) {
		this.numarKCalorii = numarKCalorii;
	}

}
