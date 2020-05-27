package clase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class MagazinService {
	Magazin magazin;

	public MagazinService(Magazin magazin) {
		super();
		this.magazin = magazin;
	}
	
	public void adaugaProdus(String numeClient, String tipProdus) {
		System.out.println(numeClient+tipProdus);
	}
	
	public void adaugaClient(String nume) {
		System.out.println(nume);
		boolean found=false;
		for(Client client : magazin.clienti) {
			if(client.getNume().equals(nume)) {
				System.out.println("Clientul exista deja");
				found=true;
				break;
			}
		}
		if(!found) {
			Client client=new Client(nume);
			magazin.clienti.add(client);
			System.out.println("Client adaugat! - "+client.getNume());
		}
	}
	
	public void afisareCompleta() {
		Collections.sort(magazin.clienti);
		for(Client client : magazin.clienti) {
			System.out.println(client);
		}
	}
	
	public void afisareCos(String clientString) {
		Optional<Client> clientOptional = magazin.clienti.stream().filter(c -> c.getNume().equals(clientString)).findAny();
		System.out.println(clientOptional.get().getNume());
		try {
			if(clientOptional.get()!=null) {
				List<Produs> cos = magazin.cosuri.get(clientOptional.get());
				if(cos.isEmpty()) {
					System.out.println(clientString+" nu are produse in cos.");
				}else {
					cos.forEach(produs-> System.out.println(produs.getNume()));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
