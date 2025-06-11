package Hackathon_Ex;

import java.util.Scanner;

public class Nivel_Treinador {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe seu nível de treinador: ");
		int nivel = ler.nextInt();
		if (nivel < 10 && nivel > 0) {
			System.out.println("Jogador Iniciante");
		} else if (nivel > 10 && nivel < 30) {
			System.out.println("Jogador Intermediário");
		} else {
			System.out.println("Jogador Experiente");
		}
	}
}
