package clase;

import java.util.Comparator;

public class Corn extends Produs implements Comparable<Corn> {
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
	@Override
	public int compareTo(Corn corn) {
		return Comparator.comparing(Corn::getNume)
	              .thenComparing(Corn::getPret)
	              .thenComparing(Corn::getUmplutura)
	              .thenComparingInt(Corn::getCantitate)
	              .compare(this, corn);
	}

}
