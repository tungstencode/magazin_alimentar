package clase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
	
	public void adaugaProdus(String numeClient, String tipProdus){
		String[] split;
		BufferedReader buffer =  new BufferedReader(new InputStreamReader(System.in)); 
		String produsString="";
		switch(tipProdus) 
        { 
            case "ciocolata": 
                System.out.println("<pret> <cantitate> <numeProdus> <kCal>"); 
			try {
				while((produsString = buffer.readLine()) != null){
                	split = produsString.split("\\s+");
                }
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
                break; 
            case "paine": 
                System.out.println("<pret> <cantitate> <numeProdus> <dataExpirare>"); 
			try {
				while((produsString = buffer.readLine()) != null){
                	split = produsString.split("\\s+");
                }
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
                break; 
            case "corn": 
                System.out.println("<pret> <cantitate> <numeProdus> <umplutura>"); 
			try {
				while((produsString = buffer.readLine()) != null){
                	split = produsString.split("\\s+");
                	float pret =Float.parseFloat(split[0]);
                	int cantitate= Integer.parseInt(split[1]);
                	String nume=split[2];
                	String umplutura=split[3];
                	if(split.length>0) {
                		if(pret<0) {
                    		System.out.println("Pret incorect");
                    		break;
                    	}else if(cantitate<0){
                    		System.out.println("Cantitate incorecta");
                    		break;
                    	}else if(nume.isEmpty()) {
                    		System.out.println("Nume produs incorect");
                    		break;
                    	}else if(umplutura.isEmpty()) {
                    		System.out.println("Umplutura incorecta");
                    		break;
                    	}
                    	Corn corn=new Corn(cantitate, pret, nume, umplutura);
                    	for (Produs produs : magazin.stoc) {
                    		if(produs.getClass().equals(Corn.class)) {
                    			Corn cautat=(Corn)produs;
                    			System.out.println(cautat);
                    			System.err.println(corn);
//                    			if(corn.getNume()==cautat.getNume() && corn.getCantitate()==cautat.getCantitate()) {
//                    				System.out.println("Gasit");
//                    			}
                    		}
						}
                    	break;
                	}
                }
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                break; 
            default: 
                System.out.println("Nu exista acest tip de produs"); 
        } 
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
			List<Produs> cosList=new ArrayList<Produs>();
			magazin.cosuri.put(client, cosList);
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
		try {
			if(clientOptional.get()!=null) {
				List<Produs> cos = magazin.cosuri.get(clientOptional.get());
				if(cos.size()<1) {
					System.out.println(clientString+" nu are produse in cos.");
				}else {
					cos.forEach(produs-> System.out.println(produs.getNume()));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void stergeCosClient(String clientString) {
		Optional<Client> clientOptional = magazin.clienti.stream().filter(c -> c.getNume().equals(clientString)).findAny();
		try {
			if(clientOptional.get()!=null) {
				List<Produs> cos = magazin.cosuri.get(clientOptional.get());
				cos.removeAll(cos);
				System.out.println("Toate produsele au fost sterse");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
