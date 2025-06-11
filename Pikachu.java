package Hackathon_Ex;

import java.util.Scanner;

public class Pikachu {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o nome do seu pokemon: ");
		String pokemon = ler.nextLine();
		System.out.println(pokemon.equalsIgnoreCase("pikachu") ? "Pokemon popular" : "outro Pokemon");

	}

}
