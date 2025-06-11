package Hackathon_Ex;

import java.util.Scanner;

public class Paises {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o nome de um país para descobrir o continente: ");
		String paises = ler.nextLine().toLowerCase();

		switch (paises) {

		case "brasil", "argentina", "peru":
			System.out.println("É um país da América do sul!");
			break;
		case "frança", "alemanha":
			System.out.println("É um país da Europa!");
			break;
		case "china", "japão":
			System.out.println("É um país da Ásia!");
			break;
		case "egito", "nigeria":
			System.out.println("É um país da África!");
			break;
		default:
			System.out.println("País não cadastrado no sistema, tente novamente");
		}

	}

}
