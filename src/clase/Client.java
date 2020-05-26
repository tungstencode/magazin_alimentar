package clase;

import java.util.List;

public class Client {
	private String nume;
	
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
}
