package Hackathon_Ex;

import java.util.Scanner;

public class Numeropais {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Insira um número de 1 a 5 e descubra o país correspondente: ");
		int numero = ler.nextInt();
		switch (numero) {
		case 1:
			System.out.println("Brasil");
			break;
		case 2:
			System.out.println("Argentina");
			break;
		case 3:
			System.out.println("Chile");
			break;
		case 4:
			System.out.println("Peru");
			break;
		case 5:
			System.out.println("Uruguai");
			break;
		default:
			System.out.println("Número inválido");

		}
	}

}
