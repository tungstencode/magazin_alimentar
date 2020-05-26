

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import clase.Ciocolata;
import clase.Corn;
import clase.Magazin;
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
		
		BufferedReader buffer =  new BufferedReader(new InputStreamReader(System.in)); 
		String command="";
		
		System.out.println("Program started.");
		
		try {
			while((command = buffer.readLine()) != null){
				if(command.contains("EXIT")) {
					System.out.println("Program finished.");
					break;
				}
				System.out.println(command);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
