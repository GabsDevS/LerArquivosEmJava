package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String pasta = "C:\\Users\\Gabriel\\ws-eclipse\\LeituraDeArquivos\\ler.txt";
		
		FileReader file = null;
		BufferedReader br = null;
		
		try {
			file = new FileReader(pasta);
			br = new BufferedReader(file);
			
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		}
		catch(IOException e) {
			System.out.println("Error " + e.getMessage());
		}

	}

}
