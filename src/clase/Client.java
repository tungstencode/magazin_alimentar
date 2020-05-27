package clase;

import java.util.List;

public class Client implements Comparable<Client> {
	private String nume;
	
	public Client(String nume) {
		super();
		this.nume = nume;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	@Override
	public String toString() {
		return this.nume;
	}
	
	@Override
	  public int compareTo(Client c) {
	    if (getNume() == null || c.getNume() == null) {
	      return 0;
	    }
	    return getNume().compareTo(c.getNume());
	  }
}
