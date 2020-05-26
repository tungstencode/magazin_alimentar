package clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Magazin {
	List<Client> clienti= new ArrayList<Client>();
	List<Produs> stoc= new ArrayList<Produs>();
	Map<Client, List> cosuri = new HashMap<>();
	
	
	public Magazin(List<Produs> stoc) {
		super();
		this.stoc = stoc;
	}
	
	public Magazin(List<Client> clienti, List<Produs> stoc, Map<Client, List> cosuri) {
		super();
		this.clienti = clienti;
		this.stoc = stoc;
		this.cosuri = cosuri;
	}

	public List<Client> getClienti() {
		return clienti;
	}
	public void setClienti(List<Client> clienti) {
		this.clienti = clienti;
	}
	public List<Produs> getProduse() {
		return stoc;
	}
	public void setProduse(List<Produs> stoc) {
		this.stoc = stoc;
	}
	public Map<Client, List> getCosuri() {
		return cosuri;
	}
	public void setCosuri(Map<Client, List> cosuri) {
		this.cosuri = cosuri;
	}
	
	
}
