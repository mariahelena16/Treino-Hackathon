package Hackathon_Ex;

import java.util.Scanner;

public class Hemisferio {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("*Leitor de Latitude*");
		System.out.println("\nPara saber a qual hemisfério a latitude pertence, insira: ");
		System.out.print("\nLatitude: ");
		int latitude = ler.nextInt();
		
		System.out.println ( latitude < 0 ? "Pertence ao Hemisfério sul!": " Pertence ao Hemisfério Norte");
		
		

	}

}
