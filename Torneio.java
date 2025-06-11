package Hackathon_Ex;

import java.util.Scanner;

public class Torneio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("TORNEIO POKEMON");
		System.out.println("\nPara participar insira as informações abaixo: ");
		System.out.println("Sua idade: ");
		int idade = ler.nextInt();
		System.out.println("Nível de seu pokemon: ");
		int nivel = ler.nextInt();
		if (idade >= 12 && nivel >= 20) {
			System.out.println("Seja bem-vindo ao torneio!");
		} else {
			System.out.println("Suas informações foram negadas!");
		}
	}

}
