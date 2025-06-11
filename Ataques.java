package Hackathon_Ex;

import java.util.Scanner;

public class Ataques {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe um número para identificar o respectivo ataque: ");
		int numero = ler.nextInt();
		switch (numero) {

		case 1:
			System.out.println("Investida");
			break;
		case 2:
			System.out.println("Rajada de fumaça");
			break;
		case 3:
			System.out.println("Choque do trovão");
			break;
		default:
			System.out.println("Hidro bomba");
			break;

		}
	}
}
