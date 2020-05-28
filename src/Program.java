

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import clase.Ciocolata;
import clase.Corn;
import clase.Magazin;
import clase.MagazinService;
import clase.Paine;
import clase.Produs;

public class Program {

	public static void main(String[] args) {
		List<Produs> stoc = new ArrayList<Produs>();
		
		Ciocolata milka = new Ciocolata(20, (float) 12.99, "Milka White", 500);
		Paine feliata = new Paine(50, (float) 1.39, "Feliata", "20-05-2020");
		Corn choco = new Corn(10, (float)3, "Choco", "ciocolata");
		
		stoc.add(milka);
		stoc.add(feliata);
		stoc.add(choco);
		
		
		Magazin magazin = new Magazin(stoc);
		
		MagazinService magazinService=new MagazinService(magazin);
		
		magazinService.adaugaClient("Alex");
		
		BufferedReader buffer =  new BufferedReader(new InputStreamReader(System.in)); 
		String command="";
		
		System.out.println("Program started.");
		
		try {
			while((command = buffer.readLine()) != null){
				String[] split;
				if(command.contains("EXIT")) {
					System.out.println("Program finished.");
					break;
				}
				
				if(command.contains("ADAUGA_CLIENT")) {
					try {
						split = command.split("\\s+");
						magazinService.adaugaClient(split[1]);
						
					} catch (Exception e) {
						System.out.println("Comanda incorecta, structura este: ADAUGA_CLIENT <nume>");
					}
				}else if(command.contains("ADAUGA_PRODUS")) {
					split = command.split("\\s+");
					try {
						magazinService.adaugaProdus(split[1], split[2]);
						
					} catch (Exception e) {
						System.out.println("Comanda incorecta, structura este: ADAUGA_PRODUS <numeClient> <tipProdus>");
					}
				} else if(command.contains("AFISARE_COMPLETA")) {
					magazinService.afisareCompleta();
				}else if(command.contains("AFISARE_COS")) {
					try {
						split = command.split("\\s+");
						magazinService.afisareCos(split[1]);
						
					} catch (Exception e) {
						System.out.println("Comanda incorecta, structura este: AFISARE_COS <numeClient>");
					}
				}else if(command.contains("STERGE_TOATE_PRODUSELE")) {
					try {
						split = command.split("\\s+");
						magazinService.stergeCosClient(split[1]);
						
					} catch (Exception e) {
						System.out.println("Comanda incorecta, structura este: STERGE_TOATE_PRODUSELE <numeClient>");
					}
				}else if(command.contains("EXIT")) {
					try {
						split = command.split("\\s+");
						
						
					} catch (Exception e) {
						System.out.println("Comanda incorecta, structura este: ADAUGA_PRODUS <numeClient> <tipProdus>");
					}
				}else if(command.contains("EXIT")) {
					System.out.println("Program finished.");
					break;
				}else if(command.contains("EXIT")) {
					System.out.println("Program finished.");
					break;
				}else {
					System.out.println("Comanda nu exista");
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
