package Hackathon_Ex;

import java.util.Scanner;

public class Continente {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira o nome de um continente: ");
		String continente = ler.nextLine();
		if (continente.equals("america do sul")
			    || continente.equals("america do norte")
			    || continente.equals("america central")) {
			System.out.println("É um continente da américa");}
			
		else {
				System.out.println("Não é um continente da américa");
			}
	}
		
	

}

