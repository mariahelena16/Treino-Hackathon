package Hackathon_Ex;

import java.util.Scanner;

public class Maisforte {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int nivel, nivel2;

		System.out.print("Insira o nível de seu 1 pokemon: ");
		nivel = ler.nextInt();
		System.out.print("Insira o nível de seu 2 pokemon: ");
		nivel2 = ler.nextInt();
		if (nivel == nivel2) {
			System.out.println("São iguais");
		} else if (nivel > nivel2) {
			System.out.println("O nível do 1 é maior");
		} else if (nivel2 > nivel) {
			System.out.println("O nível do 2 é maior");
		}
	}
}
