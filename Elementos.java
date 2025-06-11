package Hackathon_Ex;

import java.util.Scanner;

public class Elementos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe um número para identificar o respectivo elemento: ");
		int numero = ler.nextInt();
		switch (numero) {

		case 1:
			System.out.println("Fogo");
			break;
		case 2:
			System.out.println("Água");
			break;
		case 3:
			System.out.println("Planta");
			break;
		default:
			System.out.println("Tipo desconhecido");
			break;
		}

	}

}
