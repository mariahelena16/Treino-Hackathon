package Hackathon_Ex;

import java.util.Scanner;

public class Lendario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("O pokemon pikachu é lendário? ");
		String resposta = ler.nextLine();
		System.out.println(resposta.equalsIgnoreCase("sim") ? "Extremamente raro" : "Comum");

	}

}
