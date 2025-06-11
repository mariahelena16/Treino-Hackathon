package Hackathon_Ex;

import java.util.Scanner;

public class Regiao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Insira o nome de um pokemon: ");
		String nome = ler.nextLine();
		switch (nome.toLowerCase()) {
		case "bulbasaur":
			System.out.println("Seu pokemon vive no Kanto");
			break;
		case "chimchar":
			System.out.println("Seu pokemon vive em Sinnoh");
			break;
		case "torchic":
			System.out.println("Seu pokemon vive em Hoenn");
			break;
		default:
			System.out.println("Seu pokemon vive em uma região desconhecida");
			break;
		}
	}

}
